import java.util.Scanner;
public class insertatbegin
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
		// System.out.println("enter a insert num:");
		// // size++;
		// int insert=sc.nextInt();
		// // for(int i=0; size<=0;i++){
		// // 	int pos=size-1;
		// int newarr[]=new int [size+1];
		// for(int i=0;i<size;i++){
		// 	newarr[i]=arr[i];
		// }
		// newarr[size]=insert;
		
	    // for(int i=0;i<size+1;i++){
		// 	System.out.println(newarr[i]);
		// }
		System.out.println("insertatbegining");	
		int insbegin=sc.nextInt();
		int newarr[]=new int[size+1]; 
		for(int i=0;i<size;i++){
			newarr[i+1]=arr[i];
		}
		newarr[0]=insbegin;
		for(int i=0;i<size+1;i++){
			System.out.print(newarr[i]+" ");
		}
}
}