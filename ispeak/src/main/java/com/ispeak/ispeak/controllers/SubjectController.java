package com.ispeak.ispeak.controllers;

import com.ispeak.ispeak.models.Subject;
import com.ispeak.ispeak.services.SubjectService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ispeak/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping("/get-all-subjects")
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }
}
