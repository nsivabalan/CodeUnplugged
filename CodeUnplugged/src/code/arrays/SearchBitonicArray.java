package code.arrays;


/**
 * Search in a bitonic array. An array is bitonic if it is comprised of an
 * increasing sequence of integers followed immediately by a decreasing sequence
 * of integers. Write a program that, given a bitonic array of N distinct
 * integer values, determines whether a given integer is in the array.
 *
 * Standard version: Use ~3lgN compares in the worst case. Optimal version: Use
 * ~2lgN compares in the worst case (and prove that no algorithm can guarantee
 * to perform fewer than ~2lgN compares in the worst case).
 */


public class SearchBitonicArray {

	public static int searchInBitonicArray(int[] array, int value) {
		if (array == null) {
			return -1;
		}

		return searchInBitonicArray(array, value, 0, array.length - 1);
	}

	private static int searchInBitonicArray(int[] array, int value,
			int startIndex, int endIndex) {
		int size = endIndex - startIndex +1 ;
		if(size == 0) return -1;

		if(size == 1){
			if(array[startIndex] == value) return startIndex;
			else return -1;
		}

		if(size == 2){
			if(array[startIndex] == value)return startIndex;
			else if(array[endIndex] == value) return endIndex; 
			else return -1;
		}

		int midIndex = (endIndex - startIndex)/2 + startIndex;

		if(array[midIndex] == value) return midIndex;

		if(array[midIndex] < array[startIndex])
		{
			if(array[midIndex] > value)
				return searchInBitonicArray(array, value, midIndex+1, endIndex);
			else{
				return searchInBitonicArray(array, value, startIndex, midIndex-1);
			}
		}
		else{
			int found = searchInBitonicArray(array, value, startIndex, midIndex-1);
			if(found == -1){
				int ret = searchInBitonicArray(array, value, midIndex +1 , endIndex);
				//System.out.println(" Ret val "+ret);
				return ret;
			}
			else
				return found;

		}
	}

}
