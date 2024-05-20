package com.filarty.SpringBootAuth.controller;


import com.filarty.SpringBootAuth.model.JsonTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Endpoint(id = "test")
@Slf4j
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<JsonTest> testReturn() {
        log.info("Test!");
        return ResponseEntity.status(HttpStatus.OK).body(new JsonTest("filarty"));
    }
}
