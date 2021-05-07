package de.util.List;

public class SList<E> {

    public E element;
    private SList<E> next;

    public SList(E element, SList<E> next) {
        this.element = element;
        this.next = next;
    }

    public SList<E> next() {
        return this.next;
    }

    public void setNext(SList<E> next) {
        this.next = next;
    }

    public String toString() {
        String result = this.element + ", ";
        SList<E> _next = this.next;
        while (_next != null) {
            result += _next.element + ", ";
            _next = _next.next;
        }
        return result.substring(0, result.length() - 2);
    }
}

