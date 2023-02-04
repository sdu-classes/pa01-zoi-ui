public class prac1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
    }
}
class Circle {
    double radius;
    


    Circle(){}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius , 2);
    }
     public  double getCircumference(){
        return 2 * Math.PI + radius;
     }

    @Override
    public String toString() {
        return "Circle " +
                " radius= " + radius + '\'' +
                " area = " + getArea() +
                " Circumference = " + getCircumference();
    }
    
    
}
