package TPEspecial;

import com.sun.source.doctree.SystemPropertyTree;

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
            while(aux.getNext()!=null) {
                aux = aux.getNext();
            }
            aux.setNext(new Node(value,null));
        }
    }


    private void casoEspecial(){
        Node delete=this.start;
        this.start = this.start.getNext();
        delete = null;

    }
    public void deleteNode(int pos) {
        int cont=1;
        try {
            if(pos == 1){
               this.casoEspecial();
            }
            else {
                    Node aux = this.start;
                    while (aux.getNext() != null && cont < pos - 1) {
                        aux = aux.getNext();
                }

                    Node delete = aux.getNext();
                    if (delete.getNext() != null) {
                        aux.setNext(delete.getNext());
                        delete = null;
                }
                    else {
                        aux.setNext(null);
                        delete=null;
                }
            }


        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void print(){
        Node aux = this.start;
        while(aux!=null) {
            System.out.println(aux.getValue());
            aux = aux.getNext();
        }
    }

}
