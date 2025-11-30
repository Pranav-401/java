import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Using StringBuilder for easy reversal
        String reversed = new StringBuilder(str).reverse().toString();
        
        System.out.println("Reversed String: " + reversed);
        // System.out.println("type of: " + reversed.getClass().getSimpleName());
    }
}

function(num){
    count =1;
    for(i=3; i<num; i++){
        flag=1;
        for(j=2; j<i; j++){
            if(i%j == 0){
                flag=0;
                break;
            }
        }

        if(flag==1){
            count++;
        }
    }
}
