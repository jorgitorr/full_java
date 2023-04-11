package refugio_ejercicio;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Refugio {
    private String nombre;
    private Queue<Animal>refugio;
    private List<Animal>historial;



    public Refugio(String nombre) {
        this.nombre = nombre;
        this.refugio = new LinkedList<>();
        this.historial = new LinkedList<>();
    }

    /**
     * check if is a cat
     * @return true or false
     */
    private boolean checkIfGato(){
        boolean yes = false;
        
        if(refugio.peek() instanceof Gato)
            yes = true;

        return yes;
    }

    /**
     * check if is a dog
     * @return true or false
     */
    private boolean checkIfPerro(){
        boolean yes = false;
        
        if(refugio.peek() instanceof Perro)
            yes = true;

        return yes;
    }

    public void entraAnimal(Animal a){
        refugio.add(a);
        administraDosis(a);//nada más entrar al refugio se le administra dosis

        if(!historial.contains(a))
            historial.add(a);
    }

    /*ya que el encargado de poner las vacunas es el refugio */
    private void administraDosis(Animal a){
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
        return refugio.poll();
    }

    public Perro adoptaPerro(){
        Gato g = null;
        
        while(checkIfGato()){
            g = (Gato) refugio.poll();
            entraAnimal(g);
        }
        return (Perro) refugio.poll(); 
    }


    public Gato adoptaGato(){
        Perro p = null;
        
        while(checkIfPerro()){
            p = (Perro) refugio.poll();
            entraAnimal(p);
        }
        return (Gato) refugio.poll();
    }

    

    @Override
    public String toString() {
        return nombre + refugio;
    }

    public Animal getAnimalAntiguo(){
        return refugio.peek();
    }

    public Perro getPerroAntiguo(){
        Gato g = null;
        while(checkIfGato()){
            g = (Gato)refugio.poll();
            entraAnimal(g);
        }
        return (Perro)refugio.peek();
    }

    public Gato getGatoAntiguo(){
        Perro p = null;
        while(checkIfPerro()){
            p = (Perro)refugio.poll();
            entraAnimal(p);
        }
        return (Gato)refugio.peek();
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

    public Queue<Animal> getRefugio() {
        return refugio;
    }

    public List<Animal> getHistorial() {
        return historial;
    }


}
