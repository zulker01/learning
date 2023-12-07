package com.example.webflux.demo.Repository;

import com.example.webflux.demo.Entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee,String> {
}
