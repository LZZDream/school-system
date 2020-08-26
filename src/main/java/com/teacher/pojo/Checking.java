package com.teacher.pojo;


import java.sql.Date;
import java.sql.Time;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Checking {
    private int id;
    private int staff_number;
    private Date date;
    private Time start_time;
    private Time end_time;


}
