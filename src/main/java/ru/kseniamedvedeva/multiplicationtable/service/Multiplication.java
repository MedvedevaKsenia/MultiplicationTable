package ru.kseniamedvedeva.multiplicationtable.service;

public class Multiplication {
    static int res = 0;

    public static void outputTable(int num1, int num2) {
        multiplyingNumbers(num1, num2);
    }

    private static void multiplyingNumbers(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            for (int j = 1; j < 11; j++) {
                res = i * j;
                System.out.println(i + " x " + j + " = " + res);
            }
            System.out.println();
        }
    }
}
