package LinkedList;

/*
reverse a single linked list
return head
**/

// 1   2   3



public class Reverse {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode prevTemp = null;
        while (cur != null) {
            ListNode nextTemp = cur.next;
            cur.next = prevTemp;
            prevTemp = cur;
            cur = nextTemp;
        }

        return prevTemp;
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

        reverseList(a);
        ListNode.printNode(e);
    }
}
