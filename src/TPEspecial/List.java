package TPEspecial;

import TPEspecial.comparators.*;
import java.util.Comparator;

public class List<T> {
    protected Node<T> start;
    protected Comparator<T> orderCriterion;

    public List(Comparator<T> c) {
        this.start = null;
        this.orderCriterion =  c;
    }

    public void setOrderCriterion(Comparator<T> orderCriterion) {
        this.orderCriterion = orderCriterion;
    }

    public void insert(T value) {
        if(this.start == null) {
            this.start = new Node<T>(value);
        }
        else {
            if(this.orderCriterion.compare(this.start.getValue(), value) < 0){
                Node<T> first = new Node<T>(value);
                first.setNext(this.start);
                this.start = first;
            }
            else{
                Node<T> aux = this.start;
                while((aux.getNext() != null)&&(this.orderCriterion.compare(aux.getNext().getValue(), value) > 0)) {
                    aux = aux.getNext();
                }
                Node<T> nodeToInsert = new Node<>(value);
                if (aux.getNext() != null) {
                    insertBetween(aux, nodeToInsert);
                }
                else{
                    insertOnNull(aux, nodeToInsert);
                }
            }
        }
    }

    private void insertBetween(Node<T> actualNode, Node<T> newNode ){
        newNode.setNext(actualNode.getNext());
        actualNode.setNext(newNode);
    }

    private void insertOnNull(Node<T> actualNode, Node<T> newNode){
        actualNode.setNext(newNode);
    }

    public int listSize() {
        int cont = 0;
        Node<T> aux = this.start;
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
                Node<T> aux = this.start;
                while (aux.getNext() != null && cont < pos - 1) {
                    aux = aux.getNext();
                    cont++;
                }
                Node<T> delete = aux.getNext();
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

    public void print() {
        Node<T> aux = this.start;
        while(aux != null) {
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
    }

    public void deleteNodeFor(T element) {
        int actualPosition = 1;
        Node<T> aux = this.start;
        while (aux != null) {
            if(aux.getValue().equals(element)) {
                deleteNode(actualPosition);
                actualPosition--;
            }
            aux = aux.getNext();
            actualPosition++;
        }
    }

    public int getFirstPosFrom(T element) {
        int actualPosition = 1;
        Node<T> aux = this.start;

        while (aux != null) {
            if(aux.getValue().equals(element)) {
                return actualPosition;
            }
            aux = aux.getNext();
            actualPosition++;
        }
        return -1;
    }

    public void orderBy(Comparator<T> c) {
        Node<T> aux = this.start;
        this.setOrderCriterion(c);
        while (aux != null){
            Node<T> aux2 = this.start;
            while ((aux2.getNext() != null)) {
                if((c.compare(aux2.getValue(), aux2.getNext().getValue())) > 0){
                    T value = aux2.getValue();
                    aux2.setValue(aux2.getNext().getValue());
                    aux2.getNext().setValue(value);
                }
                aux2 = aux2.getNext();
            }
            aux = aux.getNext();
        }
    }

}
