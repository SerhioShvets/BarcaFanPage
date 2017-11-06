package dao;


import java.sql.*;
import java.util.Properties;

public class DataAccessObject {

	    public void addNewUserToDB (String full_name, String email, String  user_password) {
	    	
	    	//for connection
	    	final String HOST = "eu-cdbr-azure-north-e.cloudapp.net";
		    final String DATABASE = "barcafanpageusers";
		    final String USER = "b5d0fc197072e8";
		    final String PASSWORD = "e10ac22a";
	    	
		    try{
	            Class.forName("com.mysql.jdbc.Driver");
	        }
	        catch (ClassNotFoundException e){
					System.out.printf("ERROR  - MySQL JDBC driver NOT detected in library path.", e);
	        }
		    System.out.println("OK - MySQL JDBC driver detected in library path.");
		    
		    Connection connection = null;
		    
		    try{
	            String url = String.format("jdbc:mysql://%s/%s", HOST, DATABASE);

	            // Set connection properties.
	            Properties properties = new Properties();
	            properties.setProperty("user", USER);
	            properties.setProperty("password", PASSWORD);
	            
	            // get connection
	            connection = DriverManager.getConnection(url, properties);
	            System.out.println("Successfully created connection to database.");
	            
	        }catch (SQLException e){
	        	System.out.printf("ERROR  - Failed to create connection to database.", e);
	        }
		    try {
		    	Statement statement = connection.createStatement();
		    	 statement.execute("Insert into barcafanpageusers.users (user_full_name, email_address, user_password) values ('"+full_name+"', '"+ email +"', '"+ user_password+"');");
	             System.out.println("message-sql: insert successfully");
		    }catch(SQLException e) {
		    	System.out.printf("ERROR  - Encountered an error when executing given sql statement.", e);
		    }
		    System.out.println("OK  - Execution finished.");
	    }
}