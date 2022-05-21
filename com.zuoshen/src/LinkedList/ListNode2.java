package LinkedList;

public class ListNode2 {
    ListNode2 next;
    int val;

    public ListNode2(){

    }

    public ListNode2(int num, ListNode2 nextNode) {
        this.val = num;
        this.next = nextNode;
    }

    public void setNext(ListNode2 next) {
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public static void printList(ListNode2 head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        ListNode2 a = new ListNode2();
        ListNode2 b = new ListNode2();
        ListNode2 c = new ListNode2();
        ListNode2 d = new ListNode2();

        a.setNext(b);
        a.setVal(1);
        b.setNext(c);
        b.setVal(2);
        c.setNext(d);
        c.setVal(3);
        ListNode2.printList(a);
    }

}
