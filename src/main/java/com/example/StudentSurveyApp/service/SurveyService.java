package com.example.StudentSurveyApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentSurveyApp.model.Survey;
import com.example.StudentSurveyApp.repository.Surveyrepository;

@Service
public class SurveyService {
	
	@Autowired
	private Surveyrepository surveyrepository;
	
	public List<Survey> findAll() {
		return surveyrepository.findAll();
	}
	
	public Survey addStudent(Survey survey) {
        return surveyrepository.save(survey);
    }
}
