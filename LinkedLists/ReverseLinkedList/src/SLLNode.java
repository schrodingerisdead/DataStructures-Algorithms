public class SLLNode<E> {
    protected E element;
    protected SLLNode<E> next;

    public SLLNode(E elem, SLLNode<E> next){
        this.element = elem;
        this.next = next;
    }
    @Override
    public String toString()  {
        return element.toString();
    }
}
