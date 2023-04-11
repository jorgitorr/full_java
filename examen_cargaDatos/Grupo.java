public class Grupo {
    private String nombre;
    private boolean publico;
    private String descripcion;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.publico = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        String esPublico = publico?"Sí":"No";
        return  nombre + ", público: " + esPublico + " " + descripcion;
    }
    
}
