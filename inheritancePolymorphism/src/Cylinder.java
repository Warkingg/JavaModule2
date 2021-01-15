public class Cylinder extends Circle {
    private double height = 2.0;
public Cylinder(){
}
public Cylinder(double radius,String color, double height){
    super(radius, color);
    this.height = height;
}

public  double getHeight(){
    return height;
}
public double setHeight(double height){
    return this.height = height;
}
public double getArea(double height, double radius){
    return height*radius*radius*Math.PI;
}

    @Override
    public String toString() {
        return "A Cylinder with height = "
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
