package com.indivara.university.entity;
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
public class Subject implements Serializable{
    @Id
    @GeneratedValue
    private long subjectID;
    private String subjectName;
    private String day;
    private String timeTable;
    private String collegeCredits;

}
