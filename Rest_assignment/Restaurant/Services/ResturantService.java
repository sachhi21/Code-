package com.example.Restaurant.Services;

import com.example.Restaurant.Module.Resturant;

import java.util.List;
import java.util.Optional;

public interface ResturantService {

    String addRestaurants(List<Resturant> restaurants);

    List<Resturant> getRestaurants();



    Optional<Resturant> getRestaurant(Integer rest_id);

    Optional<Resturant>  deleteRestaurant(Integer id);


}
