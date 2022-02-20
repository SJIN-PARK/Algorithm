package BaekJoon;

import java.io.BufferedReader;

/*
problem
There are N cities in a country. These cities are on straight roads. 
For convenience, let's put a straight line in the horizontal direction. 
You are trying to move from the leftmost city to the rightmost city by car. 
Roads between two adjacent cities may have different lengths. The unit of road length is km.

When you first start the car, there is no oil in the car, so you have to put fuel in the gas station to start. 
The size of the oil tank is unlimited, so you can put as many oil as you want. 
When traveling by road, 1 liter of oil is used for every 1 km. 
Each city has only one gas station, and the price per liter of gas stations can vary from city to city. The unit of price is the won.

For example, let's say there are 4 cities in this country as shown in the figure below. 
The number in the circle is the price per liter of gas stations in that city. The number on the road indicates the length of the road.

If you put 6 liters of oil in the leftmost city and move to the rightmost city without any further refueling, the total cost is 30 won. 
If you put 2 liters of oil in the leftmost city (2×5 = 10 won) and move to the next city, add 3 liters of oil (3×2 = 6 won) and 
add 1 liter of oil in the next city ( 1×4 = 4 won) If you move to the rightmost city, the total cost is 20 won. 
Another way is to put 2 liters of oil in the leftmost city (2×5 = 10 won), move to the next city, put 4 liters of oil (4×2 = 8 won), 
and move to the rightmost city, The total cost is $18.

Write a program that takes as input the price of gas at gas stations in each city and 
the length of the road connecting each city, and calculates the minimum cost of moving from the leftmost city to the rightmost city.

input
The standard input is given the following information: The first line is given an integer N (2 ≤ N ≤ 100,000) representing the number of cities. In the next line, the length of the road connecting two adjacent cities is given as N-1 natural numbers from the leftmost province. In the next line, the prices per liter of gas stations are given as N natural numbers in order from the leftmost city. The distance from the leftmost city to the rightmost city is a natural number between 1 and 1,000,000,000. The price per liter is a natural number between 1 and 1,000,000,000.

Print
Print the minimum cost from the leftmost city to the rightmost city to standard output.

예제 입력 1 
4
2 3 1
5 2 4 1
예제 출력 1 
18
예제 입력 2 
4
3 3 4
1 1 1 1
예제 출력 2 
10

 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gas_Station {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(reader.readLine());
		
		int[] distance = new int[N-1];
		StringTokenizer st = new StringTokenizer(reader.readLine(), " ");
		for(int i = 0; i < N-1; i++){
			distance[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] price = new int[N];
		st = new StringTokenizer(reader.readLine(), " ");
		for(int i = 0; i < N; i++){
			price[i] = Integer.parseInt(st.nextToken());
		}
		
		int totalPrice = 0;
		int curPrice = price[0];
		for(int i = 0; i < N-1; i++){
			if(curPrice > price[i]){
				curPrice = price[i];
			}
			
			totalPrice += (curPrice * distance[i]);
		}
		
		System.out.println("Total Price : " + totalPrice);
		
	}
}
