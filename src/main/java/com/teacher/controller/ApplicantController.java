package com.teacher.controller;

import com.teacher.pojo.Applicant;
import com.teacher.service.ApplicantService;
import com.teacher.service.ApplicantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ApplicantController {
    @Autowired
    @Qualifier("ApplicantServiceImpl")
    ApplicantService applicantService;

    @RequestMapping("/aaa")
    public String look(){
        System.out.println("ppp");
        List<Applicant>applicants= applicantService.queryApplicantList();
        for(Applicant app:applicants){
            System.out.println(app.getAccount());
        }
        System.out.println("qqq");
        return "qq";
    }
}
