package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // total of passwords
        int k = scanner.nextInt(); // count-limit in order to delay 5s for next time
        scanner.nextLine();
        List<String> passwords = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();
            passwords.add(password);
        }

        String correctPassword = scanner.nextLine();

        int shorterLengthPasswordCount = (int) passwords.stream().filter(password -> password.length() < correctPassword.length()).count();
        int sameLengthPasswordCount = (int) passwords.stream().filter(password -> password.length() == correctPassword.length()).count();
        int bestTries = shorterLengthPasswordCount + 1;
        int bestWaitTime = (shorterLengthPasswordCount / k) * 5;
        int bestTime = bestTries + bestWaitTime;

        int worstTries = shorterLengthPasswordCount + sameLengthPasswordCount;
        int worstWaitTime = ((worstTries - 1) / k) * 5;
        int worstTime = worstTries + worstWaitTime;
        System.out.println(bestTime + " " + worstTime);
    }
}
