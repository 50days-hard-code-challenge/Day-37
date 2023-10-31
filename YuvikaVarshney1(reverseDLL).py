def reverseDLL(head):
    # Write your code here
    t=head
    t1=head
    t1=t1.next
    
    while t.next!=None:
        t.next,t.prev=t.prev,t.next
        t=t1
        t1=t1.next
    t.next,t.prev=t.prev,t.next
    head=t
    return head
    
    pass
