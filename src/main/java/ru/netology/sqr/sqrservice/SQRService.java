package ru.netology.sqr.sqrservice;

public class SQRService {

    public int calculate(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= a) {
                if (sqr <= b) {
                    count++;
                }
            }
        }
        return count;
    }
}

