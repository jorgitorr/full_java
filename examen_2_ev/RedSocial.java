package examen_2_ev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class RedSocial {
    //atributos
    private String nombre;
    private static List<Usuario>usuarios;
    private static Set<Grupo>grupos;
    //constructor

    public RedSocial(String nombre) {
        this.nombre = nombre;
        this.usuarios = new LinkedList<>();
        this.grupos = new HashSet<>();
        cargaDatos();
    }

    /**
     * Lo invoca el constructor. Lee las líneas de entrada por teclado
     * y crea los objetos necesarios para cargar con datos los conjuntos
     * de usuarios y grupos dejando inicializados estos atributos
     * determina el modificador de acceso público o privado
     */
    void cargaDatos(){
        Scanner sc = new Scanner(System.in);
        String lineas;
        String[]datos, amigos;
        while(true){
            lineas = sc.nextLine();
            if(lineas.equals("FIN USUARIOS"))
                break;
            
            datos = lineas.split(";");
            Usuario user = new Usuario(datos[0], datos[1]);
            
            int dia = Integer.parseInt(datos[datos.length-1]);
            int mes = Integer.parseInt(datos[datos.length-2]);
            int anio = Integer.parseInt(datos[datos.length-3]);
            
            Fecha fecha = new Fecha(dia,mes,anio);
            user.setRegistro(fecha);//agregar fecha al usuario
            
            for(int i=2; i<datos.length-3;i++){
                Grupo grupo = new Grupo(datos[i]);

                grupos.add(grupo);//agrega grupo a grupos
                
                user.actualizarGrupo(grupo);//guarda en el usuario el grupo
            }
            usuarios.add(user);
        }
        
        while(true){
            lineas = sc.nextLine();
            if(lineas.equals("FIN AMISTADES"))
                break;
            
            datos = lineas.split(":");//lee el usuario con todos sus amigos
            amigos = datos[1].split(";");//separa sus amigos
            
            for(Usuario user:usuarios){
                if(user.getNombreUsuario.equals(datos[0])){
                    for(String nombreAmigo: amigos){
                        for(Usuario amigo:usuarios){
                            if(amigo.getNombreUsuario.equals(nombreAmigo)){
                                user.agregarAmigo(amigo);
                            }
                        }
                    }
                }
            }
            
        }
    }
    
    public Usuario buscaUsuario(String nombreUsuario){
        Usuario usuario = null;
        for (Usuario u: this.usuarios){
            if (u.getNombreUsuario().equals(nombreUsuario))
                usuario = u; 
        }
        return usuario;
    }

    public Grupo buscaGrupo(String nombreGrupo){
        Grupo grupo = null;
        for (Grupo g: this.grupos){
            if (g.getNombre().equals(nombreGrupo))
                grupo = g; 
        }
        return grupo;
    }
    
    public boolean agregaUsuario(Usuario unUsuario){
        return this.usuarios.add(unUsuario);
    }
 
    public boolean agregaGrupo(Grupo unGrupo){
        return this.grupos.add(unGrupo);
    }

    public List<Usuario> getUsuarios(){
        return usuarios;
    }
    
    /**
     * ESTO SOLO LO DEBES HACER SI NO HACES EL MÉTODO sugerirAmigoA
     * Devuelve un mapa cuyas claves están ordenadas claves y son objetos Grupo 
     * Los grupos se ordenan por nombre de grupo.
     * Los valores son conjuntos de usuarios que pertenecen al grupo en cuestión
     * Este conjunto de usuarios también está ordenado por nombre (real) del
     * usuario.
     */
    private Map<Grupo,Set<Usuario>> usuariosGrupos(){
        Map<Grupo, Set<Usuario>>grupoUsuarios = new TreeMap<>(new ComparadorGrupos());
        
        for(Usuario usuario: usuarios){
            for(Grupo grupo: usuario.getGrupos()){
                if(!grupoUsuarios.containsKey(grupo))
                    grupoUsuarios.put(grupo, new TreeSet<>(new ComparatorUsuario()));
                else
                    grupoUsuarios.get(grupo).add(usuario);
            }
        }
        return grupoUsuarios;
    }
    
    public static void main(String[] args) {

        //Crea un objeto RedSocial
        //Obtiene el usuario con nombre de usuario lucia
        //Obtiene el usuario con nombre de usuario nico
        //Obtiene el usuario con nombre de usuario sara
        
        //PRUEBA DE LA CLASE AuxiliarAmigos
        //Muestra el usuario que tiene más amigos
        //Muestra la cantidad de amigos en común que tienen lucia y nico
        //Muestra la cantidad de amigos en común que tienen sara y nico
        //Muestra la cantidad de amigos en común que tienen sara y lucia
        //Muestra el amigo sugerido para nico
        
        //ESTO SOLO LO DEBES HACER SI NO HACES EL MÉTODO sugerirAmigoA
        //Muestra el listado de todos los grupos ordenados alfabéticamente
        //y dentro de cada grupo los usuarios ordenados alfabéticamente
        
        RedSocial rs = new RedSocial("facebook");
        Usuario lucia = rs.buscaUsuario("lucia");
        Usuario nico = rs.buscaUsuario("nico");
        Usuario sara = rs.buscaUsuario("sara");
        
        System.out.println(lucia);
        System.out.println(nico);
        System.out.println(sara);
        
        /*
        métodos estáticos solo pueden acceder a atributos estáticos
        */
        /*AuxiliarAmigos.masAmigos(usuarios);
        System.out.println("amigos en común entre Lucia y Nico: " + 
                AuxiliarAmigos.cantidadAmigoEnComun(lucia,nico));
        System.out.println("Amigos en común entre Sara y Nico: " + 
                AuxiliarAmigos.cantidadAmigoEnComun(sara, nico));
        System.out.println("Amigos entre Sara y Lucia: " + 
                AuxiliarAmigos.cantidadAmigoEnComun(sara, lucia));
        
        System.out.println("amigo recomendado para Nico: " + 
                AuxiliarAmigos.sugerirAmigoA(nico));//probar bien
        
        List<Grupo>gruposOrdenados = new ArrayList<>(grupos);
        Collections.sort(gruposOrdenados);
        
        Map<Grupo,Set<Usuario>>gruposUsuarios = rs.usuariosGrupos();
        
        for(Grupo grupo: gruposUsuarios.keySet()){
            System.out.print(grupo.getNombre() + ": ");
            for(Usuario usuario: gruposUsuarios.get(grupo)){
                System.out.print(usuario + " ");
            }
            System.out.println();
        }*/
        
    }
}
