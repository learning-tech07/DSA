import java.util.ArrayList;
import java.util.Scanner;
class arraylist{
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print(list.indexOf(target));
    }

}



//binary search   1 low<=high   2 low+(high-low)/2     3 ifa[mid]==target   flag =1 index=i  break   else if(a[mid]<target) low+1

