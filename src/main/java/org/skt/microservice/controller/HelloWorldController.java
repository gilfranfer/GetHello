package org.skt.microservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloWorldController {

    @GetMapping("/all")
    public ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

}
