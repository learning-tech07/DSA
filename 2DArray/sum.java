import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //1 2 3
        //10 11 12
        //7 8 9

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][]=new int[m][n];
        int sum = 0;
        int rowSum = 0;
        int colSum = 0;
        int major = 0;
        int minor = 0;
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ;j++){
                sum+= arr[i][j];
            }
        }
         System.out.println(sum);
        for(int i = 0 ; i<m ; i++){
            rowSum=0;
            for(int j = 0 ; j<n ;j++){
                rowSum+= arr[i][j];
            }
            System.out.println("Row" + (i+1) +"sum = "+ rowSum);
        }
        for(int i = 0 ; i<m ; i++){
            colSum=0;
            for(int j = 0 ; j<n ;j++){
                colSum+= arr[j][i];
            }
            System.out.println("Col" + (i+1) +"sum = "+ colSum);
        }
        for(int i = 0 ; i<m ; i++){
            major=0;
            for(int j = 0 ; j<n ;j++){
                major+= arr[j][j];
            }
            System.out.println("major Sum = "+ major);
            break;        
        }
        for(int i = 0 ; i<m ; i++){
            for(int j = n-1 ; j>=0 ;j--){
                minor+= arr[i][j];
                i++;
            }
            System.out.println("minor Sum = "+ minor);
            break;                 
        }
        

    }
    
}
