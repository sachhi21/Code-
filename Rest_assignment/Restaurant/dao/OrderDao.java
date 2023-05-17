package com.example.Restaurant.dao;

import com.example.Restaurant.Module.Order;
import org.springframework.data.repository.CrudRepository;

public interface  OrderDao extends CrudRepository<Order, Integer> {
}
