package LeetCode;

/*
38. Count and Say
Medium

1235

3247

Add to List

Share
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
To determine how you "say" a digit string, split it into the minimal number of groups 
so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, 
then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.

For example, the saying and conversion for digit string "3322251":


Given a positive integer n, return the nth term of the count-and-say sequence.

 

Example 1:

Input: n = 1
Output: "1"
Explanation: This is the base case.

Example 2:

Input: n = 4
Output: "1211"
Explanation:
countAndSay(1) = "1"
countAndSay(2) = say "1" = one 1 = "11"
countAndSay(3) = say "11" = two 1's = "21"
countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 */

public class countAndSay {

	static int cur_depth = 2;
	static String result = "";
	static int n = 6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(n == 1){ System.out.println("1");}
		if(n == 2){ System.out.println("11");}
				
		Count("11", n);
	}
	
	public static String Count(String s, int depth){
		
		if(cur_depth == n){
			return result;
		}
		
		result = "";
		int count = 1;
		char temp = s.charAt(0);
		
		System.out.println("temp : " + temp);
		
		for(int i = 1; i < s.length(); i++){
			
			if(temp == s.charAt(i)){
				count++;
				System.out.println("temp1 : " + temp);
			}else{			
				result += Integer.toString(count) + temp;
				temp = s.charAt(i);
				count = 1;
				System.out.println("temp2 : " + temp);
			}
			
			if(i == s.length()-1){
				result += Integer.toString(count) + temp;
			}
			System.out.println("Result : " + result);
		}
		
		Count(result, cur_depth++);
		
		return result;
	}

}
