package ru.netology.sqr;

public class SQRService {
    public int func(int a, int b) {
        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i) > a && (i * i) < b) {
                sum++;
            }
        }
        return sum;
    }
}
