package online.inloco.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	
	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		return "User Service is takking longer than expected."
				+ " Please try again later.";
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod() {
		return "Department Service is takking longer than expected."
				+ " Please try again later.";
	}
}
