package action;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class ConnectionUtility1 {
	static {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
			}
			catch(Exception e) {};
		}
		public static Connection getconnection()throws Exception {
			Connection con=null;
			if(con==null) {
				String url="jdbc:mysql://localhost:3306/fesh";
				String username="root";
				String password="vastpro";
				con=DriverManager.getConnection(url,username,password);
				return con;
			}
			else {
				return con;
			}
		}
		
		public static void closeConnection() throws SQLException {
			Connection con=null;
			if(con==null) {
				System.out.println("THere is no connection to close");
			}
			else {
				con.close();
			}
		}
	}

