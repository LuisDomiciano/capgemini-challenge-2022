package com.luisd.exercicio03;

public class Factorial {

    public Factorial() {

    }

    public int factorial (int number) {
        int factor = 1;
        while (number > 1) {
            factor *= number;
            number--;
        }
        return factor;
    }
}
