package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SortServiceTest {


    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void test() {
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        Assertions.assertEquals(List.of("1","2","3"), actual);
    }

}