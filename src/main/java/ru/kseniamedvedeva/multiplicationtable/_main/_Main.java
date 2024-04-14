package ru.kseniamedvedeva.multiplicationtable._main;

import ru.kseniamedvedeva.multiplicationtable.service.Multiplication;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplication table:");
        Multiplication.outputTable();
    }
}
