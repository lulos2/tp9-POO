package recuperatorio.composite;

import recuperatorio.ComparatorByCategory;
import recuperatorio.filters.Filter;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class ElementNews  {
    private String category;
    protected static Comparator metodComparator;

    public ElementNews(String category) {
        this.category = category;
        metodComparator = new ComparatorByCategory();
    }

    public abstract ArrayList<String> getKeyWords();

    public abstract ElementNews getRestrictedCopy(Filter f);

    public String getCategory() {
        return this.category;
    }


}
