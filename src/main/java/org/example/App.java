package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;
    private String command;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {

        while (true) {
            System.out.printf("Command: ");

            this.command  = this.sc.nextLine().trim().toLowerCase();

            if (command.equals("terminate")) {
                break;
            }
        }

    }
}