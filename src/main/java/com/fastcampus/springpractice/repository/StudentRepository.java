package com.fastcampus.springpractice.repository;

import com.fastcampus.springpractice.domain.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.Map;


@RequiredArgsConstructor
@Slf4j
@Repository
public class StudentRepository {

    private final Map<String, Student> storage;

    @Cacheable("student")
    public Student getStudent(String name) {
        log.info("[repo] 나의 통행료는 무척 비싸다");
        return storage.get(name);
    }

    public Student enroll(String name, Integer age, Student.Grade grade){
        return storage.put(name, Student.of(name, age, grade));
    }
}
