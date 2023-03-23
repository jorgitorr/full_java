/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_2_ev;

import java.util.Comparator;

/**
 *
 * @author jorge
 */
public class ComparadorGrupos implements Comparator<Grupo>{

    @Override
    public int compare(Grupo o1, Grupo o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }

    
}
