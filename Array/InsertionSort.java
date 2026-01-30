class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 1};
        int n = arr.length;
        //j is previous i is current
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
