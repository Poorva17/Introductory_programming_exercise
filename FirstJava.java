import java.io.*;
import java.lang.System;

public class FirstJava {
    public static void main(String[] args) {
        int ch1, ch2;
        FirstJava J = new FirstJava();
        J.print();
        try {
            System.out.println("Enter no of asterisks:");
            InputStreamReader stdin = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(stdin);
            ch1 = Integer.parseInt(br.readLine());
            System.out.println("Horizontal line:");
            J.print1(ch1);
            System.out.println("\nVertical line:");
            J.print2(ch1);
            System.out.println("\nRight angled triangle:");
            J.print3(ch1);
            System.out.println("\nDiamond1:");
            J.print4(ch1);
            System.out.println("\nDiamon2:");
            J.print5(ch1);
            System.out.println("\nDiamon3:");
            J.print6(ch1);
            System.out.println("\nFizzbuzz");
            J.FizzBuzz();
            System.out.println("Enter number for prime factors:");
            InputStreamReader stdin1 = new InputStreamReader(System.in);
            BufferedReader br1 = new BufferedReader(stdin1);
            ch2 = Integer.parseInt(br1.readLine());
            System.out.println("\nPrime Factors:");
            J.prime(ch2);
        } catch (Exception e) {
            System.out.println("ERROR!!!");
        }
    }

    public void print() {
        System.out.println("*");
    }

    public void print1(int n) {
        int i;

        for (i = 0; i < n; i++)
            System.out.print("*");
    }

    public void print2(int n) {
        int i;

        for (i = 0; i < n; i++)
            System.out.println("*");
    }

    public void print3(int n) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void print4(int n) {
        int i, j, k, space = n - 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;

            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.print("\n");
        }
    }

    public void print5(int n) {
        int i, j, k, space = n - 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;

            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.print("\n");
        }

        space = 1;

        for (i = 1; i <= n - 1; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;

            for (j = 1; j <= 2 * (n - i) - 1; j++)
                System.out.print("*");

            System.out.print("\n");
        }


    }


    public void print6(int n) {
        int i, j, k, space = n - 1;

        for (i = 1; i < n; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;

            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.print("\n");
        }
        if (i == n) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            System.out.print("Poorva\n");
        }

        space = 1;

        for (i = 1; i <= n - 1; i++) {
            for (j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;

            for (j = 1; j <= 2 * (n - i) - 1; j++)
                System.out.print("*");

            System.out.print("\n");
        }


    }

    public void FizzBuzz() {
        int i = 0;

        for (i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }

    public void prime(int number) {
        int i;

        if (number == 1) {
            System.out.print("Prime Factor :" + number);
        } else {
            while (number % 2 == 0) {
                System.out.print(" 2 ");
                number = number / 2;
            }
            for (i = 3; i < number; i += 2) {
                while (number % i == 0) {
                    System.out.print(" " + i + " ");
                    number = number / i;
                }
            }
            if (number > 2)
                System.out.print(" "+number+" ");

        }
    }
}
