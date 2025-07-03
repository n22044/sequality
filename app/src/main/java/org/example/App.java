package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Calculate calc = new Calculate();

        int a = 2, b = 3;
        int sum = calc.sum(a, b);
        double avg = (a + b) / 2.0;
        System.out.println("Sum of " + a + " and " + b + " is " + sum + ". Average is " + avg + ".");

        int totalSum = 0;
        for (int i = 1; i <= 10; i++) {
            totalSum += i;
        }
        System.out.println("Sum of 1 to 10 is " + totalSum + ". Average is " + (totalSum / 10.0) + ".");

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of odd of 1 to 10 is " + oddSum + ".");
        System.out.println("Sum of even of 1 to 10 is " + evenSum + ".");
    }
}
