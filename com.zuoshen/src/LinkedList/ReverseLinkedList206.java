package LinkedList;

//   t
//   h
//   a   b    c     d
//  1 <  2  > 3 >  4
//

public class ReverseLinkedList206 {
    public static ListNode reverseList(ListNode head) {
        ListNode tempPre = null;
        ListNode tempNext;

        if (head == null || head.next == null) {
            return head;
        }

        while (head != null) {
            tempNext = head.next;
            head.next = tempPre;
            tempPre = head;
            head = tempNext;
        }

        return tempPre;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        ListNode.printNode(a);
        ListNode head = reverseList(a);
        ListNode.printNode(head);

    }
}
