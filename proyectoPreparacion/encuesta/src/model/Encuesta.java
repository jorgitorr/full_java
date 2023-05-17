package model;

import java.util.List;

public class Encuesta {
    private String profesion;
    private int numHermanos;
    private int edad;
    private char sexo;
    private Deporte deporte;
    private List<Double>aficcion;
    
    public Encuesta(String profesion, int numHermanos, int edad, char sexo) {
        this.profesion = profesion;
        this.numHermanos = numHermanos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public void setAficcion(List<Double> aficcion) {
        this.aficcion = aficcion;
    }


    public String getProfesion() {
        return profesion;
    }

    public int getNumHermanos() {
        return numHermanos;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    @Override
    public String toString() {
        return profesion + ";" + numHermanos + ";" + edad + ";" + sexo
                + ";" + deporte ;
    }

    public List<Double> getAficcion() {
        return aficcion;
    }

    /**
     * @return nombre del sexo completo
     */
    public String obtieneSexoCompleto(){
        String sexoCompleto;
        if(this.sexo=='h')
            sexoCompleto = "hombre";
        else
            sexoCompleto = "mujer";
        
        return sexoCompleto;
    }

    

    

    

    
}
