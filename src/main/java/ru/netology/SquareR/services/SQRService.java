package ru.netology.SquareR.services;

public class SQRService {
    public int calcCountSquaresAtRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            double result = Math.sqrt(i);
            double resultRound = Math.round(result);
            if (result == resultRound) {
                count++;
            }
        }

        return count;
    }
}
