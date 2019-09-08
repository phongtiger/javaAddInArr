import java.util.Scanner;

public class addInArr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=5;
        arr[3]=4;
        arr[4]=8;
        int[] arr1 = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        int X = scanner.nextInt();
        System.out.println("Enter Index");
        int index = scanner.nextInt();

        if (index <= 1 && index > arr.length - 1) {
            System.out.println("Not add X in Arr");
        } else {
            for (int i = 0; i < arr.length+1 ; i++) {
                if (i < index) {
                    arr1[i]= arr[i];
                } else if (i == index) {
                    arr1[i]= X;
                } else {
                    arr1[i] = arr[i-1];
                }
            }
        }
        for (int element : arr1) {
            System.out.println(element+"\n");
        }

    }

}



