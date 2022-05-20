package com.example.Controller;



import com.example.repository.NumRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class api_1 {
   
    @Autowired
    private NumRepo numRepo;
    
    @GetMapping("/index")
    public String index()
    {
        return "index";
    }

    @PostMapping("/card-scheme/verify/{id}")
    public ResponseEntity<HttpStatus> getCrdDetails(@PathVariable String id)
    {
        try
        {
         numRepo.savecrdNum(id);
         return new ResponseEntity<>(HttpStatus.OK);

        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
 
    }

}

