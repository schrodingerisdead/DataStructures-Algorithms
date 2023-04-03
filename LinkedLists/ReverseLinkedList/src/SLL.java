import java.util.Iterator;
import java.util.NoSuchElementException;
public class SLL<E> {
    private SLLNode<E> head;

    public SLL(){
        //CONSTRUCT AN EMPTY SLL
        this.head = null;
    }

    public void deleteList(){
        head = null;
    }

    public int length(){
        int n;
        if(head!=null){
            SLLNode<E> tmp = head;
            n=1;
            while(tmp.next!=null) {
                tmp = tmp.next;
                n++;
            }
            return n;
        }
        else
            return 0;
    }
    @Override
    public String toString(){
        String n = new String();
        if(head!=null){
            SLLNode<E> tmp = head;
            n+=tmp + "->";
            while (tmp.next!=null){
                tmp = tmp.next;
                n+=tmp+ "->";
            }
        }
        else
            n = "PRAZNA LISTA";
        return n;
    }

    public void insertFirst( E o) {
        SLLNode<E> insert = new SLLNode<E>(o, head);
        head = insert;
    }

    public void insertAfter(E o, SLLNode<E> node) {
        if(node!=null) {
            SLLNode<E> insert = new SLLNode<E>(o, node.next);
            node.next = insert;
        } else {
            System.out.println("Dadeniot jazol e null");
        }
    }

    public void insertBefore(E o, SLLNode<E> before){

        if(head!=null){
            SLLNode<E> tmp = head;
            if(head == before){
                this.insertFirst(o);
                return;
            }
            //ako first!=before
            while (tmp.next!=before)
                tmp = tmp.next;
            if(tmp.next == before){
                SLLNode<E> insert = new SLLNode<E>(o, before);
                tmp.next = insert;
            }
            else {
                System.out.println("Elementot ne postoi vo listata");
            }
        }
        else {
            System.out.println("Listata e prazna");
        }
    }

    public void insertLast(E o){
        if(head!=null){
            SLLNode<E> tmp = head;
            while (tmp.next!=null)
                tmp=tmp.next;
            SLLNode<E> insert = new SLLNode<E>(o, null);
            tmp.next = insert;
        }
        else {
            insertFirst(o);
        }
    }

    public E deleteFirst(){
        if(head!=null) {
            SLLNode<E> tmp = head;
            head = head.next;
            return tmp.element;
        }
        else{
            System.out.println("Listata e prazna");
            return null;
        }
    }

    public E delete(SLLNode<E> node){
        if(head!=null) {
            SLLNode<E> tmp = head;
            if (head == node) {
                return this.deleteFirst();
            }
            while (tmp.next != node && node.next.next != null)
                tmp = tmp.next;
            if (tmp.next == node) {
                tmp.next = tmp.next.next;
                return node.element;
            } else {
                System.out.println("Elementot ne postoi vo listata");
                return null;
            }
        }
        else {
            System.out.println("Listata e prazna");
            return null;
        }
    }

    public SLLNode<E> getHead() {
        return head;
    }

    public SLLNode<E> find(E o){
        if(head!=null){
            SLLNode<E> tmp = head;
            while (tmp.element!= o && tmp.next!=null)
                tmp = tmp.next;
            if(tmp.element == o) {
                return tmp;
            }
            else {
                System.out.println("Elementot ne postoi vo listata");
            }
        }
        else {
            System.out.println("Listata e prazna");
        }
        return head;
    }

    public Iterator<E> iterator() {
        //Return an iterator that visits all elements of this list, in left-to-right order.
        return new LRIterator<E>();
    }

    private class LRIterator<E> implements Iterator<E> {

        private SLLNode<E> place, curr;

        private LRIterator() {
            place = (SLLNode<E>) head;
            curr = null;
        }

        public boolean hasNext() {
            return (place != null);
        }

        public E next() {
            if (place == null)
                throw new NoSuchElementException();
            E nextElem = place.element;
            curr = place;
            place = place.next;
            return nextElem;
        }

        public void remove() {
            //Not implemented
        }
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        if(head!=null){
            SLLNode<E> tmp = head;
            sb.append(tmp.element);
            sb.append("->");
            while (tmp.next!=null) {
                tmp = tmp.next;
                sb.append(tmp.element);
                sb.append("->");
            }
        }
        else {
            sb.append("Prazna");
        }
        System.out.println(sb.toString());
    }

}
