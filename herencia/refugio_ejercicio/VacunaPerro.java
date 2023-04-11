package refugio_ejercicio;

public enum VacunaPerro implements Vacuna{
    MOQUILLO("Moquillo canino",true,36),
    PARVOVIRUS("Parvovirus canino",true,36),
    RABIA("Rabia", true, 12),
    ADENOVIRUS("Adenovirus canino tipo I y II",true,36),
    CCORONAVIRUS("Coronavirus",false,0),
    LEPTOSPIRA("Leptopirosis",false,12);
    
    private String nombre;
    private boolean esEsencial;
    private int revacunacion;

    public int getRevacunacion() {
        return revacunacion;
    }

    private VacunaPerro(String nombre, boolean esEsencial, int revacunacion) {
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
