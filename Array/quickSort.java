public class quickSort {
    public static void main(String[] args) {
        int arr[]={5,4,1,9,8,6,7,3,2};
        int n = arr.length;
        int pi = arr[n-1];
        int j =0;
        void swap(int arr[],int i,int j)
        {
            int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
        }
        for(int i =0 ; i<n ; i++){
            if(arr[i]<=pi){
                
                j++;
            }
        }
        QuickSort(int arr[],int pivot,int start,int end)
        for(int i =0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
