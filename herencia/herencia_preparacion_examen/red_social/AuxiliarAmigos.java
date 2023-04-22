import java.util.Set;

public class AuxiliarAmigos {
    /**
     * Usuario con más amigos
     */
    public static Usuario masAmigos(Set<Usuario>usuarios){
        Usuario usuario = null;
        int numeroAmigos = 0;

        for(Usuario u: usuarios){
            if(u.getNumeroAmigos()>numeroAmigos){
                numeroAmigos = u.getNumeroAmigos();
                usuario = u;
            }
        }
        return usuario;
    }


    /**
     * Sugerir amigo
     */

    
}
