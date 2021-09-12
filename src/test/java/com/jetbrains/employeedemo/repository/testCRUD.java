package com.jetbrains.employeedemo.repository;

import com.jetbrains.employeedemo.Employee;
import com.jetbrains.employeedemo.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;

@SpringBootTest
class testCRUD {
    @Autowired
    private EmployeeRepository employeeRepository;

    //Save
    @Test
    public void saveEmployees(){
        employeeRepository.save(new Employee("Quynh","Anh"));
    }

    //Read
    @Test
    public void findAllEmployees(){
        System.out.println(employeeRepository.findAll());
    }
    @Test
    public void findById(){
        System.out.println(employeeRepository.findById(Long.valueOf(1)));
    }

    @Test
    public void findByCustomId(){
        System.out.println(employeeRepository.findByCustomId(Long.valueOf(1)));
    }

    @Test
    public void findAllEmployeesCustom(){
        System.out.println(employeeRepository.findAllEmployeesCustom());
    }

    @Test
    public void updateById(){
        employeeRepository.updateById(Long.valueOf(2),"Quyen");
    }

    @Test
    public void delete(){
        employeeRepository.deleteById(Long.valueOf(1));
        System.out.println("Successful");
    }



}
