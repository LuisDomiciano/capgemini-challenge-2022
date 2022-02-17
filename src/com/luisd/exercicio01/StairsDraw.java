package com.luisd.exercicio01;

import javax.swing.JOptionPane;

public class StairsDraw {

    public static void main (String []args) {

        int size = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número maior ou igual a 2 para desenhar a escada: "));
        String stairs[][] = new String[size][size];
        for (int line = 0; line < size; line++) {
            for (int column = 0; column < size; column++) {
                if ((line + column) >= (size-1)) {
                    stairs[line][column] = "*";
                } else {
                    stairs[line][column] = " ";
                }
            }
        }

        for (int line = 0; line < size; line++) {
            for (int column = 0; column < size; column++) {
                System.out.print(stairs[line][column]);
            }
            System.out.println("");
        }

    }
}
