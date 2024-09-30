package com.api;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A
{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "vijay"),
                new Employee(2, "Ajay"),
                new Employee(1, "sai" )
                );
        List<EmployeeDto> dtos = employees.stream().map(e -> mapToDto(e)).collect(Collectors.toList());
    }
static EmployeeDto mapToDto(Employee employee){
        EmployeeDto dto=new EmployeeDto();
        dto.setId(employee.getId());
        dto.setName(employee.getName());
        return  dto;
    }
}