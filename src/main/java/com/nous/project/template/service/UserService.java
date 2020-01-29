package com.nous.project.template.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.nous.project.template.model.User;

/**
 * Created by sahan on 4/9/2016.
 */
@Service
@Transactional
public class UserService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("user1@gmail.com", "user1"));
        users.add(new User("user2@gmail.com", "user2"));
    }

    
    public User save(User user) {
        // code to persist the User object
        return user;
    }
 
    public void delete(User user) {
        // code to remove the User object
    }
}