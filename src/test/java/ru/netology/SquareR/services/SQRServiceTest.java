package ru.netology.SquareR.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void TestWithSquares() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.calcCountSquaresAtRange(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestWithoutSquares() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calcCountSquaresAtRange(10, 10);

        Assertions.assertEquals(expected, actual);
    }
}