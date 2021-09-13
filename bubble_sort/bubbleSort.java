package bubble_sort;

import java.util.Arrays;

public class bubbleSort {
	public static void main(String[] args) {
		// bubble sort is also know as sink sort or exchange sort
		BubbleSort(new int[] {1,2,3,4});
		// best case --> o(n)
		// worst case --> o(n^2)
	}

	public static void BubbleSort(int arr[]) {
		boolean is_swapped = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
					is_swapped = true;
				}
			}
			if (!is_swapped) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
