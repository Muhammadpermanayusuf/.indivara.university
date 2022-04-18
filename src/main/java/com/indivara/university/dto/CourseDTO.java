package com.indivara.university.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    private long subjectID;
    private String studentName;
    private String subjectName;
    private String major;
    private String faculty;
    private String day;
    private String timeTable;
    private String collegeCredits;
    private int period;
}
