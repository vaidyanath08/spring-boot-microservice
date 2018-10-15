/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author M1040042
 *
 */
@RestController
public class WelcomeController {
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome to springboot";
	}

	@RequestMapping("/hello")
	public String myData() {
		return "Hello spring boot";
	}
}
