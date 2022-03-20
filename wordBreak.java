package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "catsandog";
		String[] wordDict = {"cats","dog","sand","and","cat"};
		
//		String s = "leetcode"; 
//		String[] wordDict = {"leet","code"};
		
		Boolean [] visit = new Boolean [s.length()];
		boolean result = false;
		
		Set<String> set = new HashSet<>();
		for(int i = 0; i < wordDict.length; i++){
			set.add(wordDict[i]);
		}
		
//		for(int i = 0; i < s.length(); i++){
//			for(int j = i+1; j < s.length(); j++){
//				if(res[j] != null){
//					continue;
//				}
//				
//				if(set.contains(temp_s.subSequence(i, j))){
//					System.out.println(temp_s.subSequence(i, j));
//					res[j] = temp_s.substring(i, j);
//				}
//			}
//		}
		
		result = solve(0, s, set, visit, s.length() );
		System.out.println(Arrays.toString(visit));
		System.out.println(result);
	}
	
	public static boolean solve(int i, String s, Set<String> wordSet, Boolean [] visit, int l){
        
        if(i==l) return true;
        if(visit[i] != null) return visit[i];
        boolean flag = false;
        for(int k=i+1; k<=l; k++){
            String ss = s.substring(i, k);
            System.out.println(ss);
            if(wordSet.contains(ss)){
            	System.out.println(ss);
                flag = flag || solve(k, s, wordSet, visit, l);
                if(flag){
                	visit[i] = true;
                    return true;
                }
            }
        }
        return visit[i] = flag;
    }

}
