package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}