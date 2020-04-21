package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	// Bogo sort is a joke sorting algorithm. It is considered the most 
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.
	
	// It works by following these steps:
	// STEP 1. Is the array in order?
	//	if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.
	
	//1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		
		boolean sorted = false;
		
		while(!sorted) {
			display.updateDisplay();
		boolean z = true;
		
		for (int i = 0; i < arr.length; i++) {
			if(i != arr.length - 1) {
				if (arr[i] > arr[i + 1]) {
					sorted = false;
					z = false;
				}
			}
		}
		sorted = z;
		if (!sorted) {
			Random randy = new Random();
			int a = randy.nextInt(arr.length);
			int b = randy.nextInt(arr.length);
			int c = arr[a];
			arr[a] = arr[b];
			arr[b] = c;
		}
		}
	}
}
