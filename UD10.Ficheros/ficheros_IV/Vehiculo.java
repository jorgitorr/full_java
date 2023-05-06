package ficheros_IV;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    private String matricula;
    private String marca;
    private int tamanioDeposito;
    private String modelo;

    
    public Vehiculo(String matricula, String marca, int tamanioDeposito, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.tamanioDeposito = tamanioDeposito;
        this.modelo = modelo;
    }

    
    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public int getTamanioDeposito() {
        return tamanioDeposito;
    }
    public String getModelo() {
        return modelo;
    }


    @Override
    public String toString() {
        return "matricula=" + matricula + ", marca=" + marca + ", tamanioDeposito=" + tamanioDeposito
                + ", modelo=" + modelo;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + tamanioDeposito;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
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
        Vehiculo other = (Vehiculo) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (tamanioDeposito != other.tamanioDeposito)
            return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        return true;
    }

    

    

    
}
