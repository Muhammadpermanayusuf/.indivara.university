package com.indivara.university.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table
public class Student implements Serializable {
    @Id
    @GeneratedValue

    private Long studentID;
    private String studentName;
    private String dateOfBirth;
    private String major;
    private String faculty;
    private String gender;
    private String email;
    private String contactPerson;
    private String address;
    private String username;
    private String password;


}
