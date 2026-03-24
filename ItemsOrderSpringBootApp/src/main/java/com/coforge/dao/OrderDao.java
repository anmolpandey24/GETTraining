package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Order;
import com.coforge.repository.OrderRepository;

@Repository
public class OrderDao {
	
	@Autowired
	OrderRepository orderRepository;
	
	public List<Order> getAllOrders(){
		return orderRepository.findAll();
	}
	
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
	
	public Optional<Order> getById(long orderId){
		return orderRepository.findById(orderId);
	}

}
