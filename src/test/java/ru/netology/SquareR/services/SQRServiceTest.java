package ru.netology.SquareR.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/SQR.csv")
    public void TestWithSquares(int start, int end, int expected) {
        SQRService service = new SQRService();

        int actual = service.calcCountSquaresAtRange(start, end);

        Assertions.assertEquals(expected, actual);
    }

}