package reversed_list;


class Solution {
    public static void main(String[] args) {
        ListNode node = new ListNode(100);

        node.add(21);
        node.add(65);
        node.add(34);
        node.add(13);

        System.out.println(node);

        ListNode listNode = reverseList(node);
        System.out.println(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;

            prev = current;
            current = nextNode;
        }

        return prev;
    }
}
