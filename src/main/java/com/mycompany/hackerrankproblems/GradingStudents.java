package com.mycompany.hackerrankproblems;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/grading

//if difference between grade and next multiple of 5 is less than 3, then round up to nearest 5
//if grade is less than 38, then do not round
//for 84, round up to 85
//for 28, do not round
//for 57, do not round
public class GradingStudents {
        public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<Integer>();
        
        for ( int i = 0; i < grades.size(); i++ ){
            int currentGrade = grades.get(i);
            int nextMultOfFive = (int)Math.ceil( (double)currentGrade / 5) * 5;
            if ( nextMultOfFive - currentGrade < 3 && currentGrade >= 38 ){
                currentGrade = nextMultOfFive;
            }
            
            roundedGrades.add(i, currentGrade);
        }

        return roundedGrades;
    }
}
