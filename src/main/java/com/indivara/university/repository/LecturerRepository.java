package com.indivara.university.repository;

import com.indivara.university.entity.Lecturer;
import com.indivara.university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository extends JpaRepository<Lecturer, Long> {

    Lecturer findByName(String name);

    Lecturer findByUsernameAndPassword(String username, String password);
}
