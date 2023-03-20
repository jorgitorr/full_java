
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alumno
 */
public class AuxiliarAmigos {
    
    /*son metodos son estáticos porque accede a parametros que
    están fuera de la clase y porque no instancio la clase*/
    /**
     * obtiene la lista ordenada
     * @param usuarios
     * @return 
     */
    public static List<Usuario>getUsuarios(Set<Usuario>usuarios){
        
        return usuariosAux;
    }
    
    
    public static Usuario masAmigos(Set<Usuario>usuarios){        
        Usuario usuarioMasAmigos = null;
        
        List<Usuario>usuariosAux = new ArrayList<>(usuarios);
        Collections.sort(usuariosAux,new ComparatorUsuario());
        
        List<Usuario>usuariosAux = getUsuarios(usuarios);
        usuarioMasAmigos = usuariosAux.get(0);
        return usuarioMasAmigos;
    }
    
    private Usuario sugerirAmigoA(Usuario usuario){
        Set<Usuario>amigos = usuario.getAmigos();
        Set<Usuario>amigosDeAmigos = null;
        Map<Usuario,Integer>recomendaciones_amigos = null;
        Usuario masMencionado = null;
        
        if(recomendaciones_amigos==null)
            recomendaciones_amigos = new HashMap<>();
        
        for(Usuario amigoDeAmigo: amigos){
            amigosDeAmigos = amigoDeAmigo.getAmigos();  
            int cont = 0;
            for(Usuario amigoDeAmigoDeAmigo: amigosDeAmigos){
                if(recomendaciones_amigos.containsKey(amigoDeAmigo))
                    recomendaciones_amigos.put(amigoDeAmigoDeAmigo, recomendaciones_amigos.get(amigoDeAmigo)+1);
                else
                    recomendaciones_amigos.put(amigoDeAmigoDeAmigo, 1);
            }
        }
        //recorre el mapa y me escoge el que tenga el int más grande
        for(Usuario user: recomendaciones_amigos.keySet()){
            int numVeces = 0;
            
            if(numVeces<recomendaciones_amigos.get(user)){
                masMencionado = user;
                numVeces = recomendaciones_amigos.get(user);
            }
            
        }

        return masMencionado;

    }

    
}
