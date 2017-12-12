
public class Sort {
	
    private static void swap(int arr[], int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	
    protected static void bubbleSort(int arr[]) {
        int n = arr.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]) {
                    swap(arr, i, k);
                }
            }
        }
    }
    
    
    
    
}
