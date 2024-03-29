package online.inloco.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import online.inloco.department.entity.Department;
import online.inloco.department.repository.DepartmentRepository;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentService.");
		return departmentRepository.save(department);
	}

	public Department findDepartmentByCode(String code) {
		log.info("Inside findDepartmentByCode method of DepartmentService.");
		return departmentRepository.findByCode(code);
	}
	
}
