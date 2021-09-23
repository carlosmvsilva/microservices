package pt.lincesw.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import pt.lincesw.user.VO.UserVO;
import pt.lincesw.user.entity.User;
import pt.lincesw.user.service.UserService;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser method of UserController");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{email}")
	public UserVO getUserWithDepartmentByEmail(@PathVariable("email") String email) {
		log.info("Inside getUserWithDepartmentByEmail method of UserController");
		return userService.getUserWithDepartmentByEmail(email);
	}
}
