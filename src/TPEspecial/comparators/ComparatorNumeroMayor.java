package TPEspecial.comparators;

import java.util.Comparator;

public class ComparatorNumeroMayor implements Comparator<Integer> {
    @Override
    public int compare(Integer n1, Integer n2) {
        return n1-n2;
    }
}
