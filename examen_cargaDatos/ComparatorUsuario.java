
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class ComparatorUsuario implements Comparator<Usuario>{

    @Override
    public int compare(Usuario user1, Usuario user2) {
        if(user1.getAmigos().size()-user2.getAmigos().size()==0){
            return user1.getRegistro().compareTo(user2.getRegistro());
        }else
            return Math.abs(user1.getAmigos().size())-Math.abs(user2.getAmigos().size());
    }
    
}
