package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  NumRepo extends JpaRepository<Number,String>{

    void savecrdNum(String id);
    
    

}
