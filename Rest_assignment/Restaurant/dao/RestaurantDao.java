package com.example.Restaurant.dao;

import com.example.Restaurant.Module.Resturant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  RestaurantDao extends CrudRepository<Resturant, Integer> {
}
