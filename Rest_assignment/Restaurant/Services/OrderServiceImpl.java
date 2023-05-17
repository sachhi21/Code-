package com.example.Restaurant.Services;


import com.example.Restaurant.Module.Order;
import com.example.Restaurant.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class OrderServiceImpl implements  OrderService{

    @Autowired
    private OrderDao orderDao;


    @Override
    public Order makeOrder(Order order) {

        orderDao.save(order);
        return order;
    }

    @Override
    public Optional<Order> getOrderById(Integer orderId) {
        return orderDao.findById(orderId);

    }
}
