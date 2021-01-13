import java.util.Scanner;

public class addElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int[] newArr = new int[arr.length + 1];
        int index, x;
        System.out.print("Enter the position where you want to insert element:");
        index = input.nextInt();
        System.out.print("Enter the element you want to insert:");
        x = input.nextInt();
        for(int i = (arr.length-1); i >= index; i--)
        {
            newArr[i+1] = arr[i];
        }
        newArr[index-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < newArr.length; i++) {
            System.out.printf(newArr[i] + ",");
        }

    }
}
