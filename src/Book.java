public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public static void main(String[] args) {
        Book b = new Book("Un titre de lire");
        System.out.println("Le titre du livre est " + b.getTitle());
        b.setTitle("Un autre titre de livre");
        System.out.println("Le titre du livre est " + b.getTitle());
    }

}
