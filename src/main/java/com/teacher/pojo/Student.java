package com.teacher.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int student_number;
    private String name;
    private boolean sex;
    private String academy;
    private int age;
    private String phone;
}
