package com.coforge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallbackMethod")
	public String userServiceFallbackMethod() {
		
		return "user service taking time longer than expecteed"+
		"please try agin later.";
	}

	@GetMapping("/departmentServiceFallbackMethod")
	public String departmentServiceFallbackMethod() {
		
		return "department service taking time longer than expecteed"+
		"please try agin later.";
	}
}
