package com.edigest.My.first.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller  {
    @GetMapping("abc")
    public String sayHello(){

        return "hello name is akash";
    }


}
