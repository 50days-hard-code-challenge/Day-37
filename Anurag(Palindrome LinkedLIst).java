class Solution {
    public ListNode findmiddle( ListNode head)
     {
        
        ListNode T=head;
	    ListNode  H=head;
			while(H.next!=null && H.next.next!=null)
			{
				T=T.next;
				H=H.next.next;
			}
			return T;
      }

     public ListNode reverse(ListNode head)
     {
            ListNode prev=null;
			  ListNode curr=head;
			  while(curr!=null)
			  {
				   ListNode NEXT=curr.next;
				   curr.next=prev;
				   prev=curr;
				   curr=NEXT;

			  }
			  return prev;
     }
    public boolean isPalindrome(ListNode head) {
      if(head==null || head.next==null )
		{
			return true;
		}
		ListNode middle=findmiddle(head);
		ListNode secondstart=reverse(middle.next);
		ListNode firststart=head;

		while(secondstart!=null)
		{
			if(firststart.val!=secondstart.val)
			{
				return false;
			}
			firststart=firststart.next;
			secondstart=secondstart.next;
		}
		return true;
		
    }
}
