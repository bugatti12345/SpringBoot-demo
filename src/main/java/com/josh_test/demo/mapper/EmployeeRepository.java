package com.josh_test.demo.mapper;

import com.josh_test.demo.entity.TestEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<TestEmployee, Long> {

}