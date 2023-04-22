import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RedSocial {
    
    //atributos
    private Set<Usuario>usuarios;
    private Set<Grupo>grupos;

    //constructor
    public RedSocial() {
        this.usuarios = new HashSet<>();
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
        String cadena;
        

        while(true){
            cadena = sc.nextLine();
            if(cadena.equals("FIN USUARIOS"))
                break;
            
            String[]lectura = cadena.split(";");
            String nombreReal = lectura[1];
            String nombreUsuario = lectura[0];
            int dia = Integer.parseInt(lectura[lectura.length-1]);
            int mes = Integer.parseInt(lectura[lectura.length-2]);
            int anio = Integer.parseInt(lectura[lectura.length-3]);
            Fecha fecha = new Fecha(dia, mes, anio);


            Usuario u = new Usuario(nombreReal, nombreUsuario, fecha);
            agregaUsuario(u);

            for(int i=2; i<lectura.length-3;i++){
                Grupo grupo = new Grupo(lectura[i]);
                u.agregaGrupo(grupo);
                agregaGrupo(grupo);
            }
        }

        while(true){
            cadena = sc.nextLine();
            if(cadena.equals("FIN AMISTADES"))
                break;

            String[]lectura = cadena.split(":");
            Usuario usuario = buscaUsuario(lectura[0]);
            String[]amigos = lectura[1].split(";");

            for(String a: amigos){
                Usuario amigo = buscaUsuario(a);
                if(a!=null)
                    usuario.agregarAmigo(amigo);
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

    public Set<Usuario> getUsuarios(){
        return this.usuarios;
    }
    
    /**
     * ESTO SOLO LO DEBES HACER SI NO HACES EL MÉTODO sugerirAmigoA
     * Devuelve un mapa cuyas claves están ordenadas claves y son objetos Grupo 
     * Los grupos se ordenan por nombre de grupo.
     * Los valores son conjuntos de usuarios que pertenecen al grupo en cuestión
     * Este conjunto de usuarios también está ordenado por nombre (real) del
     * usuario.
     */
    public Map<Grupo,Set<Usuario>> usuariosGrupos(){
        Map<Grupo,Set<Usuario>> mapa= new HashMap<>();
        
        for(Usuario usuario: usuarios){
            Set<Grupo>grupos = usuario.getGrupos();
            for(Grupo grupo: grupos){
                if(!mapa.containsKey(grupo))
                    mapa.put(grupo, new HashSet<>());
                else if(!mapa.get(grupo).contains(usuario)){
                    mapa.get(grupo).add(usuario);
                }
            }
        }
        return mapa;
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

        RedSocial rs = new RedSocial();
        Usuario lucia = rs.buscaUsuario("lucia");
        Usuario nico = rs.buscaUsuario("nico");
        Usuario sara = rs.buscaUsuario("sara");

        System.out.println("El usuario con mas amigos es: " + 
        AuxiliarAmigos.masAmigos(rs.getUsuarios()));


    }
}
