package refugio_ejercicio_refactorizado;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Refugio {
    private String nombre;
    private Queue<Perro>perros;
    private Queue<Gato>gatos;
    private List<Animal>historial;
    private static int numeroRegistro;



    public Refugio(String nombre) {
        numeroRegistro = 0;
        this.nombre = nombre;
        this.perros = new LinkedList<>();
        this.gatos = new LinkedList<>();
        this.historial = new LinkedList<>();
    }


    public void entraAnimal(Animal a){
        if(a instanceof Perro)
            perros.add((Perro) a);
        else if(a instanceof Gato)
            gatos.add((Gato) a);
    }

    /*ya que el encargado de poner las vacunas es el refugio */
    private void vacunacionInicial(Animal a){
        Dosis d = null;
        if(a instanceof Gato){
            for(VacunaGato v: VacunaGato.values()){
                if(v.esEsencial()){
                    d = new Dosis(v);
                    a.setDosis(d);
                }
            }
        }else{
            for(VacunaPerro v:VacunaPerro.values()){
                if(v.esEsencial()){
                    d = new Dosis(v);
                    a.setDosis(d);
                }
            }
        }
    }

    public void suministraVacunaEspecifica(Vacuna v, Animal a){
        Dosis d = null;
        
        if(a instanceof Gato && v instanceof VacunaGato){
            d = new Dosis(v);
            a.setDosis(d);
        }else if(a instanceof Perro && v instanceof VacunaPerro){
            d = new Dosis(v);
            a.setDosis(d);
        }
    }

    public Animal adoptar(){
        
    }

    public Perro adoptaPerro(){
        return perros.poll();
    }


    public Gato adoptaGato(){
        return gatos.poll();
    }

    

    @Override
    public String toString() {
        return nombre;
    }

    public Animal getAnimalAntiguo(){
        
    }

    public Perro getPerroAntiguo(){
        return perros.peek();
    }

    public Gato getGatoAntiguo(){
        return gatos.peek();
    }


    public void adoptaTodos(){
        while(getAnimalAntiguo()!=null){
            System.out.println("adopta: " + adoptar());
        }
    }

    
    public void ordenarHistorialEspecie(){
        Collections.sort(historial, new ComparadorAnimales());
    }

    public void ordenarHistorialFecha(){
        Collections.sort(historial, new ComparadorAnimalesFecha());
    }

    public String getNombre() {
        return nombre;
    }

    public List<Animal> getHistorial() {
        return historial;
    }


}
