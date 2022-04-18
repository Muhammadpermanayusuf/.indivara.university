package com.indivara.university.repository;

import com.indivara.university.entity.RecordAchievement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

public interface RecordAchievementRepository extends JpaRepository<RecordAchievement, Long> {


    //@Query(
    //       value = "SELECT studentID, subjectID, period, quiz, mid_test, final_test, quiz+mid_Test+final_Test/3 as total , CASE WHEN quiz+mid_test+final_test/3 between 0 and 39 then 'E' WHEN quiz+mid_test+final_test/3 between 40 and 54 then 'D' WHEN quiz+mid_test+final_test/3 between 55 and 69 then 'C' WHEN quiz+mid_test+final_test/3 between 70 and 84 then 'B' ELSE 'A' END FROM record_achievement  WHERE studentID = ?", nativeQuery = true
   // )
  // List<RecordAchievement> getRecordAchievementByStudentID();
    RecordAchievement findRecordAchievementByStudentID(Integer studentID);


}