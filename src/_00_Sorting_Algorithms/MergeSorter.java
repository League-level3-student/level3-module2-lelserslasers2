package _00_Sorting_Algorithms;

public class MergeSorter extends Sorter {
	public MergeSorter() {
		type = "Merge";
	}
	
	//0. Since this sorting algorithm uses recursion, 
	//   we'll make a helper method called mergeSort.
	//   Complete the steps in the mergeSort method.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] arr, SortingVisualizer display) {
		//20. call the mergeSort method with 0 and the length of the array minus one
		mergeSort(arr, 0, arr.length - 1, display);
	}
	
	private void mergeSort(int[] arr, int low, int high, SortingVisualizer display) {
		display.updateDisplay();
		//1. Create a temporary integer array that is the same length as the passed in array.
		int[] arr2 = new int[arr.length];
		//2. make an if statement that checks if low is less than high
		//   and put the rest of the method inside of it
		if (low < high) {
			//3. Create an integer called middle and set it 
			//   equal to the half way point between low and high
			int middle = (low + high) / 2;
            //4. call the mergeSort method with low and middle
           mergeSort(arr, low, middle, display);
            //5. call the mergeSort method with middle + 1 and high
           mergeSort(arr, middle + 1, high, display);
            //6. copy the elements from the array into the temporary array,
            //   but only the elements from low to high inclusive
            for (int i = low; i <= high; i++) {
				arr2[i] = arr[i];
			}
            //7. create three integers called i, j, and k and
            //   set them equal to low, middle + 1, and low respectively
            int i = low;
            int j = middle + 1;
            int k = low;
            //8. while i is less than or equal to middle
            //   and j is less than or equal to high
            while (i <= middle && j <= high) {
            	display.updateDisplay();
            	//display.updateDisplay();
            	//9. if temp array at i is less than or equal 
            	//   to temp array at j	
                if (arr2[i] <= arr2[j]) {
                    //10. set array at k equal to temp array at i
                    arr[k] = arr2[i];
                    //11. increase i by 1
                    i = i  + 1;
                }
                //13. else
                else {
            
                    //14. set array at k equal to temp array at j
                   arr[k] = arr2[j];
                    //15. increase j by 1
                   j = j + 1;
                }
                //16. increase k by 1
                k = k + 1;
                
            }
            //17. make a while loop that runs while i is less than or equal to middle
            while (i <= middle) {
            	//18. set array at k equal to temp array at i
                arr[k] = arr2[i];
                //19. increase k and i by 1
                k = k + 1;
                i = i + 1;
            }
               
            
		}
	}

}
