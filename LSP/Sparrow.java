package LSP;

public class Sparrow implements Flyable {
  @Override
  public void move() {
    System.out.println("Sparrow moving...");
  }
  @Override
  public void fly() { 
    System.out.println("Sparrow flying...");
  }
}