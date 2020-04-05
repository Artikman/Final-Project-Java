package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        int algorithmId = 0;
        int loopType = 0;
        int number = 0;

        try {
            System.out.println("Select 1 - Calculation of a series of Fibonacci numbers; 2 - factorial Calculation: ");
            Scanner scanner = new Scanner(System.in);
            algorithmId = scanner.nextInt();

            if(algorithmId < 0) {
                throw new Exception("The number must be positive!");
            }

            System.out.println("Select loop 1 - while; 2 - do-while; 3 - for: ");
            Scanner scanner1 = new Scanner(System.in);
            loopType = scanner1.nextInt();

            System.out.println("Choose a value for 1 - Fibonacci number; 2 - factorial: ");
            Scanner scanner2 = new Scanner(System.in);
            number = scanner2.nextInt();
        }
        catch(InputMismatchException | IllegalArgumentException  e) {
            System.out.println("You have entered an incorrect value, recheck the data!");
        }

        functionFibonacciWhile(algorithmId, loopType,  number);
        functionFibonacciDoWhile(algorithmId, loopType, number);
        functionFibonacciFor(algorithmId, loopType, number);
        functionFactorialWhile(algorithmId, loopType, number);
        functionFactorialDoWhile(algorithmId, loopType, number);
        functionFactorialFor(algorithmId, loopType, number);
    }

    private static void functionFibonacciWhile(int algorithmId, int loopType,  int number) {
        if (algorithmId == 1 && loopType == 1) {
            int[] f = new int[number];
            f[0] = 0;
            f[1] = 1;
            int i = 2;
            while (i < number) {
                f[i] = f[i - 1] + f[i - 2];
                ++i;
            }
            for (int ii = 0; ii < number; ++ii) {
                System.out.println(f[ii]);
            }
        }
    }

    private static void functionFibonacciDoWhile(int algorithmId, int loopType,  int number) {
        if (algorithmId == 1 && loopType == 2) {
            int[] f = new int[number];
            f[0] = 0;
            f[1] = 1;
            int i = 2;
            do {
                f[i] = f[i - 1] + f[i - 2];
                ++i;
            } while (i < number);
            for (int ii = 0; ii < number; ++ii) {
                System.out.println(f[ii]);
            }
        }
    }

    private static void functionFibonacciFor(int algorithmId, int loopType,  int number) {
        if (algorithmId == 1 && loopType == 3) {
            int[] f = new int[number];
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i < number; ++i) {
                f[i] = f[i - 1] + f[i - 2];
            }

            for (int i = 0; i < number; ++i) {
                System.out.println(f[i]);
            }
        }
    }

    private static void functionFactorialWhile(int algorithmId, int loopType,  int number) {
        if (algorithmId == 2 && loopType == 1) {
            long factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
    private static void functionFactorialDoWhile(int algorithmId, int loopType,  int number) {
        if (algorithmId == 2 && loopType == 2) {
            long factorial = 1;
            int i = 1;
            do {
                factorial = factorial * i;
                i++;
            } while (i <= number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

    private static void functionFactorialFor(int algorithmId, int loopType,  int number) {
        if (algorithmId == 2 && loopType == 3) {
            int factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}