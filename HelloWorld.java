
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {3, 102,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1, 42, 12, 12,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,11, 4, 34, 76};
		int n = array.length;
		int count = 0;
		for (int i=1; i<n; i++) {
			int key = array[i];
			int j = i-1;
			while (j>=0 && array[j]>key) {
				array[j+1] = array[j];
				j=j-1;
				count++;
			}
			array[j+1]=key;	
		}
		System.out.print("Sorted: ");
		printArray(array);
		System.out.println("Count: " + count);
	}
	
	public static void printArray(int[] array) {
		for (int element: array) {
			System.out.print(element + " ");
		}
	}

}
