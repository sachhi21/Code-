package com.example.Restaurant.Controller;

import com.example.Restaurant.Module.User;
import com.example.Restaurant.Services.ResturantService;
import com.example.Restaurant.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/users")
    public User createUser(@RequestParam("userName") String userName) {
              User user = new User();
              user.setUser_name(userName);

        return userService.createUser(user);
       // return userService.createUser(user);
    }

    @GetMapping("/userlist")
    public List<User> getUsers(){
        return userService.getusers();
    }

}
