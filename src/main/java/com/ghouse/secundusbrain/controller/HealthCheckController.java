package com.ghouse.secundusbrain.controller;

import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthCheckController {
	

    @GetMapping("/health")
    public ResponseEntity<String> checkHealth() {
    	
        return new ResponseEntity<>("Secundus Brain Healthy: "+ZonedDateTime.now(), HttpStatus.OK);
    }

 

}
