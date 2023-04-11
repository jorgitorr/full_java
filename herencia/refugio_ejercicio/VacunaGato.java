package refugio_ejercicio;

public enum VacunaGato implements Vacuna{
    HERPES("Herpes Felino TIpo 1", true,36),
    CALICIVIRUS("Calicivirus Felino",true,36),
    PANLEUCOPENIA("Panleucopenia Felina",true,36),
    FCORONAVIRUS("Coronavirus",false,0),
    PERITONITIS("Peritonitis Infecciosa Felina",false,12);
    
    private String nombre;
    private boolean esEsencial;
    private int revacunacion;

    public int getRevacunacion() {
        return revacunacion;
    }

    private VacunaGato(String nombre, boolean esEsencial, int revacunacion) {
        this.nombre = nombre;
        this.esEsencial = esEsencial;
        this.revacunacion = revacunacion;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public boolean esEsencial() {
        return esEsencial;
    }
}
