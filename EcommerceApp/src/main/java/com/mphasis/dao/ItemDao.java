package com.mphasis.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mphasis.entities.Item;
import com.mphasis.repositories.ItemRepository;

@Repository
public class ItemDao implements ItemDaoInterface{
	
	@Autowired
	ItemRepository repository;

	public List<Item> findAll() {
		
		return repository.findAll();
	}

	public Optional<Item> findById(Long id) {
		
		return repository.findById(id);
	}

	public Item save(Item item) {
		
		return repository.save(item);
	}

	public Item update(Item item) {
		
		return repository.save(item);
	}

	
	public void delete(Long id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Item> findItemsById(List<Long> ids) {
		return repository.findAllById(ids);
	}

}
