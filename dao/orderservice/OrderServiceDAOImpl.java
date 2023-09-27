package dao.orderservice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import control.ConnectionUtility;
import dao.customer.CustomerDAOImpl;
import dao.product.ProductDto;

public class OrderServiceDAOImpl implements OrderServiceDAO{
	
private static OrderServiceDAOImpl cs;
	
	synchronized public static OrderServiceDAOImpl getServiceImpl() {
		if(cs==null) {
			cs=new OrderServiceDAOImpl();
			return cs;
		}
		else {
			return cs.createClone();
		}
	}
	private OrderServiceDAOImpl createClone() {
		try {
			return (OrderServiceDAOImpl)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public List<OrderServiceDTO> findAll() {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from oderid");
			
			ResultSet rs=ps.executeQuery();
			List<OrderServiceDTO> list = new ArrayList<OrderServiceDTO>();
			while(rs.next()) {
				OrderServiceDTO dto=new OrderServiceDTO();
				dto.setOrderid(rs.getInt(1));
				dto.setShoppingcartid(rs.getInt(2));
				dto.setLastupdatedDate(rs.getDate(3));
				list.add(dto);
			}
			ConnectionUtility.closeConnection(null, null);
			return list;			
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return null;
		}

		
	}

	@Override
	public OrderServiceDTO findByOrderId(int pname) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from order where orderid=?");
			ps.setInt(1, pname);
			ResultSet rs=ps.executeQuery();
		      OrderServiceDTO dto=new OrderServiceDTO();
			if(rs.next()) {
				dto.setOrderid(rs.getInt(1));
				dto.setShoppingcartid(rs.getInt(2));
				dto.setLastupdatedDate(rs.getDate(3));
			}
			else {
				return null;
			}
			ConnectionUtility.closeConnection(null, null);
			return dto;			
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return null;
		}
		
	}

	@Override
	public int addOrder(OrderServiceDTO insert) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("insert into order values (?,?,?,?)");
			ps.setInt(1, insert.getOrderid());
			ps.setInt(2, insert.getShoppingcartid());
			ps.setDate(3, insert.getLastupdatedDate());
	
			ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		return 1;
	}

	@Override
	public int updateOrder(OrderServiceDTO update) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from order where orderid=?");
			ps.setInt(1, update.getOrderid());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update order set shoppingcartid=?, lastupdatedDate=?,  where orderid=?");
				ps.setInt(1, update.getOrderid());
				ps.setInt(2, update.getShoppingcartid());
				ps.setDate(3, update.getLastupdatedDate());
				ps.executeUpdate();
			}
			else {
				System.out.println("no record found to update....");
			}
			ConnectionUtility.closeConnection(null, null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		return 1;
		
	}

	@Override
	public int deleteOrder(OrderServiceDTO delete) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("delete from order where orderid=?");
			ps.setInt(1, delete.getOrderid());
			ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		return 1;
	}

}
