package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class api_1 {
   

    @GetMapping("/index")
    public String index()
    {
        return "index;";
    }

   
}
