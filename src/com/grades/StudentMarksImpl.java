package com.grades;

public class StudentMarksImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks= new StudentMarks();

        System.out.println("Total marks of Medical stream student= "
                + studentMarks.calculateMarks(80, 55, 75, 98));

        System.out.println("Total marks of non-Medical stream student= "
                + studentMarks.calculateMarks(65, 85, 89));

        System.out.println("Total marks of business stream student = "
                + studentMarks.calculateMarks(85, 65, 78f));

    }
}
