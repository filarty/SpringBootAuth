package com.filarty.SpringBootAuth.controller;


import com.filarty.SpringBootAuth.model.JsonTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Endpoint(id = "test")
@Slf4j
public class Test {

    @GetMapping("/test")
    @ReadOperation
    JsonTest testReturn() {
        log.info("Test!");
        JsonTest jsonTest = new JsonTest("filarty");
        return jsonTest;
    }
}
