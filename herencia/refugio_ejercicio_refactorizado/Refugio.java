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
        numeroRegistro++;
        this.nombre = nombre;
        this.perros = new LinkedList<>();
        this.gatos = new LinkedList<>();
        this.historial = new LinkedList<>();
    }

    public static int getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Se le ponen las vacunas a un animal y entra en el refugio y en el historial
     * @param a
     */
    public void entraAnimal(Animal a){
        vacunacionInicial(a);
        historial.add(a);
        if(a instanceof Perro)
            perros.add((Perro) a);
        else if(a instanceof Gato)
            gatos.add((Gato) a);
        
    }

    /**
     * Pone las todas las vacunas esenciales al animal 
     * @param a Animal 
     */
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

    /**
     * Administra una vacuna específica a un animal específico
     * @param v Vacuna que se le administra
     * @param a Animal
     */
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

    /**
     * Adopta el más viejo de los animales
     * @return Animal más viejo
     */
    public Animal adoptar(){
        Animal a = getAnimalAntiguo();

        if(a instanceof Perro){
            if(perros.contains(a))
                perros.remove(a);
        }else if(a instanceof Gato){
            if(gatos.contains(a))
                gatos.remove(a);
        }
        return a;
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

    /**
     * coge el animal más antiguo
     * Primero coge el gato más antiguo y si no hay gato coge el perro más antiguo
     * @return
     */
    public Animal getAnimalAntiguo(){
        Animal a = null;

        if(!gatos.isEmpty())
            a = gatos.peek();
        else if(!perros.isEmpty())
            a = perros.peek();

        return a;
    }

    public Perro getPerroAntiguo(){
        return perros.peek();
    }

    public Gato getGatoAntiguo(){
        return gatos.peek();
    }


    public void adoptaTodos(){
        while(perros.size()>0 || gatos.size()>0)
            System.out.println("adopta: " + adoptar());
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

    public void getHistorial() {
        for(Animal a : historial){
            System.out.print(a);
            if(a.equals(historial.get(historial.size()-1))){
                System.out.print(".");
            }else
                System.out.print(", ");
        }

        System.out.println();
    }


}
