package com.example.Restaurant.Services;

import com.example.Restaurant.Module.User;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserService {

   User createUser(User user);

   List<User> getusers();
}
