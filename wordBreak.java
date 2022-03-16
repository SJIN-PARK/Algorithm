package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "catsandog";
		List<String> wordDict = new ArrayList<>();
		
		String temp_s = s;
		Set<String> set = new HashSet<>();
		for(int i = 0; i < wordDict.size(); i++){
			set.add(wordDict.get(i));
		}
	}

}
