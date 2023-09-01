package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.InvoiceMasterDTO;

public class InvoiceMasterDAOImp implements InvoiceMasterDAO{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public InvoiceMasterDAOImp(Connection con) {
		this.con =con;
	}
	@Override
	public InvoiceMasterDTO findById(int id) throws SQLException {
	  ps =con.prepareStatement("select * from invoicemaster where invoiceid =?");
	  ps.setInt(1,id);
	  rs=ps.executeQuery();
	  InvoiceMasterDTO imt =new InvoiceMasterDTO();
	  if(rs.next()) {
		  imt.setInvoice_id(rs.getInt(1));
		  imt.setInvoiceDate(rs.getDate(2));
		  imt.setDiscount(rs.getInt(3));
	  }
	  
		return imt;
	}

	@Override
	public int updateInvoiceMaster(InvoiceMasterDTO cmd)  {
		try {
		ps =con.prepareStatement("update into invoicemaster set invoicedate=?,discount =? where invoiceid=?");
	    ps.setInt(1 ,cmd.getInvoice_id());
	    ps.setDate(2, cmd.getInvoiceDate());
	    ps.setInt(3, cmd.getDiscount());
		  int u=ps.executeUpdate();
		  con.close();
		  rs.close();
		return u;
	}
	catch(SQLException se) {
		se.printStackTrace();
	}
		return 0;
	}

	@Override
	public int deleteInvoiceMaster(int del)  {
		try {
		ps =con.prepareStatement("delete from invoicemaster where invoiceid =?");
		ps.setInt(1,del);
		int d =ps.executeUpdate();
		 con.close();
		  rs.close();
		return d;
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		return 0;
	}

	@Override
	public int addInvoiceMaster(InvoiceMasterDTO cmd)  {
		try {
		ps =con.prepareStatement("insert into invoicemaster values(?,?,?,?)");
		ps.setInt(1,cmd.getInvoice_id());
		ps.setDate(2, cmd.getInvoiceDate());
		ps.setInt(3, cmd.getDiscount());
		int a =ps.executeUpdate();
		con.close();
		rs.close();
		ps.close();
		return a;
		}
		catch(SQLException se) {
			se.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<InvoiceMasterDTO> findAll() {
		try {
		ps =con.prepareStatement("select * from invoicemaster");
		rs =ps.executeQuery();
		List<InvoiceMasterDTO> imd =new ArrayList<>();
		InvoiceMasterDTO imd2 =new InvoiceMasterDTO();
		while(rs.next()) {
			imd2.setInvoice_id(rs.getInt(1));
			imd2.setInvoiceDate(rs.getDate(2));
			imd2.setDiscount(rs.getInt(3));
			imd.add(imd2);
			 con.close();
			  rs.close();
			return imd;
		}
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		return null;
		
	}

}
