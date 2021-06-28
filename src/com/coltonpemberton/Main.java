package com.coltonpemberton;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        int principal = 0;

        while (principal < 1_000 || principal > 1_000_000) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal < 1_000 || principal > 1_000_00) {
                System.out.println("Please enter a number between 1,000 and 1,000,000");
            }
        }

        byte period = 0;
        while (period < 1 || period > 30) {
            System.out.print("Period (1 - 30): ");
            period = scanner.nextByte();
            if (period < 1 || period > 30 ) {
                System.out.println("Please enter a number between 1and 30");
            }
        }

        System.out.print("APR: ");
        float APR = (scanner.nextFloat() / 100) / 12;

        String mortgage = formatter.format(principal * ((APR * Math.pow((1 + APR), (period * 12))) / (Math.pow((1 + APR), (period * 12)) - 1)));

        System.out.printf("Mortgage: %s", mortgage);
    }
}
