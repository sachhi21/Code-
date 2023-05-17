package com.example.Restaurant.Controller;

import com.example.Restaurant.Module.Resturant;
import com.example.Restaurant.Services.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResturantController {
   @Autowired
   private ResturantService  resturantService;

    public ResturantController(ResturantService resturantService) {
        this.resturantService = resturantService;
    }


   @PostMapping("/addRestaurants")
    public String addRestaurants(@RequestBody List<Resturant> restaurants) {
        return resturantService.addRestaurants(restaurants);
    }

    @GetMapping("/getRestaurants")
    public List<Resturant> getRest() {
        return resturantService.getRestaurants();
    }

    @DeleteMapping("/deletebyid")
    public String deleteRestaurant(@RequestParam("rest_id") Integer rest_id) {
        resturantService.deleteRestaurant(rest_id);

        return "deleted success";
    }

}
