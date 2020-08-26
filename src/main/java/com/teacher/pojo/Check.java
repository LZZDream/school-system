package com.teacher.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Check {
    private int staff_number;
    private int year;
    private String department;
    private int thesis_num;
    private boolean sex;
    private String ID_number;
    private boolean department_check;
    private boolean boss_check;
    private boolean party_check;
    private boolean college_check;

}
