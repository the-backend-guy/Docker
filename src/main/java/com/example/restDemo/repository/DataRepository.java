package com.example.restDemo.repository;

import com.example.restDemo.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class DataRepository {

    @Autowired
    private UserRepository userRepository;

    public String getData(){
        log.info("Returning the result string in repository");
        return "Success";
    }

    private void addUser(User user){
        userRepository.save(user);
    }

    public void addUsers(){
        List<User> users = userRepository.findAll();
        int sz = users.size();
        User user = new User();
        ++sz;
        user.setName("name " + sz);
        user.setEmail("test" + sz + "@email.com");
        addUser(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

}