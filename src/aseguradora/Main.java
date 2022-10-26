package aseguradora;

import aseguradora.seguros.Compuesto;
import aseguradora.seguros.Seguro;
import aseguradora.seguros.Simple;

public class Main {
    public static void main(String[] args) {
        Seguro seguro1 = new Simple(1111, 300.2, 41690992, "descripcion hogar");
        Seguro seguro2 = new Simple(2222, 200.4, 41690993, "descripcion automotor");
        Compuesto seguroC = new Compuesto(45300999);
        seguroC.addSeguro(seguro1);
        seguroC.addSeguro(seguro2);
        System.out.println(seguroC);
    }
}
/*
Aseguradora
        Una aseguradora provee distintos tipos de seguros dentro de su cartera, entre los mismos se
        encuentran:
        ● Seguro Automotor, en el cual se cuenta con un número de póliza y una descripción
        (por ejemplo, “tdo riesgo”, el monto asegurado, el DNI del dueño de la póliza
        ● Seguro de Vida, donde se registra el DNI del asegurado, el número de la póliza, su
        descripción y el monto asegurado.
        ● Seguro Hogar, el número y descripción de la póliza, el monto del seguro y el DNI
        del dueño de la póliza.
        ● Seguro Integrador, en el cual se guarda un cliente (solo el DNI) y los seguros con
        los que cuenta (Automotor, Hogar, Vida, Integrador, y cualquier otro tipo de seguro
        que ofrezca o pueda ofrecer la compañía). El monto asegurado de un seguro
        integrador se calcula como la suma de todos los seguros que contiene. El número de
        póliza de un seguro integrador queda determinado por el mayor número de póliza de
        los seguros que contiene.
        ● Seguro Temporal, Está pensado para un seguro que tiene una fecha de inicio y fin,
        puede ser de cualquier tipo de seguro existente. El número de póliza es el mismo que
        la póliza contenida. El monto asegurado es el monto del seguro contenido siempre y
        cuando la fecha actual esté dentro del periodo de validez.
        La Aseguradora posee diferentes formas de calcular el costo de la póliza. Por ejemplo, hay
        seguros automotores que se calculan como un monto fijo y otros que son un porcentaje del
        valor asegurado. En el caso del Seguro Hogar se calcula como un monto fijo más un
        porcentaje del valor asegurado. En el caso del seguro de vida es un porcentaje del valor
        asegurado. Sin embargo, la forma de calcular el costo del seguro puede cambiar en cualquier
        momento, e incluso se pueden incorporar nuevas formas de calcular el costo. Para el caso de
        seguro integrador es la suma de los costos de los seguros contenidos, en el seguro temporal el
        costo es el costo del seguro contenido, siempre y cuando la fecha actual esté dentro de la
        vigencia del seguro (caso contrario es 0).
        Se desea brindar listados en los cuales se incluyan todos los seguros que posee la compañía
        que cumplan con determinado criterio. A continuación se listan algunos ejemplos.
        a) Listar todos los seguros cuya descripción contenga la palabra “Automotor”,
        ordenados por dni del asegurado, y luego por número de póliza si un asegurado posee
        más de un seguro que coincida con la búsqueda
        b) Listar todos los seguros cuya descripción contenga la palabra “Hogar” y el monto
        asegurado sea superior a $250.000, ordenados por dni del asegurado
        c) Listar todos los seguros donde haya un DNI igual a 24.134.323, ordenado por número
        de póliza.
        d) Se pueden agregar nuevos tipos de búsquedas así como también combinaciones
        lógicas de las mismas. Los criterios de ordenamiento también pueden variar y deben
        poder combinarse de cualquier manera.
        NOTA: en el caso de seguro integrador el resultado de la búsqueda incluye cualquier seguro
        que posea y cumple con la búsqueda (no se incluyen seguros integradores en los resultados).
        En el caso del seguro temporal, solo se incluye como resultado de la búsqueda los elementos
        por él contenidos y que cumplen con la búsqueda siempre y cuando esté vigente.*/
