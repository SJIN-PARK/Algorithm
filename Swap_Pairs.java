package LeetCode;

public class Swap_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			
	}
	
	
	public static ListNode swapPairs(ListNode head) {
		if(head==null) return null;
		if(head.next==null) return head;
		ListNode temp=new ListNode();
		temp.val=head.next.val;
		head.next.val=head.val;
		head.val=temp.val;
		swapPairs(head.next.next);
		return head;

	}

}
