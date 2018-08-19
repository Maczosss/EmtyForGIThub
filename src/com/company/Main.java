package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Losujemy liczby!");
        System.out.print("Podaj ile: ");

        int ile;
        ile = scanner.nextInt();

        Random random = new Random();
        for (int i = 0; i < ile; i++) {
            int x = random.nextInt(99 + 1);

            System.out.println(x);


        }


    }
}
