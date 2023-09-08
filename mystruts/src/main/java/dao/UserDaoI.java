package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.UserDto;

public class UserDaoI implements UserDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
       public UserDaoI(Connection con) {
    	   this.con =con;
       }
	@Override
	public UserDto findbymobileno(String mobileno) throws Exception {
		ps =con.prepareStatement("select * from user where phoneNumber=?");
		ps.setString(1, mobileno);
		rs=ps.executeQuery();
		UserDto ud =new UserDto();
		while(rs.next()) {
		ud.setUsername(rs.getString(1));
		ud.setPhoneNumber(rs.getString(2));
		ud.setPassword(rs.getString(3));
		ud.setEmailId(rs.getString(4));
		}
		con.close();
		rs.close();
		ps.close();
		return ud;
	}
	@Override
	public UserDto findbyusername(String username) throws SQLException {
		ps =con.prepareStatement("select password from user where username=?");
		ps.setString(1, username);
		rs =ps.executeQuery();
		UserDto ut =new UserDto();
		while(rs.next()) {
			ut.setUsername(rs.getString(1));
			ut.setPhoneNumber(rs.getString(2));
			ut.setPassword(rs.getString(3));
			ut.setEmailId(rs.getString(4));
		}
		con.close();
		ps.close();
		rs.close();
		return ut;
	}
	@Override
	public int createUser(UserDto ud) throws Exception {
		ps =con.prepareStatement("insert into user values(?,?,?,?)");
		ps.setString(1, ud.getUsername());
		ps.setString(2,ud.getPassword());
		ps.setString(3, ud.getEmailId());
		ps.setString(4,ud.getPhoneNumber());
		int a =ps.executeUpdate();
		UserDto ut =new UserDto();
			ut.setUsername(rs.getString(1));
			ut.setPhoneNumber(rs.getString(2));
			ut.setPassword(rs.getString(3));
			ut.setEmailId(rs.getString(4));
			return a;
	
		
	}
	@Override
	public int updateuser(UserDto ud) throws Exception {
		ps =con.prepareStatement("update into user set username=? ,password=?, emailId=? ,phoneNumber=?");
		ps.setString(1, ud.getUsername());
		ps.setString(2, ud.getPhoneNumber());
		ps.setString(3 ,ud.getPassword());
		ps.setString(4, ud.getEmailId());
		int u =ps.executeUpdate();
		con.close();
		ps.close();
		rs.close();
		return u;
	}
	@Override
	public int deleteuserbymobileno(String mobileno) throws Exception {
		ps =con.prepareStatement("delete from user where phoneNumber=?");
		ps.setString(1, mobileno);
		int m = ps.executeUpdate();
		con.close();
		ps.close();
		rs.close();
		return m;
	}

	@Override
	public int deleteuserbyusername(String username) throws Exception {
		ps =con.prepareStatement("delete from user where phoneNumber=?");
		ps.setString(1, username);
		int m = ps.executeUpdate();
		con.close();
		ps.close();
		rs.close();
		return m;
	
	}

	@Override
	public UserDto findbyusernameandpassword(String username, String password) throws Exception {
		ps =con.prepareStatement("select * from user username=?");
		
		return null;
	}

	@Override
	public int updateusermobileno(UserDto mobileno) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUserPassword(String emailId) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
