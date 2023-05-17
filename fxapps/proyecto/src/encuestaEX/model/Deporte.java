package encuestaEX.model;

public enum Deporte {
    FUTBOL("Fútbol"),BALONCESTO("Baloncesto"),BEISBOL("Beisbol"),
    RUGBY("Rugby"),NATACION("Natación");

    private String nombre;

    private Deporte(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
}
