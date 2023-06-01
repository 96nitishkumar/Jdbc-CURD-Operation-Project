package com.jdbc.practice;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDao {
	public void savePerson(Person p) throws SQLException {
		Connection con = TC.ctCon();
		PreparedStatement psmt = con.prepareStatement("insert into Person values(?,?,?,?)");
		psmt.setInt(1,p.getId());
		psmt.setString(2,p.getFname());
		psmt.setString(3,p.getLname());
		psmt.setString(4, p.getEmail());
		psmt.executeUpdate();
		System.out.println("data inserted successfully......");
		
		
	}
	public static Person getPersonById(int id) throws SQLException {
		Connection con = TC.ctCon();
		Statement st = con.createStatement();
		ResultSet set  = st.executeQuery("select * from person where id =" +id);
		set.next();
		Person p = new Person(set.getInt(1),set.getString(2),set.getString(3),set.getString(4)); 
		
		
		return p;
			
		}
	
	public static List<Person> getPersonByFirstName(String fname) throws SQLException{
		Connection con = TC.ctCon();
		Statement st  = con.createStatement();
		ResultSet set  = st.executeQuery("select * from person where fname = '"+ fname);
		List<Person> prsn = new ArrayList<Person>();
		while(set.next()) {
			Person p2 = new Person(set.getInt(1),set.getString(2),set.getString(3),set.getString(4));
			prsn.add(p2);
			
			
		}
		
		return prsn;
	}
}
