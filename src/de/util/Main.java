package de.util;

import de.util.List.SList;

public class Main {


    public static void main(String[] args) {

        /* Manual Generation */
        SList<Integer> a = new SList<>(1, new SList<>(2, new SList<>(3, new SList<>(4, new SList<>(5, null)))));
        SList<Integer> b = new SList<>(0, new SList<>(0, new SList<>(0, new SList<>(0, new SList<>(0, null)))));

    }

    //TODO
    //Automated SList generation. Returns the start SList.
    public static SList<Integer> createSListWithArray(Integer[] arr) {
        return null;
    }

    /**
     * This function copies elements from L to R in reverse order.
     * @param L : SList -> the elements in this SList will be used.
     * @param R : SList -> this SList will include all the reversed items.
     */
    public static void createSListRevert(SList<Integer> L, SList<Integer> R) {
        int count = 0;
        SList<Integer> tempL = L;
        while (tempL.next() != null) {
            tempL = tempL.next();
            count++;
        }
        int[] arr = new int[count + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = L.element;
            L = L.next();
        }

        for (int i = (arr.length - 1); i >= 0; i--) {
            R.element = arr[i];
            R = R.next();
        }
    }
}
