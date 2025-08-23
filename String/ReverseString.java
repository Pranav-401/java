// Reverse string without a stringbuilder
import java.util.Scanner;

// time complexity O(n2)
public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            char curr = str.charAt(i);
            reverse += curr;
        }

        System.out.println("Reversed string is: " + reverse);
    }
}