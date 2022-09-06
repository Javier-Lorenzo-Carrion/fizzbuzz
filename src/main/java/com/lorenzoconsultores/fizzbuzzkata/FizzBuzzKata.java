package com.lorenzoconsultores.fizzbuzzkata;

public class FizzBuzzKata {
    public static void main(String[] args) {

        PreparationFizzBuzzKata kata = new PreparationFizzBuzzKata();

        for (int i = 1; i <= 100; i++){

            System.out.println(kata.getResult(i));
        }
    }
}

