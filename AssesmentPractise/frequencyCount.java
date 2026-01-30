package AssesmentPractise;

import java.util.HashMap;
import java.util.Scanner;

public class frequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int key: map.keySet()){
            System.out.println(key+"-"+map.get(key));
        }
    }
    
}
