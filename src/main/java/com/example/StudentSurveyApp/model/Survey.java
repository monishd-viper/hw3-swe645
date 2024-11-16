package com.example.StudentSurveyApp.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Entity
@Table(name = "student_survey_form")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL) // Exclude null fields from JSON response
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id") // Explicitly include in JSON
    private Long id;

    @Column(name = "first_name", nullable = false)
    @JsonProperty("firstName") // Map field to JSON
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @JsonProperty("lastName")
    private String lastName;

    @Column(name = "street_address", nullable = false)
    @JsonProperty("streetAddress")
    private String streetAddress;

    @Column(name = "city", nullable = false)
    @JsonProperty("city")
    private String city;

    @Column(name = "state", nullable = false)
    @JsonProperty("state")
    private String state;

    @Column(name = "zip_code", nullable = false)
    @JsonProperty("zipCode")
    private String zipCode;

    @Column(name = "phone_no", nullable = false)
    @JsonProperty("phoneNo")
    private String phoneNo;

    @Column(name = "email_id", nullable = false)
    @JsonProperty("emailId")
    private String emailId;

    @Column(name = "date_of_survey", nullable = false)
    @JsonProperty("dateOfSurvey")
    @JsonFormat(pattern = "yyyy-MM-dd") // Ensure proper JSON date format
    private Date dateOfSurvey;

    @Column(name = "campus_liked_most", nullable = false)
    @JsonProperty("campusLikedMost")
    private String campusLikedMost;

    @Column(name = "interest_source_univ", nullable = false)
    @JsonProperty("interestSourceUniv")
    private String interestSourceUniv;

    @Column(name = "recommend_likely", nullable = false)
    @JsonProperty("recommendLikely")
    private String recommendLikely;
}
