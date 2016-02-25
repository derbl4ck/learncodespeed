public class selection_sort {

	/**
	 * Show how it works
	 * @param args
	 */
	public static void main(String[] args) {
		int Array[] = new int[]{6,40,70,55,2,9,54,34,22,78,65,245};
		 
		System.out.println("This is the Array Before Selection Sort");
		 
		for(int i=0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
			}
		
		// sort the array using selection sort algorithm
		selectionSort(Array);

		System.out.println("");
		System.out.println("Array After Selection Sort");
		
		for(int i=0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
	}
	
	
	/**
	 * Selection Sort Algorithm
	 * @param i array of integers
	 */
	private static void selectionSort(int[] i) {
		int l = i.length;
		int tmp = 0;
		
		for (int k = 0; k < l - 1; k++) {
			for (int j = k + 1; j < l; j++) {
				if (i[k] > i[j]) {
					tmp = i[k];
					i[k] = i[j];
					i[j] = tmp;
				}
			}
		}
	}
	
}
