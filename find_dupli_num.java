import java.util.Arrays;
import java.util.StringTokenizer;

public class find_dupli_num {
	
	public static void main(String[] args){
		int[] nums = {3,2,5,14,5,5,19,18,11,10,1,4,5,5,5,5,12,5,17,5};
		
		// find cycle
        int slow = nums[0], fast = nums[nums[0]];
        
        System.out.println("slow:" + slow);
        System.out.println("fast:" + fast);
        
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            
            System.out.println("slow2:" + slow);
            System.out.println("fast2:" + fast);
        }

        // find cycle start point        
        int index = 0;
        while (slow != index) {
            index = nums[index];
            slow = nums[slow];
            
            System.out.println("index:" + index);
            System.out.println("slow:" + slow);
        }

	}
	
}
