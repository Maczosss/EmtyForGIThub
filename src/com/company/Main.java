package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Losujemy liczby!");
//        System.out.print("Podaj ile: ");

//        int ile;
//        ile = scanner.nextInt();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int x = random.nextInt(50);

            System.out.println(x);


        }


    }
}
