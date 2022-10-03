import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int temp = 0;
        int[] array;
        array = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        for (int i = 0; (array.length - 1)/2 > temp; i++ ){
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for  (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}