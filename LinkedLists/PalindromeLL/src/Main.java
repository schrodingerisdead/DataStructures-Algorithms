public class Main {

    public boolean isPalindrome(SLLNode<Integer> first){
        SLLNode<Integer> slow = first;
        SLLNode<Integer> fast = first;

        while (fast!=null  && fast.succ!= null){
            fast = fast.succ.succ;
            slow = slow.succ;
        }
        slow = reversed(slow);
        fast = first;

        while (slow!=null){
            if(slow.element != fast.element ) {
               return false;
            }
            slow = slow.succ;
            fast = fast.succ;
        }
        return true;
    }

    public SLLNode<Integer> reversed(SLLNode<Integer> head) {
        SLLNode<Integer> prev = null;
        while (head!=null){
            SLLNode<Integer> next = head.succ;
            head.succ = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}