package com.seven.curso.factorial;

import java.util.Scanner;

public class InOut {

    public int captureNumber(){
        int num;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el número");
        num = in.nextInt();

        return num;
    }

    public void printResult(int result){
        System.out.println("El resultado es "+ result);
    }
}
