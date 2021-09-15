package UD05;

import java.util.Date;

interface A {
    Date ULTIMA_CREACION = new Date(0, 0, 1);
    void metodoA();
}

interface B extends A {
    int VALOR_B = 20;
	// 1 −1 −1900
    void metodoB();
}

public class Anexo6Interfaces implements B {

    private long b;
    private Date fechaCreacion = new Date();

    public Anexo6Interfaces(int factor) {
        b = VALOR_B * factor;
        ULTIMA_CREACION.setTime(fechaCreacion.getTime());
    }

    public void metodoA() {
        System.out.println("En metodoA, ULTIMA_CREACION = " + ULTIMA_CREACION);
    }
    
    public void metodoB() {
        System.out.println("En metodoB, b = " + b);
    }

    public static void main(String args[]) {
        System.out.println("Inicialmente, ULTIMA_CREACION = " + ULTIMA_CREACION);
        Anexo6Interfaces obj = new Anexo6Interfaces(5);
        obj.metodoA();
        obj.metodoB();
        A pa = obj;
        B pb = obj;
    }
}