package com.luisd.exercicio03;

public class Anagram {
    private char letter;
    private int count;

    public Anagram(char letter, int count) {
        this.letter = letter;
        this.count = count;
    }
    public char getLetter() {
        return this.letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}