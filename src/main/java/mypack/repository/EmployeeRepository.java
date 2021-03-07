package mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mypack.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String>{
	
}
