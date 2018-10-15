package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c;

        for(;;) {
            try {
                System.out.print("Введите первое чило: ");
                a = sc.nextDouble();
                System.out.print("Введите второе чило: ");
                b = sc.nextDouble();
                System.out.print("Введите операцию(Пример: +, -, * or /): ");
                String op = sc.next();

                switch (op) {

                    case "+":
                        c = a + b;
                        System.out.println(c);
                        break;
                    case "-":
                        c = a - b;
                        System.out.println(c);
                        break;
                    case "*":
                        c = a * b;
                        System.out.println(c);
                        break;
                    case "/":
                        if (b == 0) {
                            System.out.println("ERROR: b = 0, because on 0 share cannot be");
                            break;
                        }
                        c = a / b;
                        System.out.println(c);
                        break;
                }
            }
            catch (Exception o){}
        }
    }
}
