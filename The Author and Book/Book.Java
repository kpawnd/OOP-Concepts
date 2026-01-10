public class Book {
    private String name;
    private double price;
    private int qty = 0;

    private Author author;

    public Book(String n, Author a, double p) {
        this.name = n;
        this.author = a;
        this.price = p;
    }

    public Book(String n, Author a, double p, int q) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = q;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setQty(int q) {
        this.qty = q;
    }
}