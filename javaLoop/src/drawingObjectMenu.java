import java.util.Scanner;

public class drawingObjectMenu {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        while(true) {
            choice = input.nextInt();
        switch (choice) {
            case 1:
                for (int i = 1; i <= 3; i++) {
                    System.out.print("\n");
                    for (int j = 1; j <= 7; j++) {
                        System.out.print("* ");
                    }
                }
                break;
            case 2:
                for(int i=1; i<=5; i++) {
                    System.out.print("\n");
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                }
                for(int i=5;i>=1;i--) {
                    System.out.println();
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                for(int i=1; i<=5; i++) {
                    System.out.println();
                    for (int j = 1; j <= 5; j++) {
                        if( j < i){
                            System.out.print(" ");
                        }else {
                            System.out.print("* ");
                        }
                    }
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
            }
        }
    }
}
