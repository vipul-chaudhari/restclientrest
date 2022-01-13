package com.restfulclient.restclientrest.Controller;

import com.restfulclient.restclientrest.dao.User;
import com.restfulclient.restclientrest.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
public class HomeController {
    @Autowired
    public HomeController(ServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }
    private final ServiceLayer serviceLayer;

    @GetMapping("/employee")
    public ResponseEntity<User> getData(){
        return new ResponseEntity<>(serviceLayer.consumeAPI(), HttpStatus.OK);
    }
}
