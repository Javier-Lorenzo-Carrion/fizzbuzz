package com.lorenzoconsultores.fizzbuzzkata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PreparationFizzBuzzKataTest {

    @Test
    void getResult_should_return_number_when_numbers_are_not_multiple_of_five_or_three() {

        PreparationFizzBuzzKata kata = new PreparationFizzBuzzKata();
        String actual = kata.getResult(1);
        Assertions.assertEquals("1", actual);
    }

    @Test
    void getResult_should_return_Fizz_when_numbers_are_multiple_of_three() {

        PreparationFizzBuzzKata kata = new PreparationFizzBuzzKata();
        String actual = kata.getResult(3);
        Assertions.assertEquals("Fizz", actual);
    }

    @Test
    void getResult_should_return_Buzz_when_numbers_are_multiple_of_five() {

        PreparationFizzBuzzKata kata = new PreparationFizzBuzzKata();
        String actual = kata.getResult(5);
        Assertions.assertEquals("Buzz", actual);
    }

    @Test
    void getResult_should_return_FizzBuzz_when_numbers_are_multiple_of_three_and_five() {

        PreparationFizzBuzzKata kata = new PreparationFizzBuzzKata();
        String actual = kata.getResult(15);
        Assertions.assertEquals("FizzBuzz", actual);
    }

}
