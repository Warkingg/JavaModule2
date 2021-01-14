package accessModifierTest;
public class Circle {
        private double radius = 1.0;
        private String color = "red";

        Circle() {
        }

        Circle(double radius) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return this.radius;
        }
        public double getArea() {
            return (this.radius*this.radius*3.14);
        }
        void Display(){
            System.out.println("Area of Circle is " + getArea());
        }
    }
