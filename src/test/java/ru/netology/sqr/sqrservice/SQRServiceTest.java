package ru.netology.sqr.sqrservice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testLimitValues() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLowerBound() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testHighBound() {
        SQRService service = new SQRService();

        int actual = service.calculate(300, 300);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
