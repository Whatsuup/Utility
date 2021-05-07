package de.util.List;

public class DList<E> {

    public E element;
    private DList<E> next;
    private DList<E> prev;

    public DList(E element, DList<E> next, DList<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public DList<E> next() {
        return this.next;
    }

    public DList<E> prev() {
        return this.prev;
    }

    public void setNext(DList<E> next) {
        this.next = next;
    }

    public void setPrev(DList<E> prev) {
        this.prev = prev;
    }

    public String toString() {
        String result = this.element + ", ";
        DList<E> _next = this.next;
        while (_next != null) {
            result += _next.element + ", ";
            _next = _next.next;
        }
        return result.substring(0, result.length() - 2);
    }
}
