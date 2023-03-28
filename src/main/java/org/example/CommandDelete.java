package org.example;

import java.util.Scanner;

public class CommandDelete {
    private final Scanner sc;
    private int delteId;
    public CommandDelete(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.printf("Id to be deleted: ");
        this.delteId = this.sc.nextInt();
        this.sc.nextLine();

        if (new FamousSaying().exist(this.delteId)) {
            System.out.println(Ordinal.convert(this.delteId) + " famous saying has been deleted.");
        } else {
            System.out.println(Ordinal.convert(this.delteId) + " famous saying does not exit.");
        }

    }
}
