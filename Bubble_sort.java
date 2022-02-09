package Stranger_Lab.Sort;

import java.util.Arrays;

/*
1. Compare the current element with the next element from the front.

2. If the current element is greater than the next element, the element is exchanged.

3. Move to the next element and compare that element with the next element.
*/

public class Bubble_sort {
	
	public static void bubble_sort(int[] a) {
		bubble_sort(a, a.length);
	}
	
	private static void bubble_sort(int[] a, int size) {
		
		// round는 배열 크기 - 1 만큼 진행됨 
		for(int i = 1; i < size; i++) {
			
			// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size - i; j++) {
				
				/*
				 *  현재 원소가 다음 원소보다 클 경우
				 *  서로 원소의 위치를 교환한다. 
				 */
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
				}
			}
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
		
		bubble_sort(array);
		
		System.out.println("After Sort : " + Arrays.toString(array));
	}
}
