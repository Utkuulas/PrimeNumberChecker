package com.utkuulasaltin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int input;
        boolean isPrimeNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        input = scanner.nextInt();

        isPrimeNumber = decidePrimeNumber(input);

        if (isPrimeNumber) {
            System.out.println(input + " is a PRIME NUMBER");
        } else {
            System.out.println(input + " is NOT a prime number");
        }
    }

    public static boolean decidePrimeNumber(int number) {
        if (number > 1) {
            if(number == 2) {
                return true;
            }
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

