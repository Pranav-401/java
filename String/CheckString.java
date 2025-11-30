// Check if a string is a subsequence of a given string.
// subsequence --> A string that appear in order in the main string ( not necessarily consecutive )
import java.util.Scanner;

class CheckString{

    static boolean substring(String s1, String s2){
        int j=0;
        for(int k=0; k<s1.length();k++){
            if(j < s2.length()){
                if(s1.charAt(k) == s2.charAt(j)){
                    j++;
                } 
            } else {
                return true;
            }
        }
        return false;
    }

    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter a subsequence string s2: ");
        String s2 = sc.nextLine();

        boolean result = substring(s1,s2);

        if(result){
            System.out.println("s2 is substring of s1");
        } else {
            System.out.println("s2 is not substring of s1");
        }
    }
}

// *********** using recursion *****************
// static boolean isSubsequence(String small, String large){
//     if(small.isEmpty()){
//         return true;
//     } else if(large.isEmpty()){
//         return false;
//     }

//     if(small.charAt(0) != large.charAt(0)){
//         return isSubsequence(small, large.substring(1));
//     } else {
//         return isSubsequence(small.substring(1), large.substring(1));
//     }
// }

// *********** Using contains Function **************
// public class SubstringCheck {
//     public static void main(String[] args) {
//         String mainString = "Hello, welcome to Java!";
//         String subString = "welcome";

//         if (mainString.contains(subString)) {
//             System.out.println(subString + " is a substring of " + mainString);
//         } else {
//             System.out.println(subString + " is NOT a substring of " + mainString);
//         }
//     }
// }
