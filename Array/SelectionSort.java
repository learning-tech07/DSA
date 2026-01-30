import java.util.Scanner;
import java.util.Arrays;

public class SelectionSort {
    //input array min = i if a[min]>a[j]   inner ke bahar outer ke andar -> min= j  temp i min temp
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i<n ; i++){
            int min = i ;
            for(int j = i+1 ; j<n ; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp ;
        } 
        for(int i : arr){
            System.out.print(i + " ");
        } 

    }
}
