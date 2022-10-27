package sistemaDeCensos;

import aseguradora.seguros.Simple;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello word");
    }
}
/*
6. Sistema de Censos
        Se desea implementar una solución orientada a objetos para el censado de la población de un
        territorio. Un territorio posee nombre y un conjunto de regiones de menor tamaño. Por
        ejemplo, el mundo de Arda está dividido en cuatro continentes: la Tierra Media, Aman, las
        Tierras Oscuras y las Tierras del Sol. A su vez, Aman se divide en dos grandes regiones: el
        Norte y el Sur. Cada región se divide en reinos que agrupan comarcas. También existen
        comarcas libres dentro de los continentes, regiones o reinos.
        De cada comarca se conoce su nombre, superficie, cantidad de habitantes y el monto total de
        ingresos. Es posible calcular la cantidad de habitantes, superficie total e ingresos de un
        territorio, como la suma de los habitantes, superficies e ingresos, respectivamente, de las
        comarcas que componen el territorio.
        Implementar los siguientes servicios:
        ● Cantidad total de habitantes de un territorio, región o comarca.
        ● Superficie total de un territorio, región o comarca.
        ● Ingresos per cápita de un territorio o comarca (total de ingresos dividido el total de
        habitantes).
        ● Densidad de población de un territorio o comarca (cantidad total de habitantes dividido
        la superficie del territorio o comarca)
        También se desean obtener listados de comarcas de una región determinada que cumplan
        ciertas condiciones de búsqueda. Por ejemplo:
        ● Todas las comarcas con más de 100.000 habitantes.
        ● Todas las comarcas cuya densidad sea mayor a 5 habitantes/km2
        ● Todas las comarcas cuyo nombre sea “The Shire”
        ● Cualquier combinación lógica (AND, OR, NOT) de las búsquedas anteriores o nuevas
        búsquedas que puedan incorporarse a futuro.
        Todos los listados deben retornarse ordenados alfabéticamente por el nombre de las
        comarcas
        */
