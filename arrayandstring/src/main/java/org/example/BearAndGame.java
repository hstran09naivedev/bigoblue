package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BearAndGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> interestingMinutes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            interestingMinutes.add(scanner.nextInt());
        }

        int boringMinute = 0;
        int turnOffMinute = 0;
        for (int i = 0; i < n; i++) {
            boringMinute = boringMinute + 15;
            if (boringMinute < interestingMinutes.get(i)) {
                turnOffMinute = boringMinute;
                break;
            } else {
                boringMinute = interestingMinutes.get(i);
            }
        }
        if (turnOffMinute == 0) {
            turnOffMinute = Math.min(boringMinute + 15, 90);
        }

        System.out.println(turnOffMinute);
    }
}
