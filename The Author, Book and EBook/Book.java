public class Book {
    protected String title;
    protected int ISBN;
    protected Author author;

    public Book(String t, int i, Author a) {
        this.title = t;
        this.ISBN =  i;
        this.author = a;
    }
    
    public String getTitle() {
        return title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setISBN(int i) {
        this.ISBN = i;
    }
}