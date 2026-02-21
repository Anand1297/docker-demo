package com.example.docker_example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Docker {

	
	@GetMapping("/healthCheck")
	public ResponseEntity<Map<String, String>> getHealthStatus() {
		 Map<String, String> response = new HashMap<>();
		    response.put("status", "200");
		    response.put("message", "App is running");
		    return ResponseEntity.ok(response);
	}
	
}
