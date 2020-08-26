package com.teacher.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applicant {
    private String account;
    private String password;
    private String name;
    private boolean sex;
    private String phone;
    private int interview_schedule;
    private String health_result;
    private String mail;
    private String Intention_job;
    private String intention_money;
    private String technology;
    private String experiences;


}
