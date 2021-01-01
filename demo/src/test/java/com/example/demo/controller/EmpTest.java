package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmpTest {

    @Test
    public void test1(){
        System.out.println(new Emp().setEmpName(1).setEmpAge(12).setEmpSex(1));
    }

}