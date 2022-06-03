package ru.netology.SquareR.services;

public class SQRService {
    public int calcCountSquaresAtRange(int start, int end) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (start <= i * i && i * i <= end) {
                count++;
            }
        }

        return count;
    }
}
