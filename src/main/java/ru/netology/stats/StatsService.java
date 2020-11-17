package ru.netology.stats;

public class StatsService {

    public int sum(int[] purchases) {
        int result = 0;

        for (int purchase : purchases) {
            result += purchase;
        }

        return result;
    }

    public int average(int[] purchases){
        return sum(purchases) / purchases.length;
    }


    public int monthWithMax(int[] purchases) {
        int max = getMax(purchases);

        int monthNumber = 0;
        int  monthWithMax = 0;
        for (int purchase : purchases) {
            monthNumber++;
            if (purchase == max) {
                monthWithMax = monthNumber;
            }
        }
        return monthWithMax;

    }

    public int monthWithMin(int[] purchases) {
        int min = getMin(purchases);

        int monthNumber = 0;
        int  monthWithMin = 0;
        for (int purchase : purchases) {
            monthNumber++;
            if (purchase == min) {
                monthWithMin = monthNumber;
            }
        }
        return monthWithMin;

    }


    public int getMax(int[] purchases) {
        int max = purchases[0];
        for (int purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }

    public int getMin(int[] purchases) {
        int min = purchases[0];
        for (int purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }

    public int moreThenAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase > average) {
                count++;
            }
        }
        return count;
    }

    public int lessThenAverage(int[] purchases) {
        int average = average(purchases);
        int count = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                count++;
            }
        }
        return count;
    }
}
