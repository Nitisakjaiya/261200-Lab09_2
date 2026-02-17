public class Circle extends Shape { 
    private double radius;
    public Circle(int par) {
      this.radius = par;
    }
   
    @Override 
    public double calculateArea() {
      return Math.PI * this.radius * this.radius;
    }
  }
  