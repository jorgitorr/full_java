
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RedSocial {
    //atributos
    private String nombre;
    private List<Usuario>usuarios;
    private Set<Grupo>grupos;
    //constructor

    public RedSocial(String nombre) {
        this.nombre = nombre;
        this.usuarios = new LinkedList<>();
        this.grupos = new HashSet<>();
    }

    /**
     * Lo invoca el constructor. Lee las líneas de entrada por teclado
     * y crea los objetos necesarios para cargar con datos los conjuntos
     * de usuarios y grupos dejando inicializados estos atributos
     * determina el modificador de acceso público o privado
     */
    void cargaDatos(){
        
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

    }
}
