package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Pojo.FoodItems;
import com.example.demo.Pojo.Login;


public interface Repo extends CrudRepository<Login,Integer> {

	//Login save(Login login);
	
	List<Login> findByEmailAndPassword(String email, String password);
	
}
