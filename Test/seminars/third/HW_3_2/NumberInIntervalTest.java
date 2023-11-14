package seminars.third.HW_3_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberInIntervalTest {

    private NumberInInterval testClass;

    @BeforeEach
    void setUp(){
        testClass = new NumberInInterval();
    }

    @Test
    @DisplayName("проверка числа меньше диапазона")
    void testBelowRange(){
        assertFalse(testClass.numberInInterval(24), "ошибка когда число меньше диапазона");
    }

    @Test
    @DisplayName("проверка числа больше диапазона")
    void testAboveRange(){
        assertFalse(testClass.numberInInterval(102), "ошибка когда число больше диапазона");
    }

    @Test
    @DisplayName("проверка числа в диапазоне")
    void testInRange(){
        assertTrue(testClass.numberInInterval(50), "ошибка когда числа в диапазоне");
    }

}