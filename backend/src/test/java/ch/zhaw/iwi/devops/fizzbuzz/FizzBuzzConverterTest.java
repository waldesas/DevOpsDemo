package ch.zhaw.iwi.devops.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzConverterTest {
//erster Testlauf
    @Test
    public void fizzBuzzConverter1() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("10", fizzBuzz.convert(1));

    }
    
    //Zweiter Testlauf
    @Test
    public void fizzBuzzConverter2() {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        Assertions.assertEquals("100", fizzBuzz.convert(1));

    }
}