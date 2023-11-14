package seminars.third.HW_3_1;


import org.junit.jupiter.api.*;
import seminars.third.HW_3_1.EvenOddNumber;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddNumberTest {

    EvenOddNumber evenOddNumber;

    @Test
    @BeforeEach
    void setUp(){
        evenOddNumber = new EvenOddNumber();
    }

    @Test
    @DisplayName("Проверка четного числа")
    void testEven() {
        assertTrue(evenOddNumber.evenOddNumber(2), "Ошибка при проверке четного числа");
    }

    @Test
    @DisplayName("Проверка нечетного числа")
    void testOdd() {
        assertFalse(evenOddNumber.evenOddNumber(1), "Ошибка при проверке нечетного числа");
    }

    @Test
    @DisplayName("Проверка ноля")
    void testZero() {
        assertTrue(evenOddNumber.evenOddNumber(0), "Ошибка при проверке ноля");
    }

    @Test
    @DisplayName("Проверка отрицательного четного числа")
    void testNegEven() {
        assertTrue(evenOddNumber.evenOddNumber(-2), "Ошибка при проверке отрицательного четного числа");
    }

    @Test
    @DisplayName("Проверка отрицательного нечетного числа")
    void testNegOdd() {
        assertFalse(evenOddNumber.evenOddNumber(-1), "Ошибка при проверке отрицательного нечетного числа");
    }
}