package pt.lincesw.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;
import pt.lincesw.user.VO.Department;
import pt.lincesw.user.VO.UserVO;
import pt.lincesw.user.entity.User;
import pt.lincesw.user.repository.UserRepository;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside saveUser method of UserService.");
		return userRepository.save(user);
	}

	public UserVO getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment method of UserService.");
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		UserVO vo = new UserVO(user,department);
		return vo;
	}
}
