package org.example;

public class CommandReorder {
    public void run() {
        // List 에 명령어를 보내서 순서를 다시 부여한다.
        // List 에 명령어를 보내서 현재 size를 받고 이를 order number로 보내준다.
        new CommandRegister().setOrder(new FamousSaying().getSize() + 1);
        System.out.println("List has been reordered.");
    }
}