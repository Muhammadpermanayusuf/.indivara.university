package com.indivara.university.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
public class Course implements Serializable {
    @Id
    @GeneratedValue
    private long courseID;
    private int studentID;
    private int subjectID;
    private int lecturerID;
    private int period;










}



