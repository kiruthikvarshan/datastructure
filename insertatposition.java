import java.util.Scanner;
public class insertatposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println( " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        System.out.print("element to insert: ");
        int element = sc.nextInt();
        if (pos < 1 || pos > size + 1) {
            System.out.println("out of position");
        }
        int newarr[] = new int[size + 1];
        for (int i=0,j= 0;i<newarr.length; i++) {
            if (i==pos-1) {
                newarr[i] = element;  
            } else {
                newarr[i] = arr[j];  
                j++;
            }
        }
        for (int num : newarr) {
            System.out.print(num + " ");
        }

    }
}
