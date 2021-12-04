package com.example.user.service;

import java.util.List;

import com.example.user.entity.FinancialReport;
import com.example.user.entity.InventoryDetails;

public interface UserService {

	String viewInventory();

	String placeOrder(int orderId[], String code);

}