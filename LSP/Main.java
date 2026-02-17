package LSP;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        eagle.move();
        eagle.fly();

        Sparrow sparrow = new Sparrow();
        sparrow.move();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.move();
    }
}