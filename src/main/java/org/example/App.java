package org.example;

import java.util.Scanner;

public class App {
    private final Scanner sc;
    private String command;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== Famous Saying Application ==");

        while (true) {
            System.out.printf("Command: ");

            this.command  = this.sc.nextLine().trim().toLowerCase();

            if (command.equals("terminate")) {
                break;
            } else if (command.equals("register")) {
                new CommandRegister(this.sc).run();
            } else if (command.equals("list")) {
                new CommandDisplay().run();
            } else if (command.equals("delete")) {
                new CommandDelete(this.sc).run();
            } else if (command.equals("modify")) {
                new CommandModify(this.sc).run();
            } else if (command.equals("reorder")) {
                new CommandReorder().run();
            } else {
                System.out.println("Please enter the valid command. (register, list, delete, reorder, terminate)");
            }
        }

        System.out.println("Application has been terminated.");
    }
}