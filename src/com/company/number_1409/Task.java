package com.company.number_1409;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int NumberOfCans = a + b - 1;
        int Harry = NumberOfCans - a;
        int Larry = NumberOfCans - b;

        out.println(Harry + " " + Larry);

        out.flush();

    }

}