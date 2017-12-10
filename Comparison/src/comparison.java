
public class comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = create(200);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	private static int[] create(final int len){
		if (len >= 0) {
			int[] arr = new int[len];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random()*1000000);
			}
			checkOrder(arr);
			return arr;
		}
		return null;
	}
	
	private static int[] checkOrder(final int[] arr){
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1 ; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = (int) (Math.random()*1000000);
					checkOrder(arr);
				}
			}
		}
		return arr;
	}
}
