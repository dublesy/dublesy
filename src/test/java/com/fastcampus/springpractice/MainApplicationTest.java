package com.fastcampus.springpractice;

import com.fastcampus.springpractice.service.SortService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Arrays;
import java.util.List;

@EnableCaching
@SpringBootTest
class MainApplicationTest {


    @Autowired
    private SortService sortService;


    @Test
    void main() {
        //given
        List<String> strings = Arrays.asList("1", "3", "4", "2", "6", "5");
        //when & then
        sortService.doSort(strings);

    }
}