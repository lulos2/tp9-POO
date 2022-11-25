package recuperatorio.composite;

import java.util.ArrayList;

public class EspecialGroup extends Group {

    ArrayList<String> admissibleCategories;

    public EspecialGroup(String categoria) {
        super(categoria);
        this.admissibleCategories = new ArrayList<String>();
    }

    public ArrayList<String> getAdmissibleCategories(){
        return new ArrayList<String>(this.admissibleCategories);
    }

    public void addAdmissibleCategory(String category) {
        if(!this.getAdmissibleCategories().contains(category)){
            this.admissibleCategories.add(category);
        }
    }

    public void addNews(ElementNews e) {
        if(this.getAdmissibleCategories().contains(e.getCategory())){
            super.addNews(e);
        }
    }

    public Group obtainsGroup() {
        return new EspecialGroup(this.getCategory());
    }
}


