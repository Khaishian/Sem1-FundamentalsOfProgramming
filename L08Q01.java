package Week01;

import java.util.Random;

public class Number {

    public int[] integer;

    public Number() {
        Random ran = new Random();
        this.integer = new int[10];
        for (int i = 0; i < 10; i++) {
            integer[i] = ran.nextInt(101);
        }
        this.printList();
        this.evenNum();
        this.primeNum();
        this.maxNum();
        this.minNum();
        this.aveNum();
        this.squareNum();

    }

    public Number(int n) {
        Random ran = new Random();
        this.integer = new int[n];
        for (int i = 0; i < n; i++) {
            integer[i] = ran.nextInt(101);
        }

        this.printList();
        this.evenNum();
        this.primeNum();
        this.maxNum();
        this.minNum();
        this.aveNum();
        this.squareNum();
    }

    public Number(int n, int limit) {
        Random ran = new Random();
        this.integer = new int[n];
        for (int i = 0; i < n; i++) {
            integer[i] = ran.nextInt(limit + 1);
        }

        this.printList();
        this.evenNum();
        this.primeNum();
        this.maxNum();
        this.minNum();
        this.aveNum();
        this.squareNum();

    }

    public void printList() {
        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i] + " ");
        }
        System.out.println("");
    }

    public void evenNum() {
        System.out.print("Even numbers are: ");
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 == 0) {
                System.out.print(integer[i] + " ");
            }
        }
        System.out.println("");
    }

    public void maxNum() {
        System.out.print("Maximum number is: ");
        int max = integer[0];
        for (int i = 1; i < integer.length; i++) {
            if (integer[i] > max) {
                max = integer[i];
            }
        }
        System.out.println(max);
    }

    public void minNum() {
        System.out.print("Minimum number is: ");
        int min = integer[0];
        for (int i = 1; i < integer.length; i++) {
            if (integer[i] < min) {
                min = integer[i];
            }
        }
        System.out.println(min);

    }

    public void aveNum() {
        System.out.print("Average is: ");
        int sum = 0;
        for (int i = 0; i < integer.length; i++) {
            sum += integer[i];
        }
        double res = sum / integer.length;
        System.out.printf("%.2f ", res);
        System.out.println("");

    }

    public void squareNum() {
        System.out.print("Square numbers are: ");
        boolean hasSquare = false;
        for (int i = 0; i < integer.length; i++) {
            double res = Math.sqrt(integer[i]);
            if (res - Math.floor(res) == 0) {
                System.out.print(integer[i] + " ");
                hasSquare = true;
            }
        }
        System.out.println("");
        if (hasSquare == false) {
            System.out.print("No square numbers");
            System.out.println("");
        }

    }

    public void primeNum() {
        int i;
        System.out.print("Prime numbers are: ");
        boolean hasPrime = false;
        for (int j = 0; j < integer.length; j++) {
            for (i = 2; integer[j] % i != 0; i++);
            if (i == integer[j]) {
                System.out.print(integer[j] + " ");
                hasPrime = true;
            }
        }
        if (hasPrime == false) {
            System.out.print("No prime numbers");
        }
        System.out.println("");
    }

}
