/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_music_temple;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Artist {
    private String name;
    private String surname;

    public Artist(String nombre, String apellido) {
        this.name = nombre;
        this.surname = apellido;
    }
    
    public Artist(String nombre) {
        this(nombre,"");
    }

    public String fullName(){
        String fullName = name;
        if(surname!=null)
            fullName += " " + surname;
        return fullName;
    }

    @Override
    public String toString() {
        return fullName();
    }

    @Override
    public boolean equals(Object obj) {
        boolean equals = false;
        Artist a = (Artist)obj;
        
        if(this.fullName().equals(a.fullName()))
            equals = true;
        
        return equals;
    }

    /*public static void main(String[] args) {
        Artist a = new Artist("Paco");
        System.out.println(a);
    }*/
    
}
