package com.example.webflux.demo.Mapper;

import com.example.webflux.demo.DTO.EmployeeDTO;
import com.example.webflux.demo.Entity.Employee;

public class EmployeeMapper {

    public static EmployeeDTO mapToEmployeeDTO(Employee employee)
    {
        return new EmployeeDTO(
                employee.getId(),
                employee.getName(),
                employee.getEmail()
        );
    }
    public static Employee mapToEmployeeEntity(EmployeeDTO dto)
    {
        return new Employee(
                dto.getId(),
                dto.getName(),
                dto.getEmail()
        );
    }
}
