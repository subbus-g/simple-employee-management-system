package tech.subbus.crud_operations_using_spring_mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.subbus.crud_operations_using_spring_mvc.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
