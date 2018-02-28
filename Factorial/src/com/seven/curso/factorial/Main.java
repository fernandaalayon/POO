package com.seven.curso.factorial;


public class Main {

    public static void main (String arg[]){
        InOut inout = new InOut();
        Fact fac = new Fact();

        fac.setNumber(inout.captureNumber());
        int number = fac.getNumber();

        inout.printResult(fac.calcularFactorial(number));

    }
}
