package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "catsandog";
		String[] wordDict = {"cats","dog","sand","and","cat"};
		
		String[] res = new String[s.length()+1];
		
		String temp_s = s;
		Set<String> set = new HashSet<>();
		for(int i = 0; i < wordDict.length; i++){
			set.add(wordDict[i]);
		}
		
		for(int i = 0; i < s.length(); i++){
			for(int j = i+1; j < s.length(); j++){
				if(res[j] != null){
					continue;
				}
				
				if(set.contains(temp_s.subSequence(i, j))){
					System.out.println(temp_s.subSequence(i, j));
					res[j] = temp_s.substring(i, j);
				}
			}
		}
	}

}
