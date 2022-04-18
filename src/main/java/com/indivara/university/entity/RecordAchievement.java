package com.indivara.university.entity;

import com.indivara.university.dto.RecordDTO;
import lombok.*;

import javax.persistence.*;
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
    private int studentID;
    private int lecturerID;
    private int subjectID;
    private int period;
    private double quiz;
    private double midTest;
    private double finalTest;
    private double total;
    private String grade;

}
