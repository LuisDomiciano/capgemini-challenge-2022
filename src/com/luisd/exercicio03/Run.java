package com.luisd.exercicio03;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Run {

    public static void main (String []args) {
        String word = JOptionPane.showInputDialog(null, "Digite a palavra:");
        Factorial factorial = new Factorial();
        int size = word.length();
        Map<Character, Integer> repeaterLetters = new HashMap<Character, Integer>();
        int letterRepeater = 1;
        Anagram anagram[] = new Anagram[size];

        for (int i = 0; i < size; i++) {
            anagram[i] = new Anagram(word.toCharArray()[i], 1);
        }

        for (int i = 0; i < size; i++) {
            if (repeaterLetters.containsKey(anagram[i].getLetter())) {
                int letter = repeaterLetters.get(anagram[i].getLetter());
                repeaterLetters.put(word.toCharArray()[i], letter + anagram[i].getCount() );
            }
            else {
                repeaterLetters.put(anagram[i].getLetter(), anagram[i].getCount());
            }
        }

        for (Character key: repeaterLetters.keySet()) {
            //System.out.println(key + " - " + repeaterLetters.get(key));
            letterRepeater *= (factorial.factorial(repeaterLetters.get(key)));
        }

        System.out.println(factorial.factorial(size)/letterRepeater);

    }
}
