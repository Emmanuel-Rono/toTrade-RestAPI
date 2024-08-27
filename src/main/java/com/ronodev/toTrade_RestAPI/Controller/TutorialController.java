package com.ronodev.toTrade_RestAPI.Controller;


import com.ronodev.toTrade_RestAPI.Model.LearningTutorials;
import com.ronodev.toTrade_RestAPI.Services.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class TutorialController {
    TutorialService tutorialService;
    @Autowired

    public TutorialController (TutorialService tutorialService){
        this.tutorialService=tutorialService;
    }


    @GetMapping("/tutorials")
    public ResponseEntity<List<LearningTutorials>> getAllTutorials(@RequestParam(required = false) String title) {
        try {
            List<LearningTutorials> tutorials = tutorialService.getAllTutorials(title);
            if (tutorials.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    }


