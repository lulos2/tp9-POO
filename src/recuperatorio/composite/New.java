package recuperatorio.composite;

import recuperatorio.filters.Filter;

import java.util.ArrayList;

public class New extends ElementNews {

    ArrayList<String> keyWords;
    String author;
    String contein;
    String title;

    public New(String category, String author, String contein, String title) {
        super(category);
        this.author = author;
        this.contein = contein;
        this.title = title;
        this.keyWords = new ArrayList<String>();
    }

    @Override
    public ArrayList<String> getKeyWords() {
        return new ArrayList<String>(this.keyWords);
    }

    @Override
    public ElementNews getRestrictedCopy(Filter f) {
        if(f.meet(this)) {
            New copy = new New(this.getCategory(),this.getAuthor(),this.getContein(),this.getTitle());
            for (String keyWord: this.getKeyWords()) {
                copy.addKeyWords(keyWord);
            }
            return copy;
        }
        return null;
    }

    public void addKeyWords(String keyWord) {
        if(!this.keyWords.contains(keyWord)) {
            this.keyWords.add(keyWord);
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContein() {
        return contein;
    }

    public void setContein(String contein) {
        this.contein = contein;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
