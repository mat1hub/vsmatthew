package action;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.UserDaoI;
import database.UserDto;

public class RegisterAction extends Action{
	ServletContext application;
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String username =request.getParameter("uname");
		String userpass =request.getParameter("upass");
		String useemail =request.getParameter("uemail");
		String usermobile =request.getParameter("umobile");
		UserDto udo =new UserDto();
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/vastpro12";
		String username1="root";
		String password="vastpro";
		Connection con=DriverManager.getConnection(url,username1,password);
		UserDao udi =new UserDaoI(con);
	     udo.setUsername(username);
	     udo.setEmailId(useemail);
	     udo.setPassword(userpass);
	     udo.setPhoneNumber(usermobile);
	     udi.createUser(udo);
		return "register.success";
		
		
	}
}
