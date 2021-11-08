package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void theLowerBorderIsLargerThanTheUpperOne() {
        SQRService service = new SQRService();
        // подготавливаем данные:
        int low = 1000;
        int up = 990;
        int amount = 0;
        // вызываем целевой метод:
        int actual = service.square(low, up);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(amount, actual);
    }

    @org.junit.jupiter.api.Test
    void theUpperBoundIs99() {
        SQRService service = new SQRService();
        // подготавливаем данные:
        int low = 10;
        int up = 99;
        int amount = 0;
        // вызываем целевой метод:
        int actual = service.square(low, up);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(amount, actual);
    }

    @org.junit.jupiter.api.Test
    void theNumberOfValuesSatisfyingTheConditionTwo() {
        SQRService service = new SQRService();
        // подготавливаем данные:
        int low = 250;
        int up = 300;
        int amount = 2;
        // вызываем целевой метод:
        int actual = service.square(low, up);
        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(amount, actual);
    }
}