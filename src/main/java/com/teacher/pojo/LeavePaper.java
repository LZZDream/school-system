package com.teacher.pojo;

import java.sql.Time;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeavePaper {
    private int id;
    private int staff_number;
    private Date start_date;
    private Time start_time;
    private Date end_date;
    private Time end_time;
    private boolean personnel_dep_check;
     private boolean academy_check;
    private boolean college_check;
}
