
public class Sort {

	private long time;
	private String name = "";
	protected static Sort[] array = new Sort[4];	
	
	public Sort(final long time, final String name) {
		this.time = time;
		this.name = name;
	}
	
	protected static void setTime(final int[] arr, Sort[] array) {
		long a = System.nanoTime();
		Sort.bubbleSort(arr);
		long b = System.nanoTime();
		array[0] = new Sort((b - a) / 1000, "BubbleSort");
				
		a = System.nanoTime();
		Sort.selectionSort(arr);
		b = System.nanoTime();
		array[1] = new Sort((b - a) / 1000, "SelectionSort");
		
		a = System.nanoTime();
		Sort.insertionSort(arr);
		b = System.nanoTime();
		array[2] = new Sort((b - a) / 1000, "InsertionSort");
		
		a = System.nanoTime();
		MySort.mySort(arr);
		b = System.nanoTime();
		array[3] = new Sort((b - a) / 1000, "MySort");
	}
	

	
	protected static void sortTimeSequence(Sort[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j].time <  array[j - 1].time) {
					objectSwap(array, j, j - 1);
				}
			}
		}
	}
	
	private static void objectSwap(Sort[] array, int i, int j) {
		Sort temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
	}
	
	protected static void printTimeSequence(Sort[] array) {
		for (int i = 0; i <= array.length -1; i++) {
			System.out.println(array[i].name + " takes " + array[i].time);
		}
	}
	
    protected static void swap(int arr[], int i, int j) {
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
    
    protected static void selectionSort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length ; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			swap(arr, i, index);
		}
    }
    
    protected static void insertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] <  arr[j - 1]) {
					swap(arr, j, j - 1);
				}
			}
		}
    }
    
//    protected static void mergeSort(int arr[]) {
//    	doMergeSort(arr, 0, arr.length - 1);
//    }
//    
//    protected static void doMergeSort(int[] arr, int lo, int hi) {
//    	
//    	if (lo < hi) {
//    		int mid = (lo + hi) / 2;
//    		doMergeSort(arr, lo, mid);
//    		doMergeSort(arr, mid + 1, hi);
//    		
//    		int size = hi - lo + 1;
//    		int[] temp = new int[size];
//    		
//    		merge(arr, temp, lo, mid, mid + 1, hi);
//    		
//    		for (int i =0; i < size; i++) {
//    			arr[i + lo] = temp[i];
//    		}
//    	}
//    }
//    
//    protected static void merge(int[] arr, int[] temp, int lo1, int hi1, int lo2, int hi2) {
//    	int i = 0;
//		while (lo1 <= hi1 && lo2 <= hi2) {
//	    	if (arr[lo1] < arr[lo2]) {
//	    		temp[i] = arr[lo1];
//	    		i++;
//	    		lo1++;
//	    	} else {
//	    		temp[i] = arr[lo2];
//	    		i++;
//	    		lo2++;
//	    	}
//		}
//		if (lo1 != hi1) {
//			while (lo1 <= hi1) {
//				temp[i] = arr[lo1];
//	    		i++;
//	    		lo1++;
//			}
//		} else if (lo2 != hi2) {
//			while (lo2 <= hi2) {
//	    		temp[i] = arr[lo2];
//	    		i++;
//	    		lo2++;
//			}
//		} else {
//			
//		}
//    }
}
