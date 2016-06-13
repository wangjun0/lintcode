/**
 * Created by Administrator on 2016/6/13.
 */
public class ConvertSortedListtoBalancedBST {
    /**
     * @param head: The first node of linked list.
     * @return: a tree node
     */
    //给出一个所有元素以升序排序的单链表，将它转换成一棵高度平衡的二分查找树
   /* public TreeNode sortedListToBST(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        }
        int size = size(head);
        return sortedListToBST(head, 0, size - 1);
    }

    private TreeNode sortedListToBST(ListNode head, int start, int end) {
        if (start > end) {
            return null;
        }
        if (end - start == 1) {
            return new TreeNode(head.val);
        }

        int middle = start + (end - start) / 2;

        ListNode curr = head;
        int index = start;
        while (index <= middle) {
            curr = curr.next;
        }
        TreeNode root = new TreeNode(curr.val);
        root.left = sortedListToBST(head, start, middle - 1);
        root.right = sortedListToBST(head, middle + 1, end);

        return root;
    }

    private int size(ListNode head) {
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }*/
    public TreeNode sortedListToBST(ListNode head) {
        // write your code here
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode middle = findMiddle(head);
        TreeNode root = new TreeNode(middle.next.val);
        root.right = sortedListToBST(middle.next.next);
        middle.next = null;
        root.left = sortedListToBST(head);
        return root;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

}

