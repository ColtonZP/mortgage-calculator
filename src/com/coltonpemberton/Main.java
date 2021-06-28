package com.coltonpemberton;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Period: ");
        byte period = scanner.nextByte();

        System.out.print("APR: ");
        float APR = (scanner.nextFloat() / 100) / 12;

        String mortgage = formatter.format(principal * ((APR * Math.pow((1 + APR), (period * 12))) / (Math.pow((1 + APR), (period * 12)) - 1)));

        System.out.printf("Mortgage: %s", mortgage);
    }
}
