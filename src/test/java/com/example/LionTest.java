package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Lion lion_m;
    Lion lion_f;
    Lion lion_error;

    @Test
    public void lionMaleHasMane() throws Exception {
        lion_m = new Lion("Самец");
        assertTrue(lion_m.doesHaveMane(), "Самец должен иметь гриву");
    }

    @Test
    public void lionFemaleDoesNotHaveMane() throws Exception {
        lion_f = new Lion("Самка");
        assertFalse(lion_f.doesHaveMane(), "У самки не должно быть гривы");
    }

    @Test
    public void lionWithRandomSexThrowsReadableError() {
        //lion_error = new Lion("Random");
        Exception exception = assertThrows(
                Exception.class,
                () -> {
                    lion_error = new Lion("Random");
                }
        );
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}