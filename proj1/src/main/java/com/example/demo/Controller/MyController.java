package com.example.demo.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.User;
import com.example.demo.Repository.Repo;
import com.example.demo.Pojo.Course;
import com.example.demo.Pojo.Signup;

@CrossOrigin
@RestController
public class MyController
{
	
	@Autowired
	private Repo repo;

	public Repo getRepo() {
		return repo;
	}

	public void setRepo(Repo repo) {
		this.repo = repo;
	}
	
	@PostMapping("/insert")
	public User postMethodName(@RequestBody User user) throws ClassNotFoundException, SQLException {
		
		return repo.insertUser(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public int deleteMethodName(@PathVariable int id) throws ClassNotFoundException, SQLException {
		
		return repo.deleteUser(id);
	}	
	
	@PutMapping("/update")
	public User updateMethodName(@RequestBody User user) throws ClassNotFoundException, SQLException {
		
		return repo.updateUser(user);
	}	
	
	@GetMapping("/get/{id}")
	public User getById(@PathVariable int id) throws ClassNotFoundException, SQLException {
		return repo.getById(id);
	}
	
	@GetMapping("/select")
	public List<User> getMethodName(User user) throws ClassNotFoundException, SQLException {
		return repo.selectUser(user);
	}
	
	//signup
	@PostMapping("/signup")
	public Signup postMethodName(@RequestBody Signup signup) throws ClassNotFoundException, SQLException {
		
		return repo.insertUser(signup);
	}
	
	//checkuser
	@GetMapping("/check/{email}/{password}")
	public String checkUser(@PathVariable String email,@PathVariable String password) throws ClassNotFoundException, SQLException
	{
		System.out.println(email+"    "+password);
		return repo.checkUser(email, password);
	}

	
	
	
	//course table------------
	
	@PostMapping("/insertcourse")
	public Course postMethodName(@RequestBody Course course) throws ClassNotFoundException, SQLException {
		
		return repo.insertCourse(course);
	}
	
	@GetMapping("/course")
	public List<Course> getMethodName(Course course) throws ClassNotFoundException, SQLException {
		return repo.selectCourse(course);
	}
	
	
}
