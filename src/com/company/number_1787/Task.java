package com.company.number_1787;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        while (in.hasNext()) {
            a.add(in.nextInt());
        }
        int ModuleAutoInProbe = 0;

        for(int i = 0; i < n; i ++){

            ModuleAutoInProbe = ModuleAutoInProbe + a.get(i) - k;

            if (ModuleAutoInProbe<0) {
                ModuleAutoInProbe = 0;
            }
        }

        out.println(ModuleAutoInProbe);
        out.flush();

    }

}