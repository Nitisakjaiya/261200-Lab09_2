public class Ellipse extends Shape {
    private double XAxis;
    private double YAxis;
    public Ellipse(int par, int par1) {
        this.XAxis = par;
        this.YAxis = par1;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * XAxis * YAxis;
    }
}