public enum Casas {
    HUFFLEPUFF("Hufflepuff"), RAVENCLAW("Ravenclaw"), GRYFFINDOR("Gryffindor"),
    SLYTHERIN("Slytherin");
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    private Casas(String nombre) {
        this.nombre = nombre;
    }

    
}
