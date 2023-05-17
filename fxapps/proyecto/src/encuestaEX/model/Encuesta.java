package encuestaEX.model;

import java.util.List;

public class Encuesta {
    private String profesion;
    private int numHermanos;
    private int edad;
    private char sexo;
    private Deporte deporte;
    private List<Integer>aficciones;


    public Encuesta(String profesion, int numHermanos, int edad, char sexo) {
        this.profesion = profesion;
        this.numHermanos = numHermanos;
        this.edad = edad;
        this.sexo = sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }


    public void setAficciones(List<Integer> aficciones) {
        this.aficciones = aficciones;
    }


    @Override
    public String toString() {
        return "profesion=" + profesion + ", numHermanos=" + numHermanos + ", edad=" + edad + ", sexo=" + sexo
                + ", deporte=" + deporte.getNombre();
    }

    

    
}
