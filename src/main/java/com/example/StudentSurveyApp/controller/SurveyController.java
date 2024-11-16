package com.example.StudentSurveyApp.controller;

import com.example.StudentSurveyApp.model.Survey;
import com.example.StudentSurveyApp.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/student_survey_form")
public class SurveyController {
    @Autowired
    private SurveyService surveyservice;

    @GetMapping(value="/getAllStudent")
    public List<Survey> getAll() {
        return surveyservice.findAll();
    }

    @PostMapping("/addStudent")
    public Survey addstudent(@RequestBody Survey survey) {
        return surveyservice.addStudent(survey);
    }
  
}
