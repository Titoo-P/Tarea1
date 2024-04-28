package src.clases;
import src.clases.Monedas.*;


public class Main {
    public static void main(String[] args) {


        Moneda m1 = new Moneda1500();
        Moneda m2 = new Moneda500();
        Expendedor exp1 = new Expendedor(3);

        System.out.println();
        // Testearemos como va en todas las situaciones posibles

        //Situacion 01: Compramos Producto de 700 con moneda de 1500 (con el dinero adecuado)
        System.out.println("// Situacion 01: Compramos Producto de 700 con moneda de 1500 (con el dinero adecuado)");
        Comprador Tito = new Comprador(m1,1, exp1);
        System.out.println("que Producto compre: "+Tito.queBebiste());
        System.out.println("Cuanto es el vuelto: "+Tito.cuantoVuelto()+"\n");

        //Situacion 02: Compramos Producto de 700 y con moneda de 500 (nos alcanza con el dinero)
        System.out.println("// Situacion 02: Compramos Producto de 700 y con moneda de 500 (nos alcanza con el dinero)");
        Tito = new Comprador(m2,1, exp1);
        System.out.println("que Producto compre: "+Tito.queBebiste());
        System.out.println("Cuanto es el vuelto: "+Tito.cuantoVuelto()+"\n");

        // Situacion 03: Compramos producto varias veces para ver si se queda vacio
        System.out.println("// Situacion 03: Compramos producto varias veces para ver si se queda vacio y me regresa el dinero (1500)");
        Tito = new Comprador(m1,1, exp1);
        System.out.println("que Producto compre: "+Tito.queBebiste());
        System.out.println("Cuanto es el vuelto: "+Tito.cuantoVuelto());
        Tito = new Comprador(m1,1, exp1);
        System.out.println("que Producto compre: "+Tito.queBebiste());
        System.out.println("Cuanto es el vuelto: "+Tito.cuantoVuelto());
        Tito = new Comprador(m1,1, exp1);
        System.out.println("que Producto compre: "+Tito.queBebiste());
        System.out.println("Cuanto es el vuelto: "+Tito.cuantoVuelto()+"\n");

    }
}
