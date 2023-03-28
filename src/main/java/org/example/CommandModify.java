package org.example;

import java.util.Scanner;

public class CommandModify {

    private final Scanner sc;
    private int modifyId;
    public CommandModify(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.printf("Id to be modified: ");
        this.modifyId = this.sc.nextInt();
        this.sc.nextLine();

        if (new FamousSaying().exist(this.modifyId)) {
            // 해당 id
            System.out.println(Ordinal.convert(this.modifyId) + " famous saying has been modified.");
        } else {
            System.out.println(Ordinal.convert(this.modifyId) + " famous saying does not exit.");
        }


    }
}
