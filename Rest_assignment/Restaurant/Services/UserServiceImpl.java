package com.example.Restaurant.Services;

import com.example.Restaurant.Module.User;
import com.example.Restaurant.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

     @Autowired
    private UserDao userDao;
    @Override
    public User createUser(User user) {
       userDao.save(user);
        return user ;
    }

    @Override
    public List<User> getusers() {
        return (List<User>)userDao.findAll();
    }
}
