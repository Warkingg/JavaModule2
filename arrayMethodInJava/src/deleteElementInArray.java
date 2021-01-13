import java.util.Scanner;

public class deleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int[] newArr = null;
        System.out.print("Enter Element to be deleted : ");
        int x = input.nextInt();
        for(int i = 0; i < arr.length; i++){
        if(arr[i] == x){
                newArr = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }
                break;
            }
        }
            System.out.println("The new array after " + x + " was deleted :");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(" " + newArr[i]);
            }
    }
}
