package LinkedList;

/*
 * this is a class for basic single linkedlist
 **/

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(){

    }

    public ListNode (int val) {
        this.val = val;
    }

    public ListNode (int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // print all node's val after(include) input node
    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("\n");
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
        printNode(a);

        
    }

}
