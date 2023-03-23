package examen_2_ev;

public class Fecha implements Comparable<Fecha>{
    private int dia;
    private int mes;
    private int anio;
    private static final int[] diasMeses = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public Fecha(int dia, int mes, int anio){
        setAnio(anio);
        setMes(mes);
        setDia(dia);
    }
    
    private void setAnio(int anio){
        if((anio>1950) && (anio<2100))
            this.anio=anio;
        else
            throw new IllegalArgumentException("el año debe estar entre 1950-2100");
    }

    private void setMes(int m){
        if ((m>0)&&(m<=12))
            mes = m;
        else
            throw new IllegalArgumentException("el mes debe estar entre 1-12");
    }

    private void setDia(int d){
        if ((d>0)&&(d<=diasMeses[mes]))
            dia = d;
        else
            if ((mes==2) && (d==29)&&(anio%400==0 || anio%4==0 && anio%100!=0))
                dia = d;
            else
            throw new IllegalArgumentException("el día está fuera de rango");
    }

    @Override
    public String toString(){
        return String.format("%d/%d/%d", dia, mes, anio);
    }

    @Override
    public int compareTo(Fecha otraFecha) {
        if (anio==otraFecha.anio)
            if (mes==otraFecha.mes)
               return this.dia-otraFecha.dia;
            else
               return this.mes-otraFecha.mes;
        else
            return this.anio-otraFecha.anio;
    }
}