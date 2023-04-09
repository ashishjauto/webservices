package com.aj.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aj.webservices.salutations.Namaskara;
 
@RestController
public class HelloWorldController {

	
	@RequestMapping(method = RequestMethod.GET,path="/hello-world")
	public String helloworld() {
		return "Hello World";
	}
	
	
	@GetMapping(path="/gm")
	public String goodMorning() {
		return "Good Morning !!!";
	}
	
	
	@GetMapping(path="/namaskara")
	public Namaskara namaskara() {
		return   new Namaskara ("Vande Matram !!!");
	}



	@GetMapping(path="/namaskara/path-variable/{name}")
	public Namaskara namaskaraPathVariable(@PathVariable String name) {
		return   new Namaskara (String.format("Vande Matram !!! %s", name));
	}



}
