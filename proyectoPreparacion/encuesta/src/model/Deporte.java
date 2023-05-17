package model;

public enum Deporte {
    TENIS("Tenis"),FUTBOL("Futbol"),BALONCESTO("Baloncesto");
    private String nombre;

    private Deporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    
}
