package DSA;

public class BubbleSortA {

	public static void main(String[] args) {

		
		int[] array = {5, 1, 4, 2, 8};
        bubbleSortAscending(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
	}

	
	public static void bubbleSortAscending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
