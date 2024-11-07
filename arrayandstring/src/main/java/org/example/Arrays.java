package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nA = scanner.nextInt();
        int nB = scanner.nextInt();
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        int k = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < nA; i++) {
            int num = scanner.nextInt();
            listA.add(num);
        }

        for (int i = 0; i < nB; i++) {
            int num = scanner.nextInt();
            listB.add(num);
        }

        int maxAByK = listA.stream().limit(k).max(Integer::compareTo).get();
        int minBByM = listB.stream()
                .sorted(Comparator.reverseOrder())
                .limit(m)
                .min(Integer::compareTo)
                .get();

        System.out.println(maxAByK<minBByM ? "YES" : "NO");
    }
}
