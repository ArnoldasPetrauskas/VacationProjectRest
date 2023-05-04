package com.VacationProject.VacationProjectFrontEnd.Employee;

import com.VacationProject.VacationProjectFrontEnd.Employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Optional<Employee> findByUsername(String username);
}