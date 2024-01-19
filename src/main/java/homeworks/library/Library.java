package homeworks.library;

public class Library {
    public static void main(String[] args) {
        Author eminescu = new Author("Mihai Eminescu", "eminescu@mihai.com");
        Book somnoroasePasarele = new Book("Somnoroase Pasarele", 1884, eminescu, 34.34);
        System.out.println("Book " + somnoroasePasarele.getName() + " " + somnoroasePasarele.getPrice() + " RON, by " + eminescu.getName() + " published in " + somnoroasePasarele.getYear() + ".");
    }
}
