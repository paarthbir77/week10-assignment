package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.FinancialReport;
import com.example.user.entity.InventoryDetails;
import com.example.user.service.UserService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/viewInventory")
	public String viewInventory() {
		return userService.viewInventory();
	}

	@PostMapping("/placeOrder")
	public String placeOrder(int orderId[], String code) {
		return userService.placeOrder(orderId, code);
	}

}
