package ru.kseniamedvedeva.multiplicationtable.service;

public class Multiplication {
    static int res = 0;
    public static void outputTable() {
    multiplyingNumbers();
    }

    private static void multiplyingNumbers() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                res = i * j;
                System.out.println(i + " x " + j + " = " + res);
            }
            System.out.println();
        }
    }
}
