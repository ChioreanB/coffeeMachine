package CoffeeMachine;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeTest {

    @Test
    public void whenCoffeeIsNullTrowException() {

        //given
        boolean input = false;

        //when
        Exception exception;
        exception = assertThrows(RuntimeException.class, () -> new Coffee.Builder(input).build());

        //then
        assertEquals("Must contain coffee.", exception.getMessage());

    }
}