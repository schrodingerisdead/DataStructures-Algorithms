//REVERSE A Singly Linked List
/*
    EXAMPLE:
    INPUT: 1->2->3->4->5->NULL
    OUTPUT: 5->4->3->2->1->NULL
 */
public class Main {

    public SLLNode<Integer> reverseList(SLLNode<Integer> head) {
        SLLNode<Integer> prev = null;
        while (head!=null){
            SLLNode<Integer> next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        
    }
}