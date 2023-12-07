package com.example.webflux.demo.Service;

import com.example.webflux.demo.DTO.EmployeeDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeServiceInterface {

    public Mono<EmployeeDTO> saveEmployee(EmployeeDTO dto);
    public Mono<EmployeeDTO> getEmployee(String id);
    public Flux<EmployeeDTO> getAllEmployees();
    public Mono<EmployeeDTO> updateEmployee(EmployeeDTO dto,String id);
    public Mono<Void> deleteEmployee(String id);
}
