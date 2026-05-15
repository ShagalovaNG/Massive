package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public long getSum(long[] sumSales) {
        long sum = 0;
        for (int i = 0; i < sumSales.length; i++) {

            sum += sumSales[i];
        }
        return (sum);
    }


    public long getArifmMean(long[] arithmeticMean) {

        long arrive = 0;
        for (int k = 0; k < arithmeticMean.length; k++) {
            arrive += arithmeticMean[k];

        }
        long arithmeticMeanSales = (arrive) / arithmeticMean.length;
        return ((arrive) / arithmeticMean.length);
    }


    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long getNumberSalesMoreArifmMean(long[] arithmeticMean) {
        int countElementMoreAverage = 0;
        long arrive = 0;
        for (int k = 0; k < arithmeticMean.length; k++) {
            arrive += arithmeticMean[k];
        }
        long arithmeticMeanSales = (arrive) / arithmeticMean.length;
        for (long elementMassive : arithmeticMean) {
            if (elementMassive > arithmeticMeanSales)
                countElementMoreAverage++;
        }

        return (countElementMoreAverage);
    }


    public int getNumberSalesLessArifmMean(long[] arithmeticMean) {
        int countElementMoreAverage = 0;
        long arrive = 0;
        for (int k = 0; k < arithmeticMean.length; k++) {
            arrive += arithmeticMean[k];
        }
        long arithmeticMeanSales = (arrive) / arithmeticMean.length;
        for (long elementMassive : arithmeticMean) {
            if (elementMassive <= arithmeticMeanSales)
                countElementMoreAverage++;
        }

        return (countElementMoreAverage);
    }
}


