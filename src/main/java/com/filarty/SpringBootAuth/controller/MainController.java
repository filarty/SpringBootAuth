package com.filarty.SpringBootAuth.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("/")
    public ResponseEntity<Map<String, String>> index() {
        HashMap<String, String> response = new HashMap<>();
        response.put("message", "hello, world!");
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
