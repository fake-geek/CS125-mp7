
public class comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] arr = create(10000);
		if (checkMySort(arr) == false) {
			System.out.print("Check your algorithm!");
		} else {
			Sort.setTime(arr, Sort.array);
			Sort.sortTimeSequence(Sort.array);
			Sort.printTimeSequence(Sort.array);
		}
	}
	
	private static boolean checkMySort(final int[] arr) {
		MySort.mySort(arr);
		for (int i = 0; i <= arr.length - 2; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	private static int[] create(final int len) {
		if (len >= 0) {
			int[] arr = new int[len];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random()*100000000);
			}
			checkOrder(arr);
			return arr;
		}
		return null;
	}
	
	private static int[] checkOrder(final int[] arr) {
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1 ; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = (int) (Math.random()*100000000);
					checkOrder(arr);
				}
			}
		}
		return arr;
	}
	
}
