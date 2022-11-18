package TPEspecial;


import TPEspecial.comparators.*;
import TPEspecial.entidades.Alumno;
import TPEspecial.entidades.EntidadUniversitaria;
import TPEspecial.entidades.Grupo;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator condicionPorCantidad = new ComparatorByCant();


        List<Integer> listaNumeros = new<Integer>List(new ComparatorNumeroMayor());
        List<String> listString = new List<String>(new ComparatorAlfabetico());
        List<EntidadUniversitaria> entidadesUniversitarias = new<EntidadUniversitaria>List(condicionPorCantidad);

        listaNumeros.insert(10);
        listaNumeros.insert(21);
        listaNumeros.insert(1);
        listaNumeros.insert(5);
        listaNumeros.insert(11);
        listaNumeros.insert(88);
        listaNumeros.insert(3);

        System.out.println("primera prueba");

        listaNumeros.print();

        listaNumeros.deleteNode(1);
        listaNumeros.deleteNodeFor(5);
        listaNumeros.deleteNodeFor(11);

        System.out.println("segunda prueba");

        listaNumeros.print();

        listString.insert("facil");
        listString.insert("es");
        listString.insert("parcial");
        listString.insert("prog 2");

        System.out.println("tercera prueba");

        listString.print();

        System.out.println(listString.getFirstPosFrom("parcial"));
        System.out.println(listString.getFirstPosFrom("recuperatorio"));

        listString.orderBy(Comparator.reverseOrder());

        listString.print();

        /*-------------------------- estructura 1 ---------------------------------*/

        Grupo unicen = new Grupo();
        Grupo exactas = new Grupo();
        Grupo humanas = new Grupo();
        Grupo historia = new Grupo();
        Alumno john = new Alumno("John","Doe",1200000,0);
        john.addInteres("intercambio");
        Alumno mora = new Alumno("Mora","Diaz",37124425,0);
        mora.addInteres("psicologia","Freud");
        Alumno federico = new Alumno("Federico","Lopez",37124425,0);
        federico.addInteres("redes","php","java","Python");
        Alumno juana = new Alumno("Juana", "Garcia", 27123455, 0);
        juana.addInteres("programacion", "php", "java");
        Alumno flora = new Alumno("Flora", "Rivas", 34555111, 0);
        flora.addInteres("historia", "anitigua");
        Alumno martin = new Alumno("Martin", "Gomes", 34111222, 0);
        martin.addInteres("romanos", "egipcios", "griegos");
        Alumno roman = new Alumno("Roman", "Bazar", 32555111, 0);
        roman.addInteres("argentina");
        historia.addEntidad(flora);
        historia.addEntidad(martin);
        historia.addEntidad(roman);
        humanas.addEntidad(historia);
        humanas.addEntidad(mora);
        exactas.addEntidad(juana);
        exactas.addEntidad(federico);
        unicen.addEntidad(exactas);
        unicen.addEntidad(humanas);
        unicen.addEntidad(john);

        /*------------------------------estructura 2--------------------------------*/

        Grupo olimpiadasMatematicas = new Grupo();
        Grupo matea2 = new Grupo();
        Grupo losFibo = new Grupo();
        Alumno juanJ = new Alumno("Juan", "Juarez", 33222444, 0);
        juanJ.addInteres("sucesiones", "algebra");
        Alumno julioC = new Alumno("Julio", "Cesar", 33222111, 0);
        julioC.addInteres("sucesiones", "algebra");
        Alumno bernardino = new Alumno("Brenardino", "Rivas", 30987854, 0);
        bernardino.addInteres("matematicas");
        Alumno joseP = new Alumno("Jose", "Paso",33322112, 0);
        joseP.addInteres("problemas");
        Alumno isaac = new Alumno("Isaac", "Newton", 12343565,0 );
        losFibo.addEntidad(isaac);
        losFibo.addEntidad(joseP);
        losFibo.addEntidad(bernardino);
        matea2.addEntidad(julioC);
        matea2.addEntidad(juanJ);
        olimpiadasMatematicas.addEntidad(losFibo);
        olimpiadasMatematicas.addEntidad(matea2);

        entidadesUniversitarias.insert(olimpiadasMatematicas);
        entidadesUniversitarias.insert(unicen);

        System.out.println("Lista de Entidades Universitarias sin orden");

        entidadesUniversitarias.print();

        entidadesUniversitarias.orderBy(new ComparatorByCant());

        System.out.println("Lista de Entidades Universitarias con orden");

        entidadesUniversitarias.print();


        System.out.println("almunos en unicen: " + unicen.getCant() +"  "+"alumnos en olimpiadas matematicas: " + olimpiadasMatematicas.getCant());



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
     -  b) Eliminar un elemento de la estructura dado una posición.
     -  c) Eliminar todas las ocurrencias de un elemento de la estructura dado el elemento.
     -  d) Obtener la posición de la primera ocurrencia de un elemento dado.
     -  e) Un mecanismo que permita recorrer uno a uno los elementos de la lista.
     -  f) Permitir cambiar la forma en la que se ordenan los elementos (con el subsecuente
        reordenamiento de los elementos ya almacenados.

        2) Uso de la estructura
Como este año la cursada de Programación 2 tuvo récord de alumnos, los profesores
desean utilizar la estructura de datos implementada en el ejercicio 1 para mantener
ordenados a los alumnos de acuerdo a diferentes criterios. Cada alumno posee nombre,
apellido, DNI, edad, y una lista de palabras que representan sus intereses. Considerar la
posibilidad de utilizar órdenes compuestos (por ejemplo, ordenar por apellido, y si hay dos
alumnos con el mismo apellido, ordenarlos por nombre, y si ambos coinciden por dni)
Implementar en Java la clase Alumno, con todas las características necesarias para poder
agregar a los mismos a una lista vinculada.


3) La estructura es todo un éxito!
Dado el éxito de la estructura de datos en los alumnos de
Programación 2, la Universidad quiere adoptar la misma
para usarla para almacenar diversos grupos y subgrupos
de alumnos. La Universidad está organizada en diferentes
facultades. Cada facultad tiene diversas carreras, y cada
carrera posee un conjunto de materias. Las materias, a su
vez, organizan a sus alumnos en comisiones. Los grupos
de alumnos que desea almacenar la Universidad en la
lista vinculada ordenada pueden representar cualquiera de
las unidades antes mencionadas (facultades, carreras, materias, o incluso grupos de
alumnos formados para un fin particular, como por ejemplo un equipo de fútbol participante
de las olimpiadas). Notar que también puede haber alumnos “sueltos”, es decir, que estén
inscriptos en una carrera, pero que no se hayan matriculado en ninguna materia, o que
pertenezcan a una facultad, pero no a una carrera particular (estudiantes de intercambio).
Implementar en Java las clases necesarias para manejar estos grupos de alumnos y
permitir agregarlos a la estructura definida en el ejercicio 1 siguiendo, por ejemplo, el orden
dado por la cantidad total de alumnos pertenecientes a los grupos que se inserten en la
misma (ascendente).

4) Pongámoslo a prueba
Implementar un método main en el qué:
-a) Se cree la lista de números mostrada en la figura del punto 2, con los valores
insertados en el siguiente orden: 10, 21, 1, 5, 11
-b) Se recorra la lista creada (utilizando un foreach) y se impriman los valores por
consola
-c) Se elimine el primer elemento de la lista (por posición), luego el elemento “5” y luego
el elemento “11” (dado el elemento). Volver a recorrer e imprimir la lista resultante.
-d) Se cree la lista de strings mostrada en la figura 2 del punto 1, con los valores
insertados en el siguiente orden: “Fácil”, “Es”, “Parcial”, “Prog 2”.
-e) Se recorra la lista creada y se impriman los valores por consola
-f) Imprimir por consola en qué posición se encuentra la palabra “Parcial”.
-g) Imprimir por consola en qué posición se encuentra la palabra “Recuperatorio”
-h) Se cambie el orden de la lista de strings para que los elementos queden ordenados
descendentemente.
i) Implementar las siguientes dos estructuras e insértelas en una lista vinculada
ordenadas por cantidad total de alumnos (de mayor a menor)


*/
/*Alumno a1= new Alumno("Lulo","Bareiss",41690992,24);
        Alumno a2= new Alumno("Luke","Quiroga",38178273,28);
        Alumno a3= new Alumno("Caro","Jacquet",41148747,24);
        a1.addInteres("Cumbia villera");
        a1.addInteres("Ejercicio");
        a2.addInteres("Pelear con vecino");
        a2.addInteres("Correr");
        a3.addInteres("Jugar al Assassin Creed");
        a3.addInteres("Vender Galletita");

        l1.insertFinal(a2);
        l1.insertFinal(a1);
        l1.insertFinal(a3);

        System.out.println("Sin orden");
        l1.print();

        Comparator c2= new ComparatorApellido(new ComparatorName(new ComparatorDNI()));
        Comparator byCant = new ComparatorByCant();

        System.out.println("Con orden");

        l1.orderBy(c2);

        l1.print();*/