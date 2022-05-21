package LinkedList;

import java.util.ArrayList;
import java.util.Stack;

public class Palindrom {

    public static boolean isPalindromArrayList(ListNode head) {
        ArrayList valList = new ArrayList();
        while (head != null) {
            valList.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = valList.size() - 1;
        while (left < right) {
            if (valList.get(left) != valList.get(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

//                  f                     
//          s              
//  1   2   3   2   3


    public static boolean isPalindromStack(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevSlow = null;


        if (head == null) {
            return true;
        }

        // 2 pointers to detect mid node
        while (fast != null && fast.next != null) {
            stack.push(slow.val);
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // even lenght
        if (fast == null) {
            slow = prevSlow;
        }

        slow = slow.next;
        while (!stack.empty()) {
            int temp = stack.pop();
            if (slow.val != temp) {
                return false;
            }
            slow = slow.next;
        }

        return true;

    }


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(1);
       // ListNode e = new ListNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        //e.next = null;
        ListNode.printNode(a);

        boolean result = isPalindromArrayList(a);
        boolean result2 = isPalindromStack(a);
        System.out.println(result2);
    
    }
}
