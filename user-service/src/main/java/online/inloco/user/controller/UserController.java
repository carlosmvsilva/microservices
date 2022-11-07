package online.inloco.user.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import online.inloco.user.VO.UserVO;
import online.inloco.user.entity.User;
import online.inloco.user.service.UserService;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public ResponseEntity<Collection<User>> listUsers() {
		log.info("Inside listUser method of UserController");
		return ResponseEntity.ok().body(userService.list());
	}
	
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser method of UserController");
		return userService.save(user);
	}
	
	@GetMapping("/{email}")
	public UserVO getUserWithDepartmentByEmail(@PathVariable("email") String email) {
		log.info("Inside getUserWithDepartmentByEmail method of UserController");
		return userService.getUserWithDepartmentByEmail(email);
	}
}
