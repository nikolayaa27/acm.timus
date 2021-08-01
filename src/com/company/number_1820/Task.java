package com.company.number_1820;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int k = in.nextInt();

        if (k >= n) {
            out.println(2);
        } else {
            if ((n * 2) % k == 0) {
                out.println((n * 2) / k);
            } else {
                out.println((n * 2) / k + 1);
            }
        }
        out.flush();

    }
}