package com.teacher.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int staff_number;
    private String name;
    private String phone;
    private float money;
    private String department;
    private String post;
    private int age;
}
