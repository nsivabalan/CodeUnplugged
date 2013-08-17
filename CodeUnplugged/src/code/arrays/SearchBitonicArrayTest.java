package code.arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SearchBitonicArrayTest {

	 @Test
     public void searchBitonicArray_SimpleCase() {
             int[] input = { 1, 2, 5, 0, -2};

             int result = SearchBitonicArray.searchInBitonicArray(input, 5);
             assertEquals(result, 2);
             
             result = SearchBitonicArray.searchInBitonicArray(input, 10);
             assertEquals(result, -1);
     }
	
	 @Test
     public void searchBitonicArray_ArraySize1() {
             int[] input = { 5 };

             int result = SearchBitonicArray.searchInBitonicArray(input, 5);
             assertEquals(result, -0);
             
             result = SearchBitonicArray.searchInBitonicArray(input, -4);
             assertEquals(result, -1);
     }
	 	
	 @Test
     public void searchBitonicArray_ArraySize2() {
             int[] input = { 1, 5 };

             int result = SearchBitonicArray.searchInBitonicArray(input, 5);
             assertEquals(result, 1);
             
             result = SearchBitonicArray.searchInBitonicArray(input, 10);
             assertEquals(result, -1);
     }
	 
	 @Test
     public void searchBitonicArray_ComplexCase1() {
             int[] input = { 1, 2, 5, 10, -2};

             int result = SearchBitonicArray.searchInBitonicArray(input, -2);
             assertEquals(result, 4);
             
             result = SearchBitonicArray.searchInBitonicArray(input, 2);
             assertEquals(result, 1);
             
             result = SearchBitonicArray.searchInBitonicArray(input, -5);
             assertEquals(result, -1);
     }
	 
	 @Test
     public void searchBitonicArray_ComplexCase2() {
             int[] input = { 1, 2, 5, 7, 10};

             int result = SearchBitonicArray.searchInBitonicArray(input, 7);
             assertEquals(result, 3);
             
             result = SearchBitonicArray.searchInBitonicArray(input, 12);
             assertEquals(result, -1);
             
             result = SearchBitonicArray.searchInBitonicArray(input, 6);
             assertEquals(result, -1);
     }
	 
	 @Test
     public void searchBitonicArray_ComplexCase3() {
             int[] input = { 10, 7, 5, 0, -2};

             int result = SearchBitonicArray.searchInBitonicArray(input, 9);
             assertEquals(result, -1);
             
             result = SearchBitonicArray.searchInBitonicArray(input, 3);
             assertEquals(result, -1);
             
             result = SearchBitonicArray.searchInBitonicArray(input, 10);
             assertEquals(result, 0);
     }
	 
}
