
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
    
    protected static void mergeSort(int arr[]) {
    	
    }
    
//    public void sort(int inputArr[]) {
//        this.array = inputArr;
//        this.length = inputArr.length;
//        this.tempMergArr = new int[length];
//        doMergeSort(0, length - 1);
//    }
// 
//    private void doMergeSort(int lowerIndex, int higherIndex) {
//         
//        if (lowerIndex < higherIndex) {
//            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
//            // Below step sorts the left side of the array
//            doMergeSort(lowerIndex, middle);
//            // Below step sorts the right side of the array
//            doMergeSort(middle + 1, higherIndex);
//            // Now merge both sides
//            mergeParts(lowerIndex, middle, higherIndex);
//        }
//    }
// 
//    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
// 
//        for (int i = lowerIndex; i <= higherIndex; i++) {
//            tempMergArr[i] = array[i];
//        }
//        int i = lowerIndex;
//        int j = middle + 1;
//        int k = lowerIndex;
//        while (i <= middle && j <= higherIndex) {
//            if (tempMergArr[i] <= tempMergArr[j]) {
//                array[k] = tempMergArr[i];
//                i++;
//            } else {
//                array[k] = tempMergArr[j];
//                j++;
//            }
//            k++;
//        }
//        while (i <= middle) {
//            array[k] = tempMergArr[i];
//            k++;
//            i++;
//        }
// 
//    }
}
