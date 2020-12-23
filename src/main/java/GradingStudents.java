
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author walde
 */
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
