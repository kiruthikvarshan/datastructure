import java.util.Scanner;
public class deleteatposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println( " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(" delete: ");
        int pos = sc.nextInt();
        if (pos < 1 || pos > size) {
            System.out.println("out of position!");
        } else {
            int newArr[] = new int[size - 1];
            for (int i = 0, j = 0; i < size; i++) {
                if (i == pos - 1) {
                    continue; 
                }
                newArr[j++] = arr[i];
            }
            for (int k : newArr) {
                System.out.print(k+ " ");
            }
        }

    }
}
