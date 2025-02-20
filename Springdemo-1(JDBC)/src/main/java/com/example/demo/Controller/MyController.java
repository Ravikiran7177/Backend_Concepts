package com.example.demo.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Pojo.Laptop;
import com.example.demo.Repository.Repo;
import org.springframework.web.bind.annotation.RequestParam;


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
	
	@PostMapping("/save")
	public Laptop postMethodName(@RequestBody Laptop laptop) throws ClassNotFoundException, SQLException {
		
		return repo.insertLaptop(laptop);
	}
	
	@GetMapping("/select")
	public List<Laptop> getMethodName(Laptop laptop) throws ClassNotFoundException, SQLException {
		return repo.selectLaptop(laptop);
	}
	
	//checking
	@GetMapping("/{brand}")
	public String getById(@PathVariable String brand) throws ClassNotFoundException, SQLException {
		return repo.checkLaptop(brand);
	}
	
}
