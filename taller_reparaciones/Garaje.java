/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_reparaciones;

import java.util.List;

/**
 *
 * @author jorge
 */
public class Garaje {
    private List<Coche>coches;
    
    public void aniadeCoche(Coche unCoche){
        if (!coches.contains(unCoche))
            coches.add(unCoche);
    }
}
