package com.jdbc.practice;

import java.sql.SQLException;
import java.util.List;

public class CurdOperation {

	public static void main(String[] args) throws SQLException {
		Person p = new Person(111,"nksingh","nk","nk@123");
		
       PersonDao dao =  new PersonDao();
                        dao.savePerson(p);
       Person p1 = PersonDao.getPersonById(111);
       System.out.println(p1);
      List<Person>  p3=  dao.getPersonByFirstName("nksingh");
      for(Person p4:p3)
    	  System.out.println(p4);
                        
	}

}
