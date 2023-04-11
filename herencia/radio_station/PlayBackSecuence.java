/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radio_station;


/**
 *
 * @author jorgearru
 */
public class PlayBackSecuence extends AudioElement{
    protected AudioElement[]secuencia;
    private static final int MAX = 100;
    private int cantidad;//puntero que apunta al último lleno

    public PlayBackSecuence(String nombre) {
        super(nombre);
        secuencia = new AudioElement[MAX];
        cantidad = 0;
    }

    public boolean isValid(int pos){
        return pos>=0 && pos<=cantidad;
    }


    public void add(AudioElement e){
        secuencia[cantidad] = e;
        cantidad++;
    }

    public void set(int pos, AudioElement e){
        if(isValid(pos))
            secuencia[pos] = e;
    }

    public void remove(int pos){
        if(isValid(pos)){
            secuencia[pos] = null;
            for(int i=pos; i<secuencia.length-1; i++)
                secuencia[i] = secuencia[i+1];
            cantidad--;
        }
    }

    public void insert(int pos, AudioElement e){
        AudioElement elementPos;

        if(isValid(pos) && secuencia[pos]!=null && cantidad<MAX){
            for(int i=pos; i<secuencia.length-1; i++){
                elementPos = secuencia[i];
                secuencia[i] = elementPos;
            }
        }
        cantidad++;
        secuencia[pos] = e;
    }

    
    @Override
    public String toString() {
        String secuencias = "";
        for(int i=0; i<secuencia.length; i++){
            if(secuencia[i]!=null)
                secuencias += secuencia[i] + "\n";
        }
        return secuencias;
    }



    @Override
    public int profit() {
        int profit = 0;

        for(int i=0; i<secuencia.length; i++){
            if(secuencia[i]!=null)
                profit += secuencia[i].profit();
        }

        return profit;
    }

    @Override
    public void play() {
        for(AudioElement e: secuencia)
            e.play();
    }

    @Override
    public int duration() {
        int duration = 0;
        for(AudioElement e: secuencia)
            duration += e.duration();

        return duration;
    }

    
    
}
