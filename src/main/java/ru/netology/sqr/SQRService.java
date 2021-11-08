package ru.netology.sqr;

public class SQRService {
    public int square(int low, int up) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (low <= i * i && i * i <= up) {
                amount++;
            }
        }
        return amount;
    }

}
