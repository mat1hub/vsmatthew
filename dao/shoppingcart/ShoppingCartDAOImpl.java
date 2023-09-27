package dao.shoppingcart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import control.ConnectionUtility;
import dao.product.ProductDto;
import dao.shoppingcart.ShoppingCartDTO;
import service.ShoppingCartServiceImpl;

public class ShoppingCartDAOImpl implements ShoppingCartDAO,Comparable<ShoppingCartDAO>{
	private ShoppingCartDAOImpl() {
		System.out.println("ShoppingCart DAO impl object created...");
		
	}
	
	private static ShoppingCartDAOImpl cs;
	
	synchronized public static ShoppingCartDAOImpl getServiceImpl() {
		if(cs==null) {
			cs=new ShoppingCartDAOImpl();
			return cs;
		}
		else {
			return cs.createClone();
		}
	}
	private ShoppingCartDAOImpl createClone() {
		try {
			return (ShoppingCartDAOImpl)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public ShoppingCartDTO findByProductCode(String productcode) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from products where productCode=?");
			ps.setString(1, productcode);
			ResultSet rs=ps.executeQuery();
			ShoppingCartDTO dto=new ShoppingCartDTO();
			if(rs.next()) {
				dto.setCustomerid(rs.getInt(2));
				dto.setShoppingcartid(rs.getInt(1));
				dto.setProductcode(rs.getString(3));
				dto.setIsactive(rs.getInt(4));
				dto.setLastupdated(rs.getDate(5));
			
			}
			ConnectionUtility.closeConnection(null, null);
			return dto;			
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return null;
		}
	}

	@Override
	public List<ShoppingCartDTO> findAll() {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from shoppingcart where productCode=?");
			
			ResultSet rs=ps.executeQuery();
			List<ShoppingCartDTO> list =new ArrayList<>();
			while(rs.next()) {
				ShoppingCartDTO dto=new ShoppingCartDTO();
				dto.setCustomerid(rs.getInt(2));
				dto.setShoppingcartid(rs.getInt(1));
				dto.setProductcode(rs.getString(3));
				dto.setIsactive(rs.getInt(4));
				dto.setLastupdated(rs.getDate(5));
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
	public ShoppingCartDTO findByCustomerId(int customerid) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from shoppingcart where customerid=?");
			ps.setInt(1, customerid);
			ResultSet rs=ps.executeQuery();
			ShoppingCartDTO dto=new ShoppingCartDTO();
			if(rs.next()) {
				dto.setCustomerid(rs.getInt(2));
				dto.setShoppingcartid(rs.getInt(1));
				dto.setProductcode(rs.getString(3));
				dto.setIsactive(rs.getInt(4));
				dto.setLastupdated(rs.getDate(5));
			
			}
			ConnectionUtility.closeConnection(null, null);
			return dto;			
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return null;
		}
	}

	@Override
	public int insertProduct(ShoppingCartDTO insert) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("insert into shoppingcart values (?,?,?,?)");
			ps.setInt(1, insert.getShoppingcartid());
			ps.setInt(2, insert.getCustomerid());
			ps.setString(3, insert.getProductcode());
			ps.setInt(4, insert.getIsactive());
			ps.setDate(5, insert.getLastupdated());
			ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		return 1;
	}

	@Override
	public int updateProduct(ShoppingCartDTO update) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("select * from shoppingcart where shoppingcartid=?");
			ps.setInt(1, update.getShoppingcartid());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ps=con.prepareStatement("update shoppingcart set customerid=?, productcode=?, isactive=? , lastupdated =? , where shoppingcartid=?");
				ps.setInt(2, update.getCustomerid());
				ps.setInt(1, update.getShoppingcartid());
				ps.setString(3, update.getProductcode());
				ps.setInt(4, update.getIsactive());
				ps.setDate(5, update.getLastupdated());
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
	public int deleteProduct(ShoppingCartDTO delete) {
		PreparedStatement ps;
		try {
			Connection con=ConnectionUtility.getConnection();
			ps=con.prepareStatement("delete from shoppingcart where shoppingcartid=?");
			ps.setInt(1, delete.getShoppingcartid());
			ps.executeUpdate();
			ConnectionUtility.closeConnection(null, null);
		}catch(Exception e) {
			ConnectionUtility.closeConnection(e, null);
			return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		ShoppingCartDAO sdao =new ShoppingCartDAOImpl();
		ShoppingCartDTO sto= new ShoppingCartDTO();
		sto.setShoppingcartid(717);
		sto.setCustomerid(1123);
		sto.setProductcode("product code : 1234");
		sto.setIsactive(1);
		sdao.updateProduct(sto);
		sto=sdao.findByCustomerId(1123);
		List<ShoppingCartDTO> list =sdao.findAll();
		list.stream().forEach(System.out::println);
	}

	@Override
	public int compareTo(ShoppingCartDAO o) {
		
		return 0;
	}

}
