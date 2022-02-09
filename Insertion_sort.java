package Stranger_Lab.Sort;

import java.util.Arrays;

/*
1. Compare the current target number with the elements in the previous position. (The first target starts with the second element.)

2. If the target number is less than the element in the previous position, the positions are swapped.

3. Find the next target and repeat the above method.
 */

public class Insertion_sort {
	
	public static void insertion_sort(int[] a) {
		insertion_sort(a, a.length);
	}
	
	private static void insertion_sort(int[] a, int size) {
		
		
		for(int i = 1; i < size; i++) {
			// target value
			int target = a[i];
			
			int j = i - 1;
			
			// Repeat until target is larger than previous element
			while(j >= 0 && target < a[j]) {
				a[j + 1] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
				j--;
			}
			
			/*
			 * When escaping from the above loop, it means that the preceding element is smaller than the target.
			 * The target element must come after the [j] element.
			 * Therefore, the target is located at j + 1.
			 */
			a[j + 1] = target;	
		}
		
	}
	
	public static void main(String[] args){
		
		int[] array = new int[50];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*51);	// 0 ~ 50
		}
		
		System.out.println("Before Sort : " + Arrays.toString(array));
		
		insertion_sort(array);
		
		System.out.println("After Sort : " + Arrays.toString(array));
	}
}
