package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JavaSortTest {

    @Test
    @DisplayName("자바소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    void given_List_WhenExecuting_ThenReturnSortedList() {


        JavaSort<Integer> bubbleSort = new JavaSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 5, 6, 1));

        assertEquals(List.of(1,2,3,5,6), actual);

    }
}