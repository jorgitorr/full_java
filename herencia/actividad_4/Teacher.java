/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_4;

/**
 *
 * @author jorgearru
 */
public class Teacher extends Person{
    private int numCourses;
    private String[]courses;
    private static final int MAX_COURSES = 5;

    public Teacher(String name, String adress) {
        super(name, adress);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }
    
    public boolean addCourse(String course){
        boolean esIgual = true;
        for(int i=0; i<numCourses; i++){
            if(courses[i].equals(course)){
                esIgual = false;
                break;
            }
        }
        courses[numCourses] = course;
        numCourses++;
        
        return esIgual;
    }
    
    public boolean removeCourse(String course){
        boolean esIgual = false;
        
        for(int i=0; i<numCourses; i++){//IMPORTANTE PONER RECORRER HASTA NUMCOURSES 
            if(courses[i].equals(course)){//
                    esIgual = true;
                    courses[i] = null;
            }
        }
        
        return esIgual;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public void imprimirCursos(){
        for(String course: courses){
            if(course!=null)
                System.out.println(course);
        }
    }
    
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Gabriela", "Puerto");
        teacher1.addCourse("2 DAM");
        teacher1.addCourse("1 DAM");
        teacher1.addCourse("2 DAM");
        teacher1.removeCourse("1 DAM");
        teacher1.imprimirCursos();
    }
    
    
    
    
}
