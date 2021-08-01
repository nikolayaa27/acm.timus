package com.company.number_2001;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        int berry2weight = b1 - b2;
        int berry1weight = b3 - berry2weight - b2;

        out.println(berry1weight+" "+ berry2weight);

    }
}