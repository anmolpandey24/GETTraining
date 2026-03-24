package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Item;
import com.coforge.repository.ItemRepository;

@Repository
public class ItemDao {
	
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> getAllItems(){
		return itemRepository.findAll();
	}
	
	public Item saveItem(Item item) {
		return itemRepository.save(item);
	}
	
	public Optional<Item> getById(long itemId) {
		return itemRepository.findById(itemId);
	}
	

}
