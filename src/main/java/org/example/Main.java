package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wordLength = (15 / 3) * 62;
        int spaceLength = 3 * 12;
        int phrase = wordLength + spaceLength;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Введите длину забора в сантиметрах: ");
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                if (0 < a) {
                    if (a <= phrase) {
                        System.out.println("Признание в любви уместится на заборе!");
                    } else {
                        System.out.println("Признание в любви не уместится на заборе!");
                    }
                    break;
                } else {
                    System.out.println("Значение длины должно быть положительным!");
                }
            } else {
                sc.next();
            }
        }
        sc.close();


    }
}

