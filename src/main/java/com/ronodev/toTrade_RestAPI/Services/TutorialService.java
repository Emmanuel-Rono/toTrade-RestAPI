package com.ronodev.toTrade_RestAPI.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import com.ronodev.toTrade_RestAPI.Model.LearningTutorials;
import com.ronodev.toTrade_RestAPI.Repository.TutorialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TutorialService {
    @Autowired
    TutorialsRepository tutorialRepository;

    public List<LearningTutorials> getAllTutorials(String title) {
        List<LearningTutorials> tutorials = new ArrayList<>();
        if (title == null) {
            tutorialRepository.findAll().forEach(tutorial -> tutorials.add((LearningTutorials) tutorial));
        } else {
            tutorialRepository.findByTitleContaining(title).forEach(tutorial -> tutorials.add((LearningTutorials) tutorial));
        }
        return tutorials;
    }
    }


