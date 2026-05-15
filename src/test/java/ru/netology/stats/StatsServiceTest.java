package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindSumSales() {
        StatsService service = new StatsService();

        long[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 180;
        long actualSum = service.getSum(sumSales);

        Assertions.assertEquals(expectedDay, actualSum);

    }

    @Test
    public void shouldFindArithmeticMeanSales() {
        StatsService service = new StatsService();

        long[] sumSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 15;
        long actualArifmetics = service.getArifmMean(sumSales);

        Assertions.assertEquals(expectedDay, actualArifmetics);

    }

    @Test
    public void shouldFindNumberMonthMinSales() {
        StatsService service = new StatsService();

        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(minMonth);

        Assertions.assertEquals(expectedDay, actualDay);

    }

    @Test
    public void shouldFindNumberMonthMaxSales() {
        StatsService service = new StatsService();

        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 7;
        int actualDay = service.maxSales(maxMonth);

        Assertions.assertEquals(expectedDay, actualDay - 1);

    }

    @Test
    public void shouldCountMonthMoreSalesArifm() {
        StatsService service = new StatsService();

        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedResult = 5;
        long actualResult = service.getNumberSalesMoreArifmMean(maxMonth);

        Assertions.assertEquals(expectedResult, actualResult);

    }


    @Test
    public void shouldCountMonthLessSalesArifm() {
        StatsService service = new StatsService();

        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedResult = 7;
        long actualResult = service.getNumberSalesLessArifmMean(maxMonth);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}