package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		boolean notSort = true;
		while (notSort) {
			display.updateDisplay();
			boolean noIssue = true;
			for (int i = 0; i < arr.length; i++) {
				if(i != arr.length - 1) {
					if (arr[i] > arr[i + 1]) {
						int a = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = a;
						noIssue = false;
					}
				}
			}
			notSort = !noIssue;
		}
	}
	
}
