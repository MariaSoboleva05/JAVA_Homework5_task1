package ru.netology.sqr;

public class SQRService {

    public int calcSqrtInLimit(int min, int max) {
        int n = 0;
        for (int i = 10; i <= 99; i++) {

            if (i * i >= min && i * i <= max) {
                n = n + 1;
            }

        }
        return n;
    }

}

