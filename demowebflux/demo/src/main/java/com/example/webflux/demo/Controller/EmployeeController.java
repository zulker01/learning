package com.example.webflux.demo.Controller;

import com.example.webflux.demo.DTO.EmployeeDTO;
import com.example.webflux.demo.Service.EmployeeServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeServiceInterface employeeService;

    @PostMapping("/save")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO dto)
    {
        return employeeService.saveEmployee(dto);
    }


    @GetMapping("/all")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Flux<EmployeeDTO> getEmployee()
    {
        return employeeService.getAllEmployees();
    }
    @GetMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<EmployeeDTO> getAllEmployee(@RequestBody EmployeeDTO dto)
    {
        return employeeService.getEmployee(dto.getId());
    }

    @PutMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<EmployeeDTO> updateEmployee(@RequestBody EmployeeDTO dto)
    {
        return employeeService.updateEmployee(dto,dto.getId());
    }
    @DeleteMapping("")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Mono<Void> deleteEmployee(@RequestBody EmployeeDTO dto)
    {
        return employeeService.deleteEmployee(dto.getId());    }
}
