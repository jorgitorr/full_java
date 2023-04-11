package refugio_ejercicio;

import java.util.Comparator;

public class ComparadorAnimales implements Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        if(o1 instanceof Gato && o2 instanceof Perro)
            return -1;
        else if(o1 instanceof Perro && o2 instanceof Gato)
            return 1;
        else
            return o1.getSexo()-o2.getSexo();
    }

    

    
}
