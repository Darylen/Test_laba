package com.company;

public class Main {

    public static boolean Check(double A, double B, double C) {
        if (A > 0 && B > 0 && C > 0 && A + B > C && A + C > B && B + C > A) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }
}
