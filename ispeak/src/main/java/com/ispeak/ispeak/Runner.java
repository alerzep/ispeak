package com.ispeak.ispeak;

import com.ispeak.ispeak.models.Subject;
import com.ispeak.ispeak.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Runner {

    @Autowired
    SubjectRepository subjectRepository;

    public void run(String... args) throws Exception{

        Subject presentSimple = new Subject();
        Subject presentContinous = new Subject();
        presentSimple.setName("Present Simple");
        presentContinous.setName("Present Continous");
    }
}
