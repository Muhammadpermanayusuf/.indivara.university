package com.indivara.university.controller;

import com.indivara.university.entity.RecordAchievement;
import com.indivara.university.service.RecordAchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NonUniqueResultException;

@RestController
public class RecordAchievementController {
    @Autowired
    private RecordAchievementService recordAchievementService;
    
    @PostMapping("/addRecord")
    public RecordAchievement addRecordAchievement(@RequestBody RecordAchievement recordAchievement ){
        return recordAchievementService.saveRecordAchievement(recordAchievement);
    }
    @GetMapping("/studentScore")
    public RecordAchievement findByRecordAchievementByStudentID(@RequestParam Integer studentID)  {
        return recordAchievementService.getRecordAchievementByStudentID(studentID);
    }
}
