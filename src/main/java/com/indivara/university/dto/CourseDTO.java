package com.indivara.university.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    private long subjectID;
    private int studentID;
    private String subjectName;
    private String day;
    private String timeTable;
    private String collegeCredits;
    private int period;
}
