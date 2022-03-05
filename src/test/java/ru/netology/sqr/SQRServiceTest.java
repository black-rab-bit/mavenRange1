package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void tryToCalculateRange() {
        SQRService service = new SQRService();
        int minCount = 200;
        int maxCount = 300;
        int expected = 3;

        int actual = service.calculateRange(minCount, maxCount);

        assertEquals(expected, actual);
    }

    @Test
    void outOfLimit() {
        SQRService service = new SQRService();
        int minCount = 0;
        int maxCount = 99;
        int expected = 0;

        int actual = service.calculateRange(minCount, maxCount);

        assertEquals(expected, actual);
    }

    @Test
    void negativeRange() {
        SQRService service = new SQRService();
        int minCount = -1200;
        int maxCount = -100;
        int expected = 0;

        int actual = service.calculateRange(minCount, maxCount);

        assertEquals(expected, actual);
    }

    @Test
    void absoluteRange() {
        SQRService service = new SQRService();
        int minCount = 100;
        int maxCount = 9801;
        int expected = 88;

        int actual = service.calculateRange(minCount, maxCount);

        assertEquals(expected, actual);
    }
}