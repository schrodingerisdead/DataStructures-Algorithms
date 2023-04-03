// INPUT: 1->2->3->4->5->6->7->8
// OUTPUT: 1->8->2->7->3->6->4->5
/*
    how to achieve this...
    we split the linked lists to 2 linked lists (basically separate the list in the middle)
    1->2->3->4->NULL
    5->6->7->8->NULL
    after this we reverse the links in the 2nd list
    5<-6<-7<-8
         or
    8->7->6->5->null
 */
public class Main {
    public void reorderList(SLLNode<Integer> head){
        if (head == null || head.succ == null) return;
        //head of first half
        SLLNode<Integer> l1 = head;
        //head of second half
        SLLNode<Integer> slow = head;
        //tail of second half
        SLLNode<Integer> fast = head;
        //tail of first half
        SLLNode<Integer> prev = null;

        while(fast!= null && fast.succ != null) {
            prev = slow;
            slow = slow.succ;
            fast = fast.succ.succ;
        }
        prev.succ = null;
        SLLNode<Integer> l2 = reverse(slow);
        merge(l1, l2);
    }

    public SLLNode<Integer> reverse (SLLNode<Integer> head){
        SLLNode<Integer> prev = null;
        SLLNode<Integer> current_node = head;
        while (current_node!=null){
            SLLNode<Integer> next_node = current_node.succ;
            current_node.succ = prev;
            prev = current_node;
            current_node = next_node;
        }
        return prev;
    }

    public void merge(SLLNode<Integer> l1, SLLNode<Integer> l2){
        while (l1 != null){
            SLLNode<Integer> l1_next = l1.succ;
            SLLNode<Integer> l2_next = l2.succ;

            l1.succ = l2;
            if(l1.succ == null){
                break;
            }
            l2.succ = l1_next;
            l1 = l1_next;
            l2 = l2_next;
        }
    }
    public static void main(String[] args) {
        

    }
}