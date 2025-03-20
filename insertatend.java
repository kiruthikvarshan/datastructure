import java.util.Scanner;
public class insertatend
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++){
	        arr[i]=sc.nextInt();
	    }
		for(int i=0;i<size;i++){
	        System.out.println(arr[i]);    
	}
		System.out.println("enter a num to insert :");
		// size++;
		int insert=sc.nextInt();
		// for(int i=0; size<=0;i++){
		// 	int pos=size-1;
		int newarr[]=new int [size+1];
		for(int i=0;i<size;i++){
			newarr[i]=arr[i];
		}
		newarr[size]=insert;
		
	    for(int i=0;i<size+1;i++){
			System.out.println(newarr[i]);
		}
    }
}