package com.grades;

public class StudentMarks {

    //define class for medical student
    public int calculateMarks(int math, int physics, int chemistry, int biology)
    {
        int sum= math+ physics+ chemistry+ biology;
        return sum;
    }

    //overload the method for non-medical student
    public int calculateMarks(int math, int physics, int chemistry)
    {
        int sum= math + physics+ chemistry;
        return sum;
    }

    //overload the method for business pathway
    public float calculateMarks(int businessStudies, int finance, float accounting)
    {
        float sum= businessStudies + finance +accounting;
        return sum;
    }

}

