package com.example.demo.Contloller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Pojo.FoodItems;
import com.example.demo.Pojo.ItemsClick;
import com.example.demo.Pojo.Login;
import com.example.demo.Service.ServiceInterface;

@RestController
@CrossOrigin
public class MyController {
	
	@Autowired
	private ServiceInterface service;
	
	//login
	@PostMapping("/path")
	public Login postMethodName(@RequestBody Login login) {
		return service.insert(login);
	}
	
	//login cheacking
	@GetMapping("/check/{email}/{password}")
	public String findByEmailAndPassword(@PathVariable String email,@PathVariable String password) {
		return service.findByEmailAndPassword(email,password);
	}
	
	//fooditems inserting
	@PostMapping("/insert")
	public FoodItems postMethodName(@RequestBody FoodItems fooditems){
		return service.insert(fooditems);
	}
	
	//getting the fooditems
	@GetMapping("/items")
	public List<FoodItems> findAll() {
		return service.findAll();
	}
	
	//getting fooditem by name(search bar)
//	@GetMapping("/name/{name}")
//	public FoodItems findByName(@PathVariable String name) {
//		return service.findByName(name);
//	}
	@GetMapping("/name/{name}")
	public ResponseEntity<List<FoodItems>> findByName(@PathVariable String name) {
	    List<FoodItems> items = service.findByName(name);
	    if (items == null || items.isEmpty()) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok(items);
	}
	
	//to check order fooditem
	@GetMapping("/checkorder/{id}")
	public FoodItems findById(@PathVariable int id) {
		return service.findById(id);
	}
	
	//items click to insert
	@PostMapping("/itemclick")
	public ItemsClick postMethodName(@RequestBody ItemsClick itemsclick) {
		return service.insert(itemsclick);
	}
	
	//getting the itemsclicked
	@GetMapping("/getitems")
	public List<ItemsClick> findAll1() {
		return service.findAll1();
	}
	
	//deleting the selected item
	@DeleteMapping("/deleteitem/{id}")
	public String deleteById(@PathVariable int id) {
		return service.deleteById(id);
	}
	
}
