package com.example.Service;

import com.example.repository.NumRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1 {
    
    @Autowired
    private NumRepo numberRepo;
    
    public void savecrdNum(Number num)
    {
         numberRepo.save(num);
    }
    
}
