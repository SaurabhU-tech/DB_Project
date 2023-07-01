package database_Testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadingDataFromDatabase {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","saurabh@17");
		System.out.println("Connected to MYSQL DB");
		
		Statement smt = con.createStatement();
				
		//executeQuery method returns the utput of the query 
		ResultSet rs = smt.executeQuery("select * from actor");
				
		while(rs.next()) {
			String firstname = rs.getString("first_name");
			System.out.print(firstname);
			System.out.print("\t");
			String lastname = rs.getString("last_name");
			System.out.println(lastname);
			}
	}
}
