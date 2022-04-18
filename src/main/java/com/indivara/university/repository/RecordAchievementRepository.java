package com.indivara.university.repository;

import com.indivara.university.dto.RecordDTO;
import com.indivara.university.entity.RecordAchievement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

public interface RecordAchievementRepository extends JpaRepository<RecordAchievement, Long> {


    @Query(
           value = "SELECT  ra.recordID, ra.lecturerID, ra.studentID, ra.subjectID, ra.period, ra.quiz, ra.mid_test, ra.final_test, (ra.quiz + ra.mid_test + ra.final_test)/3 as total , " +
                   "CASE " +
                   "WHEN ra.quiz+ra.mid_test+ra.final_test/3 between 00.00 and 39.99 then 'E' " +
                   "WHEN ra.quiz+ra.mid_test+ra.final_test/3 between 40.00 and 54.99 then 'D'" +
                   " WHEN ra.quiz+ra.mid_test+ra.final_test/3 between 55.00 and 69.99 then 'C' " +
                    "WHEN ra.quiz+ra.mid_test+ra.final_test/3 between 70.00 and 84.99 then 'B' " +
                   "ELSE 'A' END grade FROM record_achievement as ra  WHERE ra.studentID = :studentID", nativeQuery = true
    )
    List <RecordAchievement> findRecordAchievementByStudentID(@Param("studentID") Integer studentID);
  // List<RecordAchievement> getRecordAchievementByStudentID();
  //@Query(nativeQuery = true)
 // RecordDTO findRecordAchievementByStudentID_Named(Integer id);


}