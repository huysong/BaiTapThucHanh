package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        int result = analyzer.countExcellentStudents(
                Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
        );

        System.out.println("So hoc sinh gioi: " + result);
    }
}