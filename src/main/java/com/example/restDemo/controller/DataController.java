package com.example.restDemo.controller;

import com.example.restDemo.model.User;
import com.example.restDemo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/fetchData")
    public String fetchData(){
        return dataRepository.getData();
    }

    @GetMapping("/addUsers")
    public void addUsers(){
        dataRepository.addUsers();
    }

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return dataRepository.getUsers();
    }

}
