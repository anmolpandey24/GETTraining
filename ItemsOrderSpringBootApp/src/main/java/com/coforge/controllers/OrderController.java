package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dtos.OrderDto;
import com.coforge.dtos.OrderRequestDto;
import com.coforge.services.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public List<OrderDto> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/orders/{id}")
	public OrderDto getOrderById(long orderId) {
		return orderService.getOrderById(orderId);
	}
	
	@PostMapping("/orders")
	public OrderDto save(@RequestBody OrderRequestDto requestDto) {
		return orderService.saveOrder(requestDto);
	}
	
	
	

}
