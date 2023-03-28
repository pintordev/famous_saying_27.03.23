package org.example;

import java.util.ArrayList;

public class FamousSaying {
    private static ArrayList<String[]> famousSayingList = new ArrayList<>();
    // 목록 저장 기능
    // order 입력이 있으면 inline set
    // order 가 존재하는 지 판단 필요...
    // 있다면 덮어쓰기.. 삭제..
    // order 입력이 없으면 arraylist reset
    public void setList(int order, String author, String famousSaying) {
        String[] list = {"" + order, author, famousSaying};
        this.famousSayingList.add(order - 1, list);
    }
    public String[] getList(int index) {
        return this.famousSayingList.get(index);
    }
    public void modifyList(int order, String author, String famousSaying) {
        // order 가 존재하는 index를 받아와서
        // 해당 index의 arraylist 변경
        // this.famousSayingList.
    }
    public void deleteList(int order) {
        // order 가 존재하는 index를 받아와서
        // 해당 index의 arraylist 삭제
    }
    public int getSize() {
        return this.famousSayingList.size();
    }
//    public int getIndex(int order) {
//        for (String[] list : this.famousSayingList) {
//            if (list[0].equals(order + "")) {
//                return true;
//            }
//        }
//    }
    public boolean exist(int order) {
        for (String[] list : this.famousSayingList) {
            if (list[0].equals(order + "")) {
                return true;
            }
        }
        return false;
    }
}
