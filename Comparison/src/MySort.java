
public class MySort extends Sort{

	public MySort(long time, String name) {
		super(time, name);
		// TODO Auto-generated constructor stub
	}
	
	public static void mySort(int[] arr) {
        int n = arr.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (arr[i] > arr[k]) {
                    Sort.swap(arr, i, k);
                }
            }
        }
	}
}
