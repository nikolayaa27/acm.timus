package com.company.number_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int NumberOfTasks = in.nextInt();

        int Modulo = 12 - NumberOfTasks;

        int TimeModuloTasks = Modulo * 45;

        if (TimeModuloTasks < 240){
            System.out.println("YES");
        }
        else System.out.println("NO");

        System.out.flush();

    }
}