package com.jdbc.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TC {
	public static Connection ctCon() {
		Connection con = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","nitish");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
