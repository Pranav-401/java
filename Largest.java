import java.util.*;

class Largest{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println();
		for(int i=0; i<size;i++){
			System.out.print("Enter the Element in array : ");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int index = size;
		int n = size-1;
		int s = size-2;
		
		System.out.println("Largest Number in Arrays is : " + arr[n]);
		System.out.println("Second Largest Number in Arrays is : " + arr[2]);

	}
}