package circle;

public class Circle {
    private double radius = 1.0;
    private String color ="red";

    public Circle(){}

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public String getColor(){return color;}
    public String setColor(String color){return this.color = color;}
    public double getRadius(){return radius;}
    public double setRadius(double radius){return this.radius = radius;}
    public double getArea(){
        return (radius*radius*Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Area=" + getArea() +
                ", color='" + color + '\'' +
                '}';
    }
}

