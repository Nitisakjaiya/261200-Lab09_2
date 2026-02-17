public class Main {
    public static void main(String[] args) {
        
        AreaCalculator areaCalculator = new AreaCalculator();
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape ellipse = new Ellipse(6, 4);
        
        System.out.println("Rectangle Area: " + areaCalculator.calculateArea(rectangle));
        System.out.println("Circle Area: " + areaCalculator.calculateArea(circle));
        System.out.println("Ellipse Area: " + areaCalculator.calculateArea(ellipse));

        
    }
}