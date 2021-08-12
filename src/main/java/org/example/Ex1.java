package org.example;

public class Ex1 {


    public int[] array (int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index = i;
            }
        }
        if (arr[0] !=4 && index == 0) {
            try {
                throw new RuntimeException("No 4 in array");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        int[] array = new int[arr.length - (index + 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[index + 1];
            index++;
        }
        return array;
    }
}
