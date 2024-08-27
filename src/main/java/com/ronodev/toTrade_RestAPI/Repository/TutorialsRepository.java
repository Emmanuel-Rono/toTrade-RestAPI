package com.ronodev.toTrade_RestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialsRepository extends JpaRepository {


    Iterable<Object> findBytitle(String title);

    Iterable<Object> findByTitleContaining(String title);


    //Repository code- Handle access to data in the database



}
