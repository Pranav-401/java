import java.util.*;

public class Prime {

    static void isPrime(int num) {
        if( num <= 1){
            System.out.println(num + " is not prime");
            return;
        }

        for ( int i = 2; i < num; i++){
            if( num % i == 0){
                System.out.println(num + " is not prime");
                return;
            }
        }

        System.out.println(num + " is prime");
    }

    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = s1.nextInt();
        isPrime(num);
    }
}