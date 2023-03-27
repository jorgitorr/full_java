/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_4;

/**
 *
 * @author jorgearru
 */
public class Student extends Person{
    private int numCourses;
    private String[]courses;
    private int[]grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String adress) {
        super(name, adress);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }
    
    public void addCourseGrade(String course, int grade){
        if(numCourses<MAX_COURSES){
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        }
    }
    
    public void printGrades(){
        for(int grade:grades){
            if(grade!=0)
                System.out.println(grade);
        }
    }
    
    public double getAverageGrade(){
        int media = 0;
        if(grades.length>0){
            for(int grade:grades)
                media += grade;
        }
        return media/numCourses;//entre numero de cursos
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    public static void main(String[] args) {
        Student student1 = new Student("Paco", "Estadio");
        student1.addCourseGrade("1 DAM", 6);
        student1.addCourseGrade("1 DAW", 10);
        student1.printGrades();
        System.out.println(student1.getAverageGrade());
        System.out.println(student1);
    }
    
}
