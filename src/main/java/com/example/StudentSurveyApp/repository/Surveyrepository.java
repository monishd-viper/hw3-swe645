package com.example.StudentSurveyApp.repository;

import com.example.StudentSurveyApp.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Surveyrepository extends JpaRepository<Survey, Long> {

}
