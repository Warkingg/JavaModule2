import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ::");
        double a = sc.nextDouble();

        System.out.println("Enter the value of b ::");
        double b = sc.nextDouble();

        System.out.println("Enter the value of c ::");
        double c = sc.nextDouble();

        QuadraticEquation quadraicEquation = new QuadraticEquation(a,b,c);
        if(quadraicEquation.getDiscriminant()>0){
            System.out.println("Roots are :: "+ quadraicEquation.getRoot1() +" and "+ quadraicEquation.getRoot2());
        }else if(quadraicEquation.getDiscriminant() == 0){
            System.out.println("Root is :: "+ quadraicEquation.getRoot0());
        }else{
            System.out.println("The equation has no root");
        }
    }
       private double a,b,c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(double a){
        return a;
    }
    public double getB(double b){
        return b;
    }
    public double getC(double c){
        return c;
    }
    public double getDiscriminant(){
        return ((this.b*this.b) - (4*this.a*this.c));
    }
    public double getRoot0() {
        return (-this.b / (2 * this.a));
    }
    public double getRoot1(){
        return ((-b + Math.pow((this.b*this.b)-(4*this.a*this.c),0.5))/(2*this.a));
    }
    public double getRoot2(){
        return((-this.b - Math.pow((this.b*this.b)-(4*this.a*this.c),0.5))/(2*this.a));
    }
}
