import java.util.*;

class GCD{
	public static int[] Swap(int num1,int num2){
		int[] value = new int[2];
		if(num1<num2){
			int a = num2;
			int b = num1;
			value[0]=a;
			value[1]=b;
		}else{
			int a = num1;
			int b = num2;
			value[0]=a;
			value[1]=b;	
		}
		return value;
	}
	
	public static int GCD(int a ,int  b){
		while(b!=0){
			int temp = b;
			b=a%b;
			a = temp;
		}
			return a;
			
	}
		
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Frist Number : ");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter the Second Number : ");
		int num2 = sc.nextInt();
		int[] Swap = Swap(num1,num2);
		int a = Swap[0];
		int b = Swap[1];
		
		int result = GCD(a,b);
		System.out.println("GCD of " + num1 + " and " + num2 + " is " + result);
	}
}