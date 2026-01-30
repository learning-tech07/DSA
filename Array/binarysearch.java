import java.util.Scanner;

public class binarysearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int arr[]  =  new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        int index = -1;

        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(arr[mid]==target){
                index = mid ;
                break;
            }
            else if(arr[mid]< target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }           
        }
        if(index != -1){
            System.out.println("Element found at index :" + index );
        }else{
            System.out.println("Element found not found");
        }

        // int n=sc.nextInt();
        // int start=0;
        // int end=n-1;
        // int index=-1;
        // int target=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     if(arr[mid]==target){
        //         index=mid;
        //         break;
        //     }else if(arr[mid]<target){
        //         start=mid+1;
        //     }else{
        //         end=mid-1;
        //     }
        // }
        // if(index!=-1){
        //     System.out.println(index);
        // }else{
        //     System.out.println("Not Found");
        // }
    }
}