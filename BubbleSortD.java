package DSA;

public class BubbleSortD {

	public static void main(String[] args) {

		
		int[] array = {5, 1, 4, 2, 8};
        bubbleSortDescending(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
	}

	
	  public static void bubbleSortDescending(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] < array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

}
