package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Famous saying application ==");

        Scanner sc = new Scanner(System.in);

        new App(sc).run();

        sc.close();

        System.out.println("Application has terminated.");
    }
}