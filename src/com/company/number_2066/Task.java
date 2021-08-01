package com.company.number_2066;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int otvet;

        otvet = (c + b) * -a;
        System.out.println(otvet);
//        out.println(otvet);

    }
}

// Не зачтено