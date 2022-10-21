package com.company;

public class Bubble_sort {
    void Bubblesort(int[] array){
        int n = array.length;
        for (int i = 0 ; i < n-1 ; i++){
            boolean flag = false;
            for (int j = 0 ; j < n-1-i ; j++){  //End of the first iteration last number is the biggest number
                //so we do not need to check last number for other iterations etc.
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array [j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break; //To decrease time complexity of the best case, i added flag.
        }

    }
}
