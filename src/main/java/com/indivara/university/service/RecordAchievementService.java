package com.indivara.university.service;

import com.indivara.university.entity.RecordAchievement;
import com.indivara.university.entity.Student;
import com.indivara.university.repository.RecordAchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordAchievementService {

    @Autowired
    private RecordAchievementRepository recordAchievementRepository;

    public RecordAchievement saveRecordAchievement(RecordAchievement recordAchievement){
        return recordAchievementRepository.save(recordAchievement);
    }

    public RecordAchievement getRecordAchievementByStudentID(Integer studentID) {
        return recordAchievementRepository.findRecordAchievementByStudentID(studentID);
    }

    public RecordAchievement updateRecordAchievement(RecordAchievement recordAchievement) {
        RecordAchievement existingRecordAchievement = recordAchievementRepository.getById(recordAchievement.getRecordID());
        existingRecordAchievement.setQuiz(recordAchievement.getQuiz());
        existingRecordAchievement.setMidTest(recordAchievement.getMidTest());
        existingRecordAchievement.setFinalTest(recordAchievement.getFinalTest());

        return recordAchievementRepository.save(existingRecordAchievement);
    }

}
