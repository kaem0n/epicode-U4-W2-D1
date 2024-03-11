package ex1.entities;

public class IndexNotFoundException extends Exception {
    public IndexNotFoundException(int i) {
        super("Index not found. Only 0 to " + (i - 1) + " allowed.");
    }
}
