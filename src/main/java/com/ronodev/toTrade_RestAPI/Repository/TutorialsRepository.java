package com.ronodev.toTrade_RestAPI.Repository;

import com.ronodev.toTrade_RestAPI.Model.LearningTutorials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialsRepository extends JpaRepository<LearningTutorials, Long> {


    Iterable<Object> findBytitle(String title);

    Iterable<Object> findByTitleContaining(String title);


    //Repository code- Handle access to data in the database



}
