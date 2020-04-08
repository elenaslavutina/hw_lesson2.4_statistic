package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSum(long[] purchases) {
        long sum = calculateSum(purchases);
        return (sum / purchases.length);
    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        long month_number = 1;
        int i = 1;
        for (long purchase : purchases) {
              if (currentMax < purchase) {
                currentMax = purchase;
                month_number = i;
            }
              i +=1;
        }

        return month_number;
    }

    public long findMin(long[] purchases) {
        long currentMin = purchases[0];
        long month_number = 1;
        int i = 1;
        for (long purchase : purchases) {
            if (currentMin > purchase){
                currentMin = purchase;
                month_number = i;
            }
            i +=1;
        }
        return month_number;
    }

    public long calculateQuantityMonthLessAvarage(long[] purchases) {
        long averageSum = calculateAverageSum(purchases);
        long quantity = 0;
        for (long purchase : purchases) {
            if (averageSum > purchase) {
                quantity += 1;
            }

        }
        return quantity;
    }



    public long calculateQuantityMonthMoreAvarage ( long[] purchases){
        long averageSum = calculateAverageSum(purchases);
        long quantity = 0;
        for (long purchase : purchases) {
            if (averageSum < purchase) {
                quantity += 1;
            }

        }
        return quantity;

        }
    }
