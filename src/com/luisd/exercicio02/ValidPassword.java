package com.luisd.exercicio02;

import javax.swing.JOptionPane;

public class ValidPassword {

    public static void main (String []args) {

        String password = JOptionPane.showInputDialog(null, "Digite a senha: ");
        String valid_patter = "^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{6,}$";
        int minimumCharacterSize = 6;
        if (password.matches(valid_patter)) {
            System.out.println(0);
        }
        if (password.length() < minimumCharacterSize) {
            System.out.println(minimumCharacterSize-password.length());
        }

    }
}
