package com.fastcampus.springpractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class BubbleSortTest {

    @Test
    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    void given_List_WhenExecuting_ThenReturnSortedList() {


        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 5, 6, 1));

        assertEquals(List.of(1,2,3,5,6), actual);

    }
}