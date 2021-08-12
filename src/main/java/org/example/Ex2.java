package org.example;

public class Ex2 {
    public void array(int[] arr) {
        boolean isContains = false;
        int one = 0;
        int four = 0;
        int n = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                one++;
            } else if (arr[i] == 4) {
                four++;
            } else {
                n++;
            }
        }
        if (one > 0 && four > 0 && n == 0) {
            isContains = true;
            System.out.println(isContains);
        } else {
            System.out.println(isContains);
        }
    }
}
