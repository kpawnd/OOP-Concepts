public class Main {
    public static void main(String[] args) {
        Book book = new Book("B001", "Java Programming", 50.0, "John Doe", "Programming");
        
        System.out.println(book);
        System.out.println("Category: " + book.getCategory());
        
        book.applyDiscount(20);
        System.out.println("After 20% discount: " + book);
    }
}