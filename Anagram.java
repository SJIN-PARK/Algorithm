import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Anagram {
	public static void main(String[] args){
		
		Map<String, List<String>> map = new HashMap<>();
		
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		char[] sortedStr = null;
		String valueStr = null;

        for (String str : strs) {
        	
        	sortedStr = str.toCharArray();
        	Arrays.sort(sortedStr);
        	valueStr = String.valueOf(sortedStr);
        	
//        	System.out.println("str : " + str);
//        	System.out.println("valueStr : " + valueStr);
        	
            if (!map.containsKey(valueStr)) {
                map.put(valueStr, new LinkedList<>());
            }
            map.get(valueStr).add(str);
        }
        
        
        
        //Iterator 사용 3 - entrySet() : key / value 
        Set set2 = map.entrySet(); 
        Iterator iterator2 = set2.iterator(); 
        while(iterator2.hasNext()){ 
        	Entry<String,List<String>> entry = (Entry)iterator2.next(); 
        	String key = (String)entry.getKey(); 
        	int valLn = entry.getValue().size();
        	System.out.println("hashMap valLn : " + valLn); 
        	System.out.println("hashMap Key : " + key); 
        	for(int i = 0; i < valLn ; i++){
        		String value = entry.getValue().get(i); 
            	System.out.println("hashMap Value : " + value); 
        	}      	
        	
    	}


	}
}
