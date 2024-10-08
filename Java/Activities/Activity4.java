package activities;

public class Activity4 {

	
	 public static void printArray(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n; ++i) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	 
	 
	
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            
           
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            array[j + 1] = key;
        }
    }
    
  		    public static void main(String[] args) {
		        int[] array = {12, 11, 13, 5, 6};
		        
		        System.out.println("Unsorted array:");
		        printArray(array);
		        
		        insertionSort(array);
		        
		        System.out.println("Sorted array:");
		        printArray(array);
		    }

	}

