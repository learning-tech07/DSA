import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        //when data low amount , partiall sorted , number of swapping less  -- sabse bade element ko ane sahi position pe pahucha deta hai
        int arr[] = {5,4,3,2,1};
        int n = 5;
        for(int i = 0 ; i<n-1;i++){
            for(int j = 0 ; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    // int temp = arr[j];
                    // arr[j]= arr[j+1];
                    // arr[j+1]=temp;

                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }System.out.println(Arrays.toString(arr));
    }
}
