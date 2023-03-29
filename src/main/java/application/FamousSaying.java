package application;

public class FamousSaying {
    private int order;
    private String author;
    private String famousSaying;

    FamousSaying(int order, String author, String famousSaying) {
        this.order = order;
        this.author = author;
        this.famousSaying = famousSaying;
    }

    public int getOrder() {
        return this.order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getFamousSaying() {
        return this.famousSaying;
    }
}
