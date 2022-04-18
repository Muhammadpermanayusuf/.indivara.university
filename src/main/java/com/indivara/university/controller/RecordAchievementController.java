package com.indivara.university.controller;

import com.indivara.university.dto.RecordDTO;
import com.indivara.university.entity.RecordAchievement;
import com.indivara.university.service.RecordAchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.NonUniqueResultException;
import java.util.List;

@RestController
public class RecordAchievementController {
    @Autowired
    private RecordAchievementService recordAchievementService;
    
    @PostMapping("/addRecord")
    public RecordAchievement addRecordAchievement(@RequestBody RecordAchievement recordAchievement ){
        return recordAchievementService.saveRecordAchievement(recordAchievement);
    }
    @GetMapping("/studentRecord")
    public List<RecordAchievement> findByRecordAchievementByStudentID(@RequestParam Integer studentID)  {
        return recordAchievementService.getRecordAchievementByStudentID(studentID);
    }
}
