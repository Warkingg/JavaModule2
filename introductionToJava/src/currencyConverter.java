import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amout of money (USD): ");
        usd = sc.nextDouble();
        double exchange= usd * 23000;
        System.out.print("Giá trị VND: " + exchange);
    }
}
