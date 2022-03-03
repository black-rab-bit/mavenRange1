package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void finderFunc() {
        SQRService service = new SQRService();
        int a = 200;
        int b = 300;
        int expected = 3;

        int actual = service.func(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void outOfLimitFunc() {
        SQRService service = new SQRService();
        int a = 0;
        int b = 99;
        int expected = 0;

        int actual = service.func(a, b);

        assertEquals(expected, actual);
    }

@Test
    void minusFunc() {
            SQRService service = new SQRService();
            int a = -1200;
            int b = -100;
            int expected = 0;

            int actual = service.func(a, b);

            assertEquals(expected, actual);
            }

@Test
    void equalFunc() {
            SQRService service = new SQRService();
            int a = 100;
            int b = 9801;
            int expected = 88;

            int actual = service.func(a, b);

            assertEquals(expected, actual);
            }
            }