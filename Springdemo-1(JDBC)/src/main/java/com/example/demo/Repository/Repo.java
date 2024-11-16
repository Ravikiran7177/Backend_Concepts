package com.example.demo.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.Pojo.Laptop;

@Repository
public class Repo {
	
	//insert
	public Laptop insertLaptop(Laptop laptop) throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/ravi";
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection(url,"root","root");
    	String q="insert into laptop values(?,?,?)";
    	PreparedStatement pst=con.prepareStatement(q);
    	pst.setInt(1, laptop.getId());
    	pst.setString(2, laptop.getBrand());
    	pst.setDouble(3, laptop.getPrice());
    	
    	int rows=pst.executeUpdate();
    	return laptop;
	}
	
	//select
	public List<Laptop> selectLaptop(Laptop laptop) throws SQLException, ClassNotFoundException {
		List<Laptop> li=new ArrayList<Laptop>();
		
		String url="jdbc:mysql://localhost:3306/ravi";
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection(url,"root","root");
    	String q="select * from laptop";
    	PreparedStatement pst=con.prepareStatement(q);
    	ResultSet rs=pst.executeQuery();
    	while(rs.next()) {
    		Laptop lap=new Laptop();
    		lap.setId(rs.getInt(1));
    		lap.setBrand(rs.getString(2));
    		lap.setPrice(rs.getDouble(3));
    		li.add(lap);
    	}
    	return li;
	}
	
	// Authentication
	public String checkLaptop( String brand) throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/ravi";
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection(url,"root","root");
    	String q="select * from laptop where brand=?";
    	PreparedStatement pst=con.prepareStatement(q);
    	pst.setString(1,brand);
    	ResultSet rs=pst.executeQuery();
    	if(rs.next())
    	{
    		return "welcome";
    	}
    	else {
    		return "not there";
    	}
	}

	
}
