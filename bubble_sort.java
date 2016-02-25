public class bubble_sort {
	
	/**
	 * Show how it works
	 * @param args
	 */
	public static void main(String[] args) {
		 int Array[] = new int[]{6,40,70,55,2,9,54,34,22,78,65,245};
		 
		 System.out.println("This is the Array Before Bubble Sort");
		 
         for(int i=0; i < Array.length; i++){
        	 System.out.print(Array[i] + " ");
         }
        
         // sort the array using bubble sort algorithm
         bubbleSort(Array);
        
         System.out.println("");
         System.out.println("Array After Bubble Sort");
         for(int i=0; i < Array.length; i++){
        	 System.out.print(Array[i] + " ");
         }
	}
	
	
	/**
	 * Bubble Sort Algorithm
	 * @param i array of integers
	 */
	private static void bubbleSort(int[] i) {
		int l = i.length;
		int tmp = 0;
		
		for(int k = 0; k < l; k++) {
			for(int j = 1; j < (l-k); j++) {
				if(i[j-1] > i[j]) {
					tmp = i[j-1];
					i[j-1] = i[j];
					i[j] = tmp;
				}
			}
		}
	}
}
