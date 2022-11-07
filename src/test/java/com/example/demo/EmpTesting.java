package com.example.demo;


import com.example.demo.entities.*;
import com.example.demo.repository.empRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpTesting {
    @Autowired
    empRepository repository;
    @Test
    public void testCreateEmployee()
    {
        Emp employee=new Emp();
        employee.setId(100);
        employee.setFirstName("mary");
        employee.setLastName("gold");
        employee.setAge(35);
        Salary salary=new Salary();
        salary.setBasicSalary(700000.00);
        salary.setBonusSalary(80000.00);
        salary.setTaxAmount(35000.00);
        salary.setSpecialAllowanceSalary(20000.00);
        employee.setSalary(salary);
     repository.save(employee);
    }

}
