def findMiddle(head):
    # Write your code here
    # head denoted head of linked list
    """
    current=head
    mid = head
    while current:
        current=current.next
        if current:
            current=current.next
            mid=mid.next
    return mid
    """
    slow=head
    fast=head
    while fast.next!=None:
        if fast.next.next==None:
            return slow.next
        fast=fast.next.next
        slow=slow.next
    return slow

    pass
