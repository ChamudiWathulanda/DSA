package DSA;

public class InsertionSortD {

	public static void main(String[] args) {

		
		int[] array = {5, 1, 4, 2, 8};
        insertionSortDescending(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
	}

	public static void insertionSortDescending(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
