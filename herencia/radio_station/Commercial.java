/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radio_station;

/**
 *
 * @author jorgearru
 */
public class Commercial extends AudioElement{
    private String fichero;
    private int profit;

    public Commercial(String nombre, String fichero, int beneficioReproduccion) {
        super(nombre);
        this.fichero = fichero;
        this.profit = beneficioReproduccion;
    }

    @Override
    public String toString() {
        return super.toString() + ", fichero=" + fichero + ", beneficioReproduccion=" + profit;
    }

    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public int profit() {
        int profit = 0;
        profit += this.getProfit();
        return profit;
    }

    @Override
    public void play() {
        AudioTools.play(fichero);
    }

    @Override
    public int duration() {
        return AudioTools.getDuration(fichero);
    }


    

    
}
