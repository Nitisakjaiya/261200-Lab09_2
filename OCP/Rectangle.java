public class Rectangle extends Shape { 
    private double width;
    private double height;
    
    public Rectangle(double par, double par1) {
      this.width = par;
      this.height = par1;
    }

    
    @Override
    public double calculateArea() {
      return this.width * this.height;
    }
  }
  