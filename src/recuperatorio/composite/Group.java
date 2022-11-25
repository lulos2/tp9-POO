package recuperatorio.composite;

import recuperatorio.filters.Filter;

import java.util.ArrayList;

public class Group extends ElementNews{

    ArrayList<ElementNews> news;

    public Group(String categoria) {
        super(categoria);
        this.news = new ArrayList<ElementNews>();
    }

    public ArrayList<ElementNews> getNews() {
        return new ArrayList<ElementNews>(this.news);
    }

    public void addNews(ElementNews e){
        int pos = 0;
        while ((pos<news.size()) && (Group.metodComparator.compare(news.get(pos), e) < 0)) {
            pos++;
        }
        this.news.add(pos,e);
    }

    @Override
    public ArrayList<String> getKeyWords() {
        ArrayList<String> result = new ArrayList<String>();
        for (ElementNews elements: this.getNews()) {
            for (String keyWord: elements.getKeyWords()) {
                if(!result.contains(keyWord)) {
                    result.add(keyWord);
                }
            }
        }
        return result;
    }

    @Override
    public ElementNews getRestrictedCopy(Filter f) {
        ArrayList<ElementNews> childrensMeet = new ArrayList<>();
        for (ElementNews element: this.getNews()){
            ElementNews childrenCopy = element.getRestrictedCopy(f);
            if(childrenCopy != null){
                childrensMeet.add(childrenCopy);
            }
        }
        if(childrensMeet.size()>0){
            Group copy = obtainsGroup();
            for (ElementNews childrensCopy: childrensMeet) {
                copy.addNews(childrensCopy);
            }
            return copy;
        }
        return null;
    }

    public Group obtainsGroup() {
        return new Group(this.getCategory());
    }

}
