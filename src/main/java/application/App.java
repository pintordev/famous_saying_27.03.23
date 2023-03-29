package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;
    private String command;
    private int order = 1;
    private String author;
    private String famousSaying;
    private List<FamousSaying> famousSayingList = new ArrayList<>();

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== Famous Saying Application ==");
        System.out.println("1. register");
        System.out.println("2. list");
        System.out.println("3. delete");
        System.out.println("4. modify");
        System.out.println("5. terminate");

        while (true) {
            System.out.println("----------------------------");
            System.out.printf("Command: ");

            this.command = this.sc.nextLine().trim().toLowerCase();

            if (this.command.equals("terminate")) { // 종료 명령
                break;
            } else if (this.command.equals("register")) { // 등록 명령
                System.out.println("----------------------------");
                System.out.printf("Famous Saying: ");
                this.famousSaying = this.sc.nextLine().trim();

                System.out.printf("Author: ");
                this.author = this.sc.nextLine().trim();

                this.famousSayingList.add(new FamousSaying(this.order, this.author, this.famousSaying));

                System.out.println(Ordinal.convert(this.order++) + " famous saying has been registered.");

            } else if (this.command.equals("list")) { // 목록 명령

                if (this.famousSayingList.size() > 0) {

                    System.out.println("Id / Author / Famous Saying");
                    System.out.println("----------------------------");

                    for (int i = this.famousSayingList.size() - 1; i >= 0; i--) {
                        FamousSaying famousSayingI = this.famousSayingList.get(i);
                        System.out.printf("%d / %s / %s\n", famousSayingI.getOrder(), famousSayingI.getAuthor(), famousSayingI.getFamousSaying());
                    }

                } else {
                    System.out.println("There is no list in this application.");
                }
            } else if (this.command.equals("delete")) { // 삭제 명령
                System.out.println("----------------------------");
                System.out.printf("Id to be deleted: ");

                int deleteId = this.sc.nextInt();
                this.sc.nextLine();
                int deleteIndex = -1;

                for (int i = 0; i < this.famousSayingList.size(); i++) {
                    if (this.famousSayingList.get(i).getOrder() == deleteId) {
                        deleteIndex = i;
                    }
                }

                try {
                    this.famousSayingList.remove(deleteIndex);
                    System.out.printf("%s famous saying has been deleted.\n", Ordinal.convert(deleteId));

                } catch (IndexOutOfBoundsException e) {
                    System.out.printf("%s famous saying does not exist.\n", Ordinal.convert(deleteId));
                }

            } else if (this.command.equals("modify")) { // 수정 명령
                System.out.println("----------------------------");
                System.out.printf("Id to be modified: ");

                int modifyId = this.sc.nextInt();
                this.sc.nextLine();
                int modifyIndex = -1;

                for (int i = 0; i < this.famousSayingList.size(); i++) {
                    if (this.famousSayingList.get(i).getOrder() == modifyId) {
                        modifyIndex = i;
                    }
                }

                try {
                    System.out.printf("Famous Saying(present): %s\n", this.famousSayingList.get(modifyIndex).getFamousSaying());
                    System.out.printf("Famous Saying(new): ");
                    this.famousSaying = this.sc.nextLine().trim();

                    System.out.printf("Author(present): %s\n", this.famousSayingList.get(modifyIndex).getAuthor());
                    System.out.printf("Author(new): ");
                    this.author = this.sc.nextLine().trim();

                    this.famousSayingList.set(modifyIndex, new FamousSaying(modifyId, this.author, this.famousSaying));
                    System.out.printf("%s famous saying has been modified.\n", Ordinal.convert(modifyId));

                } catch (IndexOutOfBoundsException e) {
                    System.out.printf("%s famous saying does not exist.\n", Ordinal.convert(modifyId));
                }

            } else if (this.command.equals("help")) { // 도움말 명령
                System.out.println("----------------------------");
                System.out.println("1. register");
                System.out.println("2. list");
                System.out.println("3. delete");
                System.out.println("4. modify");
                System.out.println("5. terminate");
            } else {
                System.out.println("Please enter the valid command. If you want to know commands, then enter the command \"help\".");
            }
        }

        System.out.println("Application has been terminated.");
    }
}