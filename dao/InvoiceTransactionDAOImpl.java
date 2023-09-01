package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import dto.InvoiceTransaction;
import dto.InvoiceTransactionDTO;

public class InvoiceTransactionDAOImpl implements InvoiceTransactionDAO {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
    public InvoiceTransactionDAOImpl(Connection con) {
    	this.con=con;
    }
	public InvoiceTransactionDTO findById(int id) throws SQLException {
		try {
		ps=con.prepareStatement("select * from invoicetransaction where invoiceid=?");
		ps.setInt(1, id);
		rs=ps.executeQuery();
		InvoiceTransactionDTO it =new InvoiceTransactionDTO();
		if(rs.next()) {
			it.setInvoice_id(rs.getInt(1));
			it.setItem_id(rs.getInt(2));
			it.setQty(rs.getInt(3));
		}
		return it;
		}
		catch(SQLException se) {
			se.printStackTrace();
			return null;
		}
			
	}

	@Override
	public int updateInvoiceTransaction(InvoiceTransactionDTO uit) {
		try {
		ps =con.prepareStatement("update into invoicetransaction set itemid=?,quantity=? where invoiceid=?");
		ps.setInt(1,uit.getItem_id());
		ps.setInt(2,uit.getQty());
		ps.setInt(3, uit.getInvoice_id());
		int u=ps.executeUpdate();
		return u;
		}
		catch(SQLException se) {
			se.printStackTrace();
			return 0;
		}
	}

	@Override
	public int deleteInvoiceTransaction(int del) {
		try {
		ps =con.prepareStatement("delete from invoicetransaction where invoiceid=?");
		ps.setInt(1, del);
		int d =ps.executeUpdate();
		con.close();
		rs.close();
		ps.close();
		return d;
		}
		catch(SQLException se) {
			se.printStackTrace();
			return 0;
		}
	}

	@Override
	public int addInvoiceTransaction(InvoiceTransactionDTO itc) {
		try {
		ps=con.prepareStatement("insert into invoicetransaction values(?,?,?)");
		ps.setInt(1,itc.getInvoice_id() );
		ps.setInt(2, itc.getItem_id());
		ps.setInt(3, itc.getQty());
		int a =ps.executeUpdate();
		return a;
		}
		catch(SQLException es) {
			es.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<InvoiceTransactionDTO> findAll() {
		try {
		ps=con.prepareStatement("select * from invoicetransaction");
		rs=ps.executeQuery();
		InvoiceTransactionDTO ida = new InvoiceTransactionDTO();
		List<InvoiceTransactionDTO> lDao= new ArrayList<>();
		while(rs.next()) {
			ida.setInvoice_id(rs.getInt(1));
			ida.setItem_id(rs.getInt(2));
			ida.setQty(rs.getInt(3));
			lDao.add(ida);
			return lDao;
		}
		
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		return null;
	}
	

}
