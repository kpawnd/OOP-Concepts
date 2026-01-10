public class Main {
    public static void main(String[] args) {
        Author author = new Author("Arthur", "arthur@mail.com", 'm');
        Book myBook = new Book("Book", author, 15.99);

        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(myBook.getAuthor().getName());
        System.out.println(myBook.getName());
        System.out.println(myBook.getPrice());

        myBook.setQty(10);
        System.out.println(myBook.getQty());

    }
}