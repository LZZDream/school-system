package com.teacher.service;

import com.teacher.dao.ApplicantMapper;
import com.teacher.pojo.Applicant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    private ApplicantMapper applicantMapper;
    @Autowired
    public void setApplicantMapper(ApplicantMapper applicantMapper){this.applicantMapper=applicantMapper;}

    @Override
    public List<Applicant> queryApplicantList() {
        return applicantMapper.queryApplicantList();
    }
}
