package ru.netology.sqr;

public class SQRService {
    public int calculateRange(int minCount, int maxCount) {
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i) >= minCount && (i * i) <= maxCount) {
                sum++;
            }
        }
        return sum;
    }
}
