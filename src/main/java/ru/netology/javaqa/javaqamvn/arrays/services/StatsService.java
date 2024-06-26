package ru.netology.javaqa.javaqamvn.arrays.services;

public class StatsService {

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
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long totalSales(long[] sales) {
        long totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }
        return (long) totalSales;
    }

    public long averageSales(long[] sales) {
        long averageSales = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSales += sales[i];
        }
        return (long) averageSales / 12;
    }

    public int belowAverageSales(long[] sales) {
        int belowAverageSales = 0;
        long average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAverageSales++;
            }
        }
        return belowAverageSales;
    }

    public int higherAverageSales(long[] sales) {
        int higherAverageSales = 0;
        long average = averageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                higherAverageSales++;
            }
        }
        return higherAverageSales;
    }
}
