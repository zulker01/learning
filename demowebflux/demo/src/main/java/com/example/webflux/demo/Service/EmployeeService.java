package com.example.webflux.demo.Service;

import com.example.webflux.demo.DTO.EmployeeDTO;
import com.example.webflux.demo.Entity.Employee;
import com.example.webflux.demo.Mapper.EmployeeMapper;
import com.example.webflux.demo.Repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class EmployeeService implements EmployeeServiceInterface{
    private EmployeeRepository employeeRepository;
    @Override
    public Mono<EmployeeDTO> saveEmployee(EmployeeDTO dto){
        Employee e = EmployeeMapper.mapToEmployeeEntity(dto);
        Mono<Employee> saved =  employeeRepository.save(e);
        return saved.map(eentity->EmployeeMapper.mapToEmployeeDTO(e));
    }
    @Override
    public Mono<EmployeeDTO> getEmployee(String id){
        Mono<Employee> employeeMono = employeeRepository.findById(id);
        return employeeMono.map(e-> EmployeeMapper.mapToEmployeeDTO(e));
    }
    @Override
    public Flux<EmployeeDTO> getAllEmployees(){
        Flux<Employee> employeeFlux = employeeRepository.findAll();
        return employeeFlux.map((e)->EmployeeMapper.mapToEmployeeDTO(e))
                .switchIfEmpty(Flux.empty());
    }
    @Override
    public Mono<EmployeeDTO> updateEmployee(EmployeeDTO dto,String id)
    {
        Mono<Employee> employeeMono  = employeeRepository.findById(id);
        return employeeMono.flatMap((existingEmployee)->{
            existingEmployee.setName(dto.getName());
            existingEmployee.setEmail(dto.getEmail());
            return employeeRepository.save(existingEmployee);
                }
                ).map((employee)->EmployeeMapper.mapToEmployeeDTO(employee));
    }
    @Override
    public Mono<Void> deleteEmployee(String id)
    {
        return employeeRepository.deleteById(id);
    }
}
