package AssesmentPractise;
import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while(n!=0){
            rev = 10*rev + n%10;
            n /= 10;
        }
        n = temp;
        if(n==rev){
            System.out.println("Pallindrome!");
        }else{
            System.out.println("Not Pallindrome!");
        }
    }
    
}
