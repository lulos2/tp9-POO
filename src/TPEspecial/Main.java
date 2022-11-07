package TPEspecial;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello word");

        List l1=new List();

        l1.insertFinal(2);
        l1.insertFinal(4);
        l1.insertFinal(6);
        l1.deleteNode(1);
        l1.print();
    }
}

/*
1) Lista vinculada
        Una lista vinculada ordenada es una estructura de datos formada por un conjunto de nodos,
        cada uno de los cuales posee un objeto y una referencia al siguiente nodo de la estructura.
        La particularidad que tiene este tipo de listas es que se encuentra siempre ordenada
        (ascendente o descendente, según el criterio de orden con el que la lista fue creada) con
        respecto a los elementos que contiene. Ejemplos:
        Implementar en Java las clases necesarias para diseñar esta estructura de datos, teniendo
        en cuenta que el valor de cada nodo puede ser cualquier tipo de objeto. NO pueden usarse
        colecciones de Java existentes para la implementación (ArrayList, Vector, arreglos clásicos
        [], etc ). La lista vinculada debe proveer al menos a los siguientes servicios:
     -  a) Insertar un nuevo elemento en la estructura.
        b) Eliminar un elemento de la estructura dado una posición.
        c) Eliminar todas las ocurrencias de un elemento de la estructura dado el elemento.
        d) Obtener la posición de la primera ocurrencia de un elemento dado.
        e) Un mecanismo que permita recorrer uno a uno los elementos de la lista.
        f) Permitir cambiar la forma en la que se ordenan los elementos (con el subsecuente
        reordenamiento de los elementos ya almacenados.
*/
