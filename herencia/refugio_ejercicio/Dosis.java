package refugio_ejercicio;

import java.time.LocalDateTime;

public class Dosis {
    private Vacuna vacuna;
    private LocalDateTime fecha;


    public Dosis(Vacuna vacuna) {
        this.vacuna = vacuna;
        this.fecha = LocalDateTime.now();
    }


    public Vacuna getVacuna() {
        return vacuna;
    }


    public LocalDateTime getFecha() {
        return fecha;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((vacuna == null) ? 0 : vacuna.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dosis other = (Dosis) obj;
        if (vacuna == null) {
            if (other.vacuna != null)
                return false;
        } else if (!vacuna.equals(other.vacuna))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "[vacuna=" + vacuna + ", fecha=" + fecha + "]\n";
    }

    

    

}
