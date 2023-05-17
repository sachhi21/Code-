package com.example.Restaurant.Controller;

import com.example.Restaurant.Module.Order;
import com.example.Restaurant.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/makeOrder")
    public Order makeOrder(@RequestBody Order order) {
        return orderService.makeOrder(order);
    }


    @GetMapping("/getOrderByID")
    public Optional<Order> getOrderById(@RequestParam Integer orderId) {
        return orderService.getOrderById(orderId);
    }
}
