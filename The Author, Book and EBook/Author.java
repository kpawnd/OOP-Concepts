public class Author {
    protected String name;
    protected int contacts;

    public Author(String n, int c) {
        this.name = n;
        this.contacts = c;
    }

    public String getName() {
        return name;
    }

    public int getContact() {
        return contacts;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setContact(int c) {
        this.contacts = c;
    }
}