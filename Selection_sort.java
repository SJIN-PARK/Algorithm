package Stranger_Lab.Sort;

import java.util.ArrayList;
import java.util.Arrays;

/*
 
 1. Find the minimum value in a given list.

2. Swap the minimum value with the first digit.

3. Find the minimum value among the remaining values except for the first digit and repeat the above method.
 
 */

public class Selection_sort {
	public static void selection_sort(int[] a) {
		selection_sort(a, a.length);
	}
	
	private static void selection_sort(int[] a, int size) {
		
		for(int i = 0; i < size - 1; i++) {
			int min_index = i;	
			
			// find index which has the minimum value 
			for(int j = i + 1; j < size; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}
			
			// swap the minimum value and [i] digit value
			swap(a, min_index, i);
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args){
		
		int[] array = new int[50];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*51);	// 0 ~ 50
		}
		
		System.out.println("Before Sort : " + Arrays.toString(array));
		
		selection_sort(array);
		
		System.out.println("After Sort : " + Arrays.toString(array));
	}
}
