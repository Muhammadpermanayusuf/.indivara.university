package com.indivara.university.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table
public class RecordAchievement implements Serializable {
    @Id
    @GeneratedValue
    private long recordID;
    private int lecturerID;
    private int studentID;
    private int subjectID;
    private int period;
    private double quiz;
    private double midTest;
    private double finalTest;
    private double total;
    private String grade;

}
