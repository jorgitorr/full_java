public enum Casa {
    HUFFLEPUFF("Hufflepuff"), RAVENCLAW("Ravenclaw"), GRYFFINDOR("Gryffindor"),
    SLYTHERIN("Slytherin");
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    private Casa(String nombre) {
        this.nombre = nombre;
    }

    
}
