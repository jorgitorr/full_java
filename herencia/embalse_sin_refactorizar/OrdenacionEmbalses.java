package embalse;

import java.util.Comparator;

public class OrdenacionEmbalses implements Comparator<Embalse>{

    @Override
    public int compare(Embalse o1, Embalse o2) {
        if(o1.getCapacidadMAX()>o2.getCapacidadMAX())
            return -1;
        else if(o1.getCapacidadMAX()==o2.getCapacidadMAX()){
            if(o1.getCantidadAgua()>o2.getCantidadAgua()){
                return -1;
            }else if(o1.getCantidadAgua()<o2.getCantidadAgua()){
                return 1;
            }else
                return 0;
        }else 
            return 1;
    }
    
}
