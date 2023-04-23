



import java.util.Comparator;

public class ComparadorAparcaBicicletasBarrio implements Comparator<Aparcabicicletas>{

    @Override
    public int compare(Aparcabicicletas o1, Aparcabicicletas o2) {
        return o1.getBarrio().compareTo(o2.getBarrio());
    }
    
}
