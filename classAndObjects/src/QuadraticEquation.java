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

        QuadraticEquation quadricEquation = new QuadraticEquation(a,b,c);
        if(quadricEquation.getDiscriminant()>0){
            System.out.println("Roots are :: "+ quadricEquation.getRoot1() +" and "+ quadricEquation.getRoot2());
        }else if(quadricEquation.getDiscriminant() == 0){
            System.out.println("Root is :: "+ quadricEquation.getRoot0());
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
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        return ((b*b) - (4*a*c));
    }
    public double getRoot0() {
        return (-b / (2 * a));
    }
    public double getRoot1(){
        return ((-b + Math.pow((b*b)-(4*a*c),0.5))/(2*a));
    }
    public double getRoot2(){
        return((-b - Math.pow((b*b)-(4*a*c),0.5))/(2*a));
    }
}
