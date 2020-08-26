import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

import com.teacher.dao.ApplicantMapper;
import com.teacher.pojo.Applicant;
import com.teacher.service.ApplicantService;
import com.teacher.service.ApplicantServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;



public class haha {
    @Autowired
    private ApplicantService applicantServiceImpl;
    @Test
    public  void aa() {


        List<Applicant> applicant=applicantServiceImpl.queryApplicantList();
        for(Applicant aa:applicant){
            System.out.println(aa.getAccount());
        }


    }
}
