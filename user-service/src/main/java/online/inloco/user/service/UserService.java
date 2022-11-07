package online.inloco.user.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import online.inloco.user.VO.Department;
import online.inloco.user.VO.UserVO;
import online.inloco.user.entity.User;
import online.inloco.user.repository.UserRepository;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Collection<User> list(){
		log.info("Inside list method of UserService");
		return userRepository.findAll();
	}
	
	public User save(User user) {
		log.info("Inside saveUser method of UserService.");
		return userRepository.save(user);
	}

	public UserVO getUserWithDepartmentByEmail(String email) {
		log.info("Inside getUserWithDepartmentByEmail method of UserService.");
		User user = userRepository.findByEmail(email);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentCode(), Department.class);
		UserVO vo = new UserVO(user,department);
		return vo;
	}
}
