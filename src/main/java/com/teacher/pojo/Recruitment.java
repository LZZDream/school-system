package com.teacher.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recruitment {
    private int id;
    private String department;
    private int people_number;
    private int review_progress;
    private int review_state;
    private String work_address;
    private float money;
}
