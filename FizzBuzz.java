package com.example.hello_world;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            if (number % 3 == 0)
                System.out.println("FIZZBUZZ");
            else
                System.out.println("FIZZ");
        }

        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);



    }


    }

