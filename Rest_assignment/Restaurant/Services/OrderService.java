package com.example.Restaurant.Services;

import com.example.Restaurant.Module.Order;

import java.util.Optional;

public interface OrderService {


    Order makeOrder(Order order);

    Optional<Order> getOrderById(Integer order_id);




}
