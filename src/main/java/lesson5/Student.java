package lesson5;

import java.util.List;

public class Student {

    private String name;
    private List<Double> grades;
    private String specialty;
    private final Double avergeGrade;

    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
        this.avergeGrade = getAvergeGrade();
    }

    public Double getAvergeGrade(){
        Double sum = 0.0;
        for (Double item:grades) {
            sum = sum + item;
        }
        Double res = sum / grades.size();
        return res;
    }
}
