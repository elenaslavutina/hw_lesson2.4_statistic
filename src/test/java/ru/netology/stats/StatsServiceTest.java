package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    //    @ParameterizedTest
    //   @CsvSource({
    //           "8,15,13,15,17,20,19,20,7,14,14,18"})
    @Test
    void shouldCalculateSum() {
        StatsService stats = new StatsService();
        long[] month_purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long sum = stats.calculateSum(month_purchase);
//        System.out.println(sum);  проверка правильности рассчетов
        assertEquals(expected, sum);
    }

    @Test
    void shouldcalculateAverageSum() {
        StatsService stats = new StatsService();
        long[] month_purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long averageSum = stats.calculateAverageSum(month_purchase);
        //    System.out.println(averageSum); проверка правильности рассчетов
        assertEquals(expected, averageSum);
    }

    @Test
    void shouldFindMax() {
        StatsService stats = new StatsService();
        long[] month_purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 6;
        long max = stats.findMax(month_purchase);
        //    System.out.println(max); //проверка правильности рассчетов
        assertEquals(expected, max);
    }

    @Test
    void shouldFindMin() {
        StatsService stats = new StatsService();
        long[] month_purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long min = stats.findMin(month_purchase);
        //  System.out.println(min); //проверка правильности рассчетов
        assertEquals(expected, min);
    }

    @Test
    void shouldCalculateQuantityMonthLessAvarage() {
        StatsService stats = new StatsService();
        long[] month_purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long quantity = stats.calculateQuantityMonthLessAvarage(month_purchase);
        //  System.out.println(quantity); //проверка правильности рассчетов
        assertEquals(expected, quantity);
    }

    @Test
    void shouldCalculateQuantityMonthMoreAvarage() {
        StatsService stats = new StatsService();
        long[] month_purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long quantity = stats.calculateQuantityMonthMoreAvarage(month_purchase);
        //  System.out.println(quantity); //проверка правильности рассчетов
        assertEquals(expected, quantity);
    }
}