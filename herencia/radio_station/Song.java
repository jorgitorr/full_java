/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radio_station;

/**
 *
 * @author jorgearru
 */
public class Song extends AudioElement{
    private String fichero;
    private int profit;
    
    public Song(String nombre, String fichero, int profit) {
        super(nombre);
        this.fichero = fichero;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return super.toString() + ", fichero=" + fichero + ", costeReproduccion=" + profit;
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
        profit -= this.getProfit();
        return profit;
    }

    @Override
    public int duration() {
        return getDuration(fichero);
    }

    @Override
    public void play() {
        play(fichero);
    }

    

    

    
    
}
