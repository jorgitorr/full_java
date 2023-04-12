package refugio_ejercicio_refactorizado;

import java.util.Comparator;


/**
 * ordena por fecha y después por especie y dentro de cada especie por nombre
 */
public class ComparadorAnimalesFecha implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1.getFecha().compareTo(o2.getFecha())==0){
            if(o1 instanceof Gato && o2 instanceof Perro)
                return -1;
            else if(o1 instanceof Perro && o2 instanceof Gato)
                return 1;
            else{
                return o1.getNombre().compareTo(o2.getNombre());
            }
        }else
            return o1.getFecha().compareTo(o2.getFecha());
    }

}
