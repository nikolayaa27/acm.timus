package com.company.number_1264;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int NumberOfSearches = b + 1;
        out.println(a * NumberOfSearches);
        out.flush();
    }
}