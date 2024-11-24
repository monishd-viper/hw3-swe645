use survey1;
CREATE TABLE student_survey_form (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    street_address VARCHAR(150) NOT NULL,  
    city VARCHAR(50) NOT NULL,
    state CHAR(2) NOT NULL,          
    zip_code VARCHAR(10) NOT NULL,   
    phone_no VARCHAR(15) NOT NULL,      
    email_id VARCHAR(150) NOT NULL,     
    date_of_survey DATE NOT NULL,
    campus_liked_most VARCHAR(50) NOT NULL, 
    interest_source_univ VARCHAR(50) NOT NULL,  
    recommend_likely VARCHAR(20) NOT NULL 
);

select * from student_survey_form;
SHOW TABLES;

INSERT INTO student_survey_form (
    first_name, 
    last_name, 
    street_address, 
    city, 
    state, 
    zip_code, 
    phone_no, 
    email_id, 
    date_of_survey, 
    campus_liked_most, 
    interest_source_univ, 
    recommend_likely
) VALUES (
    'Jane', 
    'Smith', 
    '11104 cavalier', 
    'Fairfax', 
    'VA', 
    '22030', 
    '571-555-5678', 
    'jane.smith@gmail.com', 
    '2024-10-20', 
    'Students', 
    'Friends', 
    'Likely'
);

INSERT INTO student_survey_form (
    first_name, 
    last_name, 
    street_address, 
    city, 
    state, 
    zip_code, 
    phone_no, 
    email_id, 
    date_of_survey, 
    campus_liked_most, 
    interest_source_univ, 
    recommend_likely
) VALUES (
    'Alice', 
    'Johnson', 
    '789 Trillium Apt', 
    'Denver', 
    'CO', 
    '80203', 
    '555-9012', 
    'alice.johnson@example.com', 
    '2024-09-15', 
    'Sports', 
    'Television', 
    'Unlikely'
);

INSERT INTO student_survey_form (
    first_name, 
    last_name, 
    street_address, 
    city, 
    state, 
    zip_code, 
    phone_no, 
    email_id, 
    date_of_survey, 
    campus_liked_most, 
    interest_source_univ, 
    recommend_likely
) VALUES (
    'Michael', 
    'Brown', 
    '456 Pine Avenue', 
    'Seattle', 
    'WA', 
    '98101', 
    '206-555-3456', 
    'michael.brown@example.com', 
    '2024-11-01', 
    'Campus Library', 
    'Internet', 
    'Very Likely'
);

SELECT * FROM student_survey_form;

