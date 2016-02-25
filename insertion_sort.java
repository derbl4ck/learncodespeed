public class insertion_sort {

	/**
	 * Show how it works
	 * @param args
	 */
	public static void main(String[] args) {
		int Array[] = new int[]{6,40,70,55,2,9,54,34,22,78,65,245};
		 
		System.out.println("This is the Array Before Bubble Sort");
		 
		for(int i=0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
        	}
		
		// sort the array using insertion sort algorithm
		insertionSort(Array);

		System.out.println("");
		System.out.println("Array After Bubble Sort");
		
		for(int i=0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
	}

	/**
	 * Insertion Sort Algorithm
	 * @param i array of integers
	 */
	public static void insertionSort(int[] i) {
		int l = i.length;
		int tmp;
		
		for (int k = 1; k < l; k++) {
			tmp = i[k];
			int j = k;
			while (j > 0 && i[j-1] > tmp) {
				i[j] = i[j-1];
				j--;
			}
			i[j] = tmp;
		}
	}
	
}
