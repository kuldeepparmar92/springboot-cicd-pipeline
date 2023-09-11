package com.javatechie.docker_jenkins_k8s_cicd_pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {
	@GetMapping("/index")
	public void index() {
		log.info("inside the index method of home controller");
		System.out.println("hello from index method of home controller");
	}
}
