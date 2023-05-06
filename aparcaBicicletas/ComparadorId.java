import java.util.Comparator;

public class ComparadorId implements Comparator<Aparcabicicletas>{

    @Override
    public int compare(Aparcabicicletas o1, Aparcabicicletas o2) {
        if(o1.getId()<o2.getId())
            return -1;
        else if(o1.getId()>o2.getId())
            return 1;
        else
            return 0;
    }
    
}
