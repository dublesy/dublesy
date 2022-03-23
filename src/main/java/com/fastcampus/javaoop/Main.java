package com.fastcampus.javaoop;

import com.fastcampus.javaoop.logic.JavaSort;
import com.fastcampus.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sort<String> bubbleSort = new JavaSort<>();
        System.out.println("[result]" + bubbleSort.sort(Arrays.asList(args)));
    }
}
