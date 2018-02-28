package com.seven.curso.factorial;

public class Fact {

    private int factorial;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public int calcularFactorial(int numero){

        if((numero == 0 || numero == 1)) {
            return 1;
        }
            else {
                factorial = numero * calcularFactorial(numero-1);
                return factorial;
        }

    }


}
