package com.teacher.pojo;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeadStaff {
    private int staff_number;
    private String home_address;
    private String relation_name;
    private String ID_number;
    private String phone;
    private boolean subsidy;
    private Date subsidy_time;
    private String specific_contect;
}
