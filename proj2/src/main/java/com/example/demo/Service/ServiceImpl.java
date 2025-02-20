package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Itemclick;
import com.example.demo.Dao.Repo;
import com.example.demo.Dao.Repo1;
import com.example.demo.Pojo.FoodItems;
import com.example.demo.Pojo.ItemsClick;
import com.example.demo.Pojo.Login;


@Service
public class ServiceImpl implements ServiceInterface{
	
	@Autowired
	private Repo repo;
	
	@Autowired
	private Repo1 repo1;
	
	@Autowired
	private Itemclick itc;
	
	@Override
	public Login insert(Login login) {
		return repo.save(login);
	}
	
	@Override
	public String findByEmailAndPassword(String email, String password) {
		List<Login> users=repo.findByEmailAndPassword(email,password);
		if (!users.isEmpty()) {
            return "1"; 
        } else {
            return "2";
        }
	}

	@Override
	public FoodItems insert(FoodItems fooditems) {
		return repo1.save(fooditems);
	}

	@Override
	public List<FoodItems> findAll() {
		return repo1.findAll();
	}

	@Override
	public List<FoodItems> findByName(String name) {
		return repo1.findByName(name);
	}

	@Override
	public FoodItems findById(int id) {
		Optional<FoodItems> item = repo1.findById(id);
		if (item.isPresent())
		{
			return item.get();
		} else
		{
			return null;
		}
	}

	@Override
	public ItemsClick insert(ItemsClick itemsclick) {
		return itc.save(itemsclick);
	}

	@Override
	public List<ItemsClick> findAll1() {
		return itc.findAll();
	}

	@Override
	public String deleteById(int id) {
		itc.deleteById(id);
		return "item deleted";
	}
	
	
	
}
