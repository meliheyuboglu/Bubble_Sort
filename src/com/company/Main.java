package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bubble_sort bubble = new Bubble_sort();
        int[] array = { 28, 51, 16, 1, 13, 61};
        bubble.Bubblesort(array);
        System.out.println(Arrays.toString(array));
    }


}
