package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FizzBuzzTest {
    FizzBuzz fizzBuzz = null;

    @BeforeEach
    void setup(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnOneIfNumberIsOne(){
        assertEquals("1",fizzBuzz.compute(1,1));
    }

    @Test
    public void shouldReturnTwoIfNumberIsTwo(){
        assertEquals("2",fizzBuzz.compute(2,2));
    }
    @Test
    public void shouldReturnFizzIfNumberIsThree(){
        assertEquals("Fizz",fizzBuzz.compute(3,3));
    }

    @Test
    public void shouldReturnFizzIfNumberIsSix(){
        assertEquals("Fizz",fizzBuzz.compute(6,6));
    }
    @Test
    public void shouldReturnBuzzIfNumberIsFive(){
        assertEquals("Buzz",fizzBuzz.compute(5,5));
    }
    @Test
    public void shouldReturnBuzzIfNumberIsTen(){
        assertEquals("Buzz",fizzBuzz.compute(10,10));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIsFifteen(){
        assertEquals("FizzBuzz",fizzBuzz.compute(15,15));
    }
    @Test
    public void shouldReturnFizzBuzzIfNumberIs30(){
        assertEquals("FizzBuzz",fizzBuzz.compute(30,30));
    }
    @Test
    public void shouldGenerateof1to2(){
        assertEquals("12",fizzBuzz.compute(1,2));
    }
    @Test
    public void shouldReturnResultOf1to3(){
        assertEquals("12Fizz",fizzBuzz.compute(1,3));
    }
    @Test
    public void shouldReturn12Fizz4From1To4(){
        assertEquals("12Fizz4",fizzBuzz.compute(1,4));
    }
    @Test
    public void shouldReturn12Fizz4BuzzFrom1To5(){
        assertEquals("12Fizz4Buzz",fizzBuzz.compute(1,5));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizzFrom1To6(){
        assertEquals("12Fizz4BuzzFizz",fizzBuzz.compute(1,6));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz7From1To7(){
        assertEquals("12Fizz4BuzzFizz7",fizzBuzz.compute(1,7));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz78From1To8(){
        assertEquals("12Fizz4BuzzFizz78",fizzBuzz.compute(1,8));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz78FizzFrom1To9(){
        assertEquals("12Fizz4BuzzFizz78Fizz",fizzBuzz.compute(1,9));
    }




}