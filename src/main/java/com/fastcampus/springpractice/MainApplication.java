package com.fastcampus.springpractice;


import com.fastcampus.springpractice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;

import org.springframework.context.event.EventListener;




@RequiredArgsConstructor
@SpringBootApplication
public class MainApplication {



    private final StudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        studentService.printStudent("jack");
        studentService.printStudent("jack");
        studentService.printStudent("jack");
        studentService.printStudent("fred");
        studentService.printStudent("cassie");
        studentService.printStudent("cassie");
    }



}
