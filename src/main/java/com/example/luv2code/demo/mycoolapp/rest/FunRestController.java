package com.example.luv2code.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// inject properties for: coach.name and team.name
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName;
	
	// exposing the path "/" that return data
	@GetMapping("/")
	public String sayHello() {
		return "Hello world! The time on the server is " + LocalDateTime.now();
	}
	
	//expose new endpoint for "teaminfo"
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + " team: " + teamName;
	}
}
