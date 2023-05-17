package com.example.Restaurant.Services;

import com.example.Restaurant.Module.Resturant;
import com.example.Restaurant.dao.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class RestaurantServiceImpl implements ResturantService{


    @Autowired
    private  RestaurantDao restaurantDao;
    @Override
    public String addRestaurants(List<Resturant> restaurants) {
        restaurantDao.saveAll(restaurants);
        return "Added successfully" ;
    }

    @Override
    public List<Resturant> getRestaurants() {
        return (List<Resturant>) restaurantDao.findAll();
    }

    @Override
    public Optional<Resturant> getRestaurant(Integer rest_id) {
        return (Optional<Resturant>) restaurantDao.findById(rest_id);
    }
    @Override
    public Optional<Resturant> deleteRestaurant(Integer rest_id) {
        Optional<Resturant> restaurant = restaurantDao.findById(rest_id);
        restaurant.ifPresent(rest -> restaurantDao.delete(rest));
        return restaurant;
    }




}
