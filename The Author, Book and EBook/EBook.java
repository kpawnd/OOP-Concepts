public class EBook extends Book {
    protected String URL;

    public EBook(String t, int i, Author a, String u) {
        super(t, i, a);
        this.URL = u;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String u) {
        this.URL = u;
    }

    @Override
    public String toString() {
        return "EBook[title=" + title + ", ISBN=" + ISBN + 
               ", author=" + author.getName() + ", URL=" + URL + "]";
    }
}