package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void calcInShortLimit() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqrtInLimit(200, 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcInLongLimit() {
        SQRService service = new SQRService();

        int expected = 22;
        int actual = service.calcSqrtInLimit(100, 1000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calcInFullLimit() {
        SQRService service = new SQRService();

        int expected = 90;
        int actual = service.calcSqrtInLimit(100, 9801);

        Assertions.assertEquals(expected, actual);

    }
}
