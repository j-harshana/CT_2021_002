package Q_03_in_lecture;

public class Circle {
    private double radius;

    //parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //getter method
    public double getRadius() {
        return radius;
    }

    //setter method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //method to compute and return the area
    public double computeArea(){
        double area = (Math.PI * radius * radius);
        return area;
    }

    //method to compute and return  the circumference
    public double computeCircumference(){
        double circumference = (2 * Math.PI * radius);
        return circumference;
    }
}
