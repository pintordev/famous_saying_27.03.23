package org.example;

import java.util.Scanner;

public class CommandRegister {
    private Scanner sc;
    private String famousSaying = "";
    private String author = "";
    private static int order;

    public CommandRegister(Scanner sc) {
        this.sc = sc;
        if (this.order == 0) {
            this.order = 1;
        }
    }
    public CommandRegister() {

    }

    public void run() {
        System.out.printf("Famous Saying: ");
        this.famousSaying = this.sc.nextLine().trim();

        System.out.printf("Author: ");
        this.author = this.sc.nextLine().trim();

        new FamousSaying().setList(this.order, this.author, this.famousSaying);
        System.out.println(Ordinal.convert(this.order++) + " famous saying has been registered.");
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
