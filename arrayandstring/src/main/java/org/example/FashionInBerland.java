package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FashionInBerland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> buttons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int button = scanner.nextInt();
            buttons.add(button);
        }

        if (buttons.size() == 1) {
            System.out.println(buttons.get(0) == 1 ? "YES" : "NO");
            return;
        }
        int fastenedCount = (int) buttons.stream().filter(button -> button == 0)
                        .count();
        System.out.println(fastenedCount == 1 ? "YES" : "NO");
    }
}
