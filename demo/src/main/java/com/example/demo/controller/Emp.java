package com.example.demo.controller;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Emp {
    private Integer empName;
    private Integer empAge;
    private Integer empSex;
}
