/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_2_ev;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author jorge
 */
public class RedSocial {
    private String nombre;
    private List<Usuario>usuarios;

    public RedSocial(String nombre) {
        this.nombre = nombre;
        this.usuarios = new LinkedList<>();
        cargarDatos();
    }
    
    /**
     * @return devuelve usuario
     * @param keyword: nombre del usuario
     */
    private Usuario buscaUsuario(String keyword){
        Usuario usuario = null;
        for(Usuario user:usuarios){
            if(user.getNombre().equals(keyword))
                usuario = user;
        }
        return usuario;
    }

    /**
     * busca el usuario
     * @return 
     */
    private Usuario buscaElMayorUsuario(){
        Usuario usuario = null;
        Map<Usuario,Integer>usuarioCantidad = new HashMap<>();
        
        for(Usuario user:usuarios){
            if(usuarioCantidad.containsKey(usuario))
                usuarioCantidad.put(user, usuarioCantidad.get(user)+1);
            else
                usuarioCantidad.put(user, 1);
        }
        return usuario;
    }
    
    public void cargarDatos(){
        Scanner sc = new Scanner(System.in);
        String leerDatos;
        String[]datos;
        
        do{
            Grupo grupo = null;
            datos = new String[10];
            
            leerDatos = sc.nextLine();
            if(leerDatos.equals("FIN USUARIOS"))
                break;
            
            datos = leerDatos.split(";");
            
            String[]fecha = datos[datos.length-1].split(":");
            
            int dia = Integer.parseInt(fecha[0].trim());
            int mes =Integer.parseInt(fecha[1].trim());
            int anio = Integer.parseInt(fecha[2].trim());  
            
            List<Grupo>grupos = null;
            
            for(int i=datos.length-2; i>0; i--){
                if(grupos==null)
                    grupos = new ArrayList<>();
                
                grupo = new Grupo(datos[i]);
                grupos.add(grupo);
            }
            
            Usuario usuario = new Usuario(datos[0], grupos, new Fecha(dia,mes,anio));
            
            usuarios.add(usuario);
        }while(!leerDatos.equals("FIN USUARIOS"));
        
        //segunda parte lectura
        do{
            leerDatos = sc.nextLine();
            if(leerDatos.equals("FIN AMISTADES"))
                break;
            //reinicio e inicio de variables
            datos = new String[10];
            String[]amigos = new String[10];
            Usuario usuario = null;
            Usuario amigo = null;
            
            datos = leerDatos.split(";");
            amigos = datos[1].split(":");
            
            usuario = buscaUsuario(datos[0]);
            for(int i=0; i<amigos.length;i++){
                amigo = buscaUsuario(amigos[i]);
                usuario.addAmigo(amigo);
            }
            
        }while(!leerDatos.equals("FIN AMISTADES"));
    }
    
    public static void main(String[] args) {
        RedSocial facebook = new RedSocial("facebook");
        facebook.buscaElMayorUsuario();
        
    }
}


