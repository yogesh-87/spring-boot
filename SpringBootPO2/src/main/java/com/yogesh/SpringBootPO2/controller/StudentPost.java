package com.yogesh.SpringBootPO2.controller;

import com.yogesh.SpringBootPO2.dto.StudentRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentPost {

    @PostMapping("/create")
    public String createStudent(@RequestBody StudentRequest request){

        return "Student Created "+request.getName();
    }
}
