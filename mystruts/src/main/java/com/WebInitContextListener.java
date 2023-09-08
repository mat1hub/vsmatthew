package com;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class WebInitContextListener implements ServletContextListener {
    public WebInitContextListener() {
        // TODO Auto-generated constructor stub
    }
    public void contextDestroyed(ServletContextEvent sce)  { 
         System.out.println("context destroyed...");
    }
    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
         System.out.println("context initialized....");
         ServletContext application=sce.getServletContext();
         String path=application.getRealPath("/WEB-INF/config.properties");         
         Properties prop=new Properties();
         prop.load(new FileInputStream(path));
         //application.setInitParameter("prop", prop);
         application.setAttribute("prop", prop); 
         String url =prop.getProperty("url");
         String username =prop.getProperty("username");
         String password =prop.getProperty("password");
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con= DriverManager.getConnection(url,username,password);
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
	
}
