public class Book extends Product implements Discountable{
    private String author, genre, name;

    public Book(String productCode, String name, double price, String author, String genre) {
        super(productCode, name, price);
        this.author = author;
        this.genre = genre;
    }

    @Override
    public String getCategory() {
        return "Book";
    }

    @Override
    public void applyDiscount(double percentage) {
        price = price - price * (percentage / 100);
    }

    @Override
    public String toString() {
         return "Book[name=" + name + ", price=" + price + 
               ", author=" + author + ", genre=" + genre + "]";
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public void setGenre(String g) {
        this.genre = g;
    }
}