package com.example.demo.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Pojo.User;
import com.example.demo.Pojo.*;

import utility.Singleton;

@Repository
public class Repo {
	
	Connection con;
	// insert
	public User insertUser(User user) throws SQLException, ClassNotFoundException {
		con=Singleton.getConnection(con);
    	String q="insert into userdetail values(?,?,?,?,?)";
    	PreparedStatement pst=con.prepareStatement(q);
    	pst.setString(1, user.getUsername());
    	pst.setString(2, user.getEmail());
    	pst.setInt(3, user.getMobileno());
    	pst.setInt(4, user.getAge());
    	pst.setInt(5, user.getId());
    	pst.executeUpdate();
    	return user;
	}
	
	//delete
	public int deleteUser(int id) throws SQLException, ClassNotFoundException {
		
		con=Singleton.getConnection(con);
    	String q="delete from userdetail where id=?";
    	PreparedStatement pst=con.prepareStatement(q);
    	pst.setInt(1,id);
    	pst.executeUpdate();
		return id;
    	
	}
	
	//update
	public User updateUser(User user) throws SQLException, ClassNotFoundException {
		con=Singleton.getConnection(con);
    	String q="update userdetail set age=?,username=?,mobileno=?,email=? where id=? ";
    	PreparedStatement pst=con.prepareStatement(q);
    	pst.setInt(1, user.getAge());
    	pst.setString(2, user.getUsername());
    	pst.setInt(3,user.getMobileno());
    	pst.setString(4, user.getEmail());
    	pst.setInt(5, user.getId());
    	if(pst.executeUpdate()>0)
    		return user;
    	return null;
	}
	
	//select
	public List<User> selectUser(User user) throws SQLException, ClassNotFoundException {
		List<User> li=new ArrayList<User>();
		
		con=Singleton.getConnection(con);
    	String q="select * from userdetail";
    	PreparedStatement pst=con.prepareStatement(q);
    	ResultSet rs=pst.executeQuery();
    	while(rs.next()) {
    		User user1=new User();
    		user1.setUsername(rs.getString(1));
    		user1.setEmail(rs.getString(2));
    		user1.setMobileno(rs.getInt(3));
    		user1.setAge(rs.getInt(4));
    		user1.setId(rs.getInt(5));
    		li.add(user1);
    	}
    	return li;
	}
															
	//geting id
	public User getById(int id) throws SQLException, ClassNotFoundException {
		System.out.println("dsfhah");
		con=Singleton.getConnection(con);
    	String q="select * from userdetail where id="+id;
    	PreparedStatement pst=con.prepareStatement(q);
    	ResultSet rs=pst.executeQuery();
    	User user1=new User();
    	while(rs.next()) {
    		
    		user1.setUsername(rs.getString(1));
    		user1.setEmail(rs.getString(2));
    		user1.setMobileno(rs.getInt(3));
    		user1.setAge(rs.getInt(4));
    		user1.setId(rs.getInt(5));
    	}
    	return user1;
	}
	
	//signup
	public Signup insertUser(Signup signup) throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/ravi";
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection(url,"root","root");
		con=Singleton.getConnection(con);
    	String q="insert into signup values(?,?,?)";
    	PreparedStatement pst=con.prepareStatement(q);
    	pst.setInt(1,signup.getId());
    	pst.setString(2, signup.getEmail());
    	pst.setString(3, signup.getPassword());
    	pst.executeUpdate();
    	return signup;
	}
	
	//checkuser
	public String checkUser(String email , String password) throws SQLException, ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/ravi";
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection(url,"root","root");
		con=Singleton.getConnection(con);
    	String q="SELECT * FROM SIGNUP WHERE EMAIL=? AND PASSWORD=?";
    	PreparedStatement pst=con.prepareStatement(q);
    	pst.setString(1, email);
    	pst.setString(2,password);
    	ResultSet rs=pst.executeQuery();
    	if(rs.next())
    	{
    		return "1";
    	}
    	else
    	{
    		try
    		{
    			throw new UserNotFoundException("USER IS NOT REGISTERED");
    		}
    		catch(UserNotFoundException u)
    		{
    			return "2";
    		}
    		
    	}
	}
	
	
	
	
	
	//Course table
	
	
	//select
	public List<Course> selectCourse(Course course) throws SQLException, ClassNotFoundException {
		List<Course> li=new ArrayList<Course>();
		
		con=Singleton.getConnection(con);
    	String q="select * from coursedetails";
    	PreparedStatement pst=con.prepareStatement(q);
    	ResultSet rs=pst.executeQuery();
    	while(rs.next()) {
    		Course course1=new Course();
    		course1.setImg(rs.getString(1));
    		course1.setName(rs.getString(2));
    		course1.setDescription(rs.getNString(3));
    		course1.setOff(rs.getString(4));
    		course1.setOldprice(rs.getDouble(5));
    		course1.setNewprice(rs.getDouble(6));
    		course1.setId(rs.getInt(7));
    		li.add(course1);
    	}
    	return li;
	}
	
	// insert
		public Course insertCourse(Course course) throws SQLException, ClassNotFoundException {
			con=Singleton.getConnection(con);
	    	String q="insert into coursedetails values(?,?,?,?,?,?,?)";
	    	PreparedStatement pst=con.prepareStatement(q);
	    	pst.setString(1,course.getImg());
	    	pst.setString(2,course.getName());
	    	pst.setString(3,course.getDescription());
	    	pst.setString(4,course.getOff());
	    	pst.setDouble(5,course.getOldprice());
	    	pst.setDouble(6,course.getNewprice());
	    	pst.setInt(7,course.getId());
	    	pst.executeUpdate();
	    	return course;
		}
		
		
}
