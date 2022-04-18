package com.indivara.university.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Entity
@Table
public class Lecturer implements  Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long lecturerID;
    private String name;
    private String dateOfBirth;
    private String education;
    private String major;
    private String sex;
    private String email;
    private String contactPerson;
    private String address;
    private String username;
    private String password;





}
