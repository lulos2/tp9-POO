package recuperatorio;

import recuperatorio.composite.ElementNews;

import java.util.Comparator;

public class ComparatorByCategory implements Comparator<ElementNews> {


    @Override
    public int compare(ElementNews e1, ElementNews e2) {
        return e1.getCategory().compareTo(e2.getCategory());
    }
}
