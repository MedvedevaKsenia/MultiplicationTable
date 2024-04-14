package ru.kseniamedvedeva.multiplicationtable._main;

import ru.kseniamedvedeva.multiplicationtable.service.Multiplication;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 number (1 to 9):");
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
            System.out.println("Enter 2 number (1 to 9):");
            if (scanner.hasNextInt()) {
                num2 = scanner.nextInt();
            } else {
                System.out.println("You entered not number!");
            }
        } else {
            System.out.println("You entered not number!");
        }
        scanner.close();
        if (num1 != 0 && num2 != 0) {
            System.out.println("Multiplication table:");
            Multiplication.outputTable(num1, num2);
        }
    }
}
