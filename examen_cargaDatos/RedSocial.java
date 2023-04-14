
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RedSocial {
    //atributos
    private String nombre;
    private Set<Usuario>usuarios;
    private Set<Grupo>grupos;
    //constructor

    public RedSocial(String nombre) {
        this.nombre = nombre;
        this.usuarios = new LinkedHashSet<>();
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
        String linea;
        int pos = 0;
        String[]partes;
        if(usuarios == null)
            usuarios = new HashSet<>();
        
        while(true){
            linea = "";
            partes = new String[10];
            Usuario user = null;
            
            linea = sc.nextLine();
            
            if(linea.equals("FIN USUARIOS"))
                break;
            
            partes = linea.split(";");
            user = new Usuario(partes[0], partes[1]);
            int dia = Integer.parseInt(partes[partes.length-1]);
            int mes = Integer.parseInt(partes[partes.length-2]);
            int anio = Integer.parseInt(partes[partes.length-3]);
            Fecha fecha = new Fecha(dia,mes,anio);
            
            
            
            user.setRegistro(fecha);
            
            usuarios.add(user);
        }
        
        while(true){
            linea = "";
            partes = new String[10];
            Usuario user = null;
            Usuario amigo = null;
            
            linea = sc.nextLine();
            if(linea.equals("FIN AMISTADES"))
                break;
            
            partes = linea.split(":");
            String[]partesAmigos = new String[6];
            partesAmigos = partes[1].split(";");
            
            Usuario u = buscaUsuario(partes[0]);
            for(int i=0; i<partesAmigos.length; i++){
                Usuario a = new Usuario(partesAmigos[i]);
                u.agregarAmigo(a);
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
        return null;
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
        RedSocial r = new RedSocial("ZonaFP");
        Usuario lucia = r.buscaUsuario("lucia");
        Usuario nico = r.buscaUsuario("lucia");
        Usuario sara = r.buscaUsuario("sara");
        System.out.println(lucia);
        
    }
}
