package com.ispeak.ispeak.services;

import com.ispeak.ispeak.models.Subject;
import com.ispeak.ispeak.repositories.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    public final SubjectRepository subjectRepository;

    public SubjectService(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

}
