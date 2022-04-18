package com.indivara.university.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Setter
@Getter
@Data
public class RecordDTO {
    @Id
    private long recordID;
    private int studentID;
    private int subjectID;
    private int period;
    private double quiz;
    private double midTest;
    private double finalTest;
    private double total;
    private String grade;
}
