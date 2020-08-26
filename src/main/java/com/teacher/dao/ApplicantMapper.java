package com.teacher.dao;

import com.teacher.pojo.Applicant;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

public interface ApplicantMapper {
    List<Applicant> queryApplicantList();
    Applicant queryApplicantByID(@Param("id") int id);
    int updateApplicantByID(Applicant applicant);
    int deleteApplicantByID(@Param("id") int id);
    List<Applicant> queryApplicantByStudentName(Map map);
    int addApplicant(Applicant applicant);

}
