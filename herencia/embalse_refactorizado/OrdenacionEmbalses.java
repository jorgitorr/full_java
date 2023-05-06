

import java.util.Comparator;

public class OrdenacionEmbalses implements Comparator<Embalse>{

    @Override
    public int compare(Embalse o1, Embalse o2) {
        if(o1.capacidadMAX>o2.capacidadMAX)
            return -1;
        else if(o1.capacidadMAX<o2.capacidadMAX){
            return 1;
        }else 
            if(o1.capacidadMAX>o2.capacidadMAX){
                return -1;
            }else if(o1.capacidadMAX<o2.capacidadMAX){
                return 1;
            }else
                return 0;
    }
    
}
