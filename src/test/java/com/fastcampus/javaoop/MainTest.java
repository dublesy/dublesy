package com.fastcampus.javaoop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MainTest {
    @Test
    void main() {
        //given
        String[] stringList = {"1","3","4","2","6","5" };
        //when & then
        Main.main(stringList);
    }
}