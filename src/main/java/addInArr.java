import java.util.Scanner;

public class addInArr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=5;
        arr[3]=4;
        arr[4]=8;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        int X = scanner.nextInt();
        System.out.println("Enter Index");
        int index = scanner.nextInt();

        if (index <= 1 && index > arr.length - 1) {
            System.out.println("Not add X in Arr");
        } else {
            for (int i = index - 1; i < arr.length - 1; i++) {

                arr[i + 1] = arr[i];
            }
        }

    }

}



