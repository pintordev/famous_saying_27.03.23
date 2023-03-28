package org.example;

public class CommandDisplay {
    public void run() {
        if (new FamousSaying().getSize() > 0) {
            System.out.println("Id / Author / Famous Saying");
            System.out.println("----------------------------");

            for (int i = new FamousSaying().getSize() - 1; i >= 0 ; i--) {
                String[] list = new FamousSaying().getList(i);
                System.out.println(list[0] + " / " + list[1] + " / " + list[2]);
            }
        } else {
            System.out.println("There is no list in this application.");
        }
    }
}
