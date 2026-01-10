public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", 12345678);
        
        Book book1 = new Book("Harry Potter", 123456789, author1);
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Book ISBN: " + book1.getISBN());
        System.out.println("Book Author: " + author1.getName());
        System.out.println("Author Contact: " + author1.getContact());
        System.out.println();
        
        // Create an EBook
        Author author2 = new Author("Robert Martin", 87654321);
        EBook ebook1 = new EBook("Clean Code", 987654321, author2, "https://cleancode.com");
        System.out.println(ebook1.toString());
        System.out.println("EBook URL: " + ebook1.getURL());
        System.out.println();
        
        // Test setters
        ebook1.setTitle("Clean Code: Updated Edition");
        ebook1.setURL("https://cleancode.com/updated");
        System.out.println("After updates:");
        System.out.println(ebook1.toString());
    }
}