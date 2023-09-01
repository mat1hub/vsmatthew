package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.CustomerMasterDTO;

public class CustomerMasterImp implements CustomerMasterDAO{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
     public CustomerMasterImp(Connection con) {
            this.con=con;
     }
	@Override
	public CustomerMasterDTO findByName(String name)  {
		try {
		ps =con.prepareStatement("select * from customermaster where cid =?");
		ps.setString(1, name);
		rs=ps.executeQuery();
		CustomerMasterDTO cmt =new CustomerMasterDTO();
		if(rs.next()) {
		cmt.setC_name(rs.getString(1));
		cmt.setC_id(rs.getInt(2));
		cmt.setC_add(rs.getString(3));
		}
		else {
			rs.close();
			ps.close();
		}
		return cmt;
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		return null;
	}
	@Override
	public int updateCustomerMaster(CustomerMasterDTO cmd)  {
		try {
			ps =con.prepareStatement("update into customermaster set c_name=?,c_add=? where cid=?");
			ps.setString(1, cmd.getC_name());
			ps.setString(2, cmd.getC_add());
			ps.setInt(3, cmd.getC_id());
			int r =ps.executeUpdate();
			con.close();
			rs.close();
			ps.close();
			return r;
		}
		catch(SQLException se) {
			se.printStackTrace();
			return 0;
			
		}
		
		
	}

	@Override
	public int deleteCustomerMaster(int del) throws SQLException {
		try {
		ps=con.prepareStatement("delete from customermaster where cid=?");
		ps.setInt(1,del);
		int d =ps.executeUpdate();
		return d;
		}
		catch(SQLException dcm) {
			dcm.printStackTrace();
			return 0;
		}
	}

	@Override
	public int addCustomerMaster(CustomerMasterDTO cmd)  {
		try {
		ps=con.prepareStatement("insert into customermaster values(?,?,?,?)");
		ps.setInt(1,cmd.getC_id());
		ps.setString(2, cmd.getC_name());
		ps.setString(3, cmd.getC_add());
		ps.setLong(4, cmd.getC_telephone());
		int a =ps.executeUpdate();
		return a;
		}
		catch(SQLException se ) {
			se.printStackTrace();
			return 0;
		}
	}
	@Override
	public List<CustomerMasterDTO> findAll() throws SQLException  {
		ps=con.prepareStatement("select * from customermaster");
		ResultSet rs1 =ps.executeQuery();
		List<CustomerMasterDTO> lct =new ArrayList<CustomerMasterDTO>();
		while(rs1.next()) {
		   CustomerMasterDTO cmto  =new CustomerMasterDTO();
		   cmto.setC_id(rs1.getInt(1));
		   cmto.setC_name(rs1.getString(2));
		   cmto.setC_add(rs1.getString(3));
		   cmto.setC_telephone(rs1.getLong(4));
		   lct.add(cmto);
		}
		return lct;
	}

}
