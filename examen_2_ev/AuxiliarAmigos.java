package examen_2_ev;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class AuxiliarAmigos {

    public static Usuario masAmigos(List<Usuario>usuarios){        
        Usuario usuarioMasAmigos = null;
        
        List<Usuario>usuariosAux = new ArrayList<>(usuarios);
        Collections.sort(usuariosAux,new ComparatorUsuario());
        
        usuarioMasAmigos = usuariosAux.get(0);
        return usuarioMasAmigos;
    }
    
    public static int cantidadAmigoEnComun(Usuario u1, Usuario u2){
        List<Usuario>amigosComun = new ArrayList<>(u1.getAmigos());

        amigosComun.retainAll(u2.getAmigos());
        
        return amigosComun.size();
    }
    /**
     * método que devuelve el amigo del amigo del usuario pasado por parámetros que
     * más se repite
     * @param usuario
     * @return usuario que más se repite
     */
    public static Usuario sugerirAmigoA(Usuario usuario){
        Set<Usuario>amigos = usuario.getAmigos();
        Set<Usuario>amigosDeAmigos = null;
        Usuario masMencionado = null;
        Map<Usuario,Integer>recomendaciones_amigos = new HashMap<>();
        
        
        
        for(Usuario amigoDeAmigo: amigos){
            amigosDeAmigos = amigoDeAmigo.getAmigos();  
            for(Usuario amigoDeAmigoDeAmigo: amigosDeAmigos){
                if(recomendaciones_amigos.containsKey(amigoDeAmigo))
                    recomendaciones_amigos.put(amigoDeAmigoDeAmigo, recomendaciones_amigos.get(amigoDeAmigo)+1);
                else
                    recomendaciones_amigos.put(amigoDeAmigoDeAmigo, 1);
            }
        }
        
        int numVeces = 0;
        //recorre el mapa y me escoge el que tenga el int más grande
        for(Usuario user: recomendaciones_amigos.keySet()){
            if(numVeces<recomendaciones_amigos.get(user) && !user.equals(usuario)){
                masMencionado = user;
                numVeces = recomendaciones_amigos.get(user);
            }
            
        }
        return masMencionado;
    }
}
