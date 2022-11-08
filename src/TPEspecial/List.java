package TPEspecial;


import java.util.Comparator;

public class List {
    protected Node start;

    public List() {
        this.start = null;
    }

    public void insertFinal(Object value) {
        if(this.start == null) {
            this.start = new Node(value, null);
        }
        else {
            Node aux = this.start;
            while(aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(value,null));
        }
    }

    public int listSize(){
        int cont = 0;
        Node aux = this.start;
        while(aux != null) {
            cont++;
            aux = aux.getNext();
        }
       return cont;
    }


    public void deleteNode(int pos) {
        int cont = 1;
        try {
            if(pos == 1){
                this.start = this.start.getNext();
            }
            else {
                Node aux = this.start;
                while (aux.getNext() != null && cont < pos - 1) {
                    aux = aux.getNext();
                    cont++;
                }
                Node delete = aux.getNext();
                if (delete.getNext() != null) {
                    aux.setNext(delete.getNext());
                }
                else {
                    aux.setNext(null);
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    public void print(){
        Node aux = this.start;
        while(aux != null) {
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
    }

    public void deleteNodeFor(Object element) {
        int actualPosition = 1;
        Node aux = this.start;
        while (aux != null) {
            if(aux.getValue().equals(element)) {
                deleteNode(actualPosition);
                actualPosition--;
            }
            aux = aux.getNext();
            actualPosition++;
        }
    }

    public int getFirstPosFrom(Object element) {
        int actualPosition = 1;
        Node aux = this.start;

        while (aux != null) {
            if(aux.getValue().equals(element)) {
                return actualPosition;
            }
            aux = aux.getNext();
            actualPosition++;
        }
        return -1;
    }

    public void orderBy(Comparator c) {
        Node aux = this.start;

        while (aux != null){
            Node aux2 = this.start;
            while ((aux2.getNext() != null)) {
                if((c.compare(aux2.getValue(), aux2.getNext().getValue())) > 0){
                    Object value = aux2.getValue();
                    aux2.setValue(aux2.getNext().getValue());
                    aux2.getNext().setValue(value);
                }
                aux2 = aux2.getNext();
            }
            aux = aux.getNext();
        }
    }


}
