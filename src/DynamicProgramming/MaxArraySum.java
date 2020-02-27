package DynamicProgramming;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaxArraySum {
    // Complete the maxSubsetSum function below.
    static int maxSubsetSum(int[] arr) {
        int max = 0;
        List<Integer> list = new ArrayList<Integer>(arr.length);
        //하나씩 찾자 내옆에 빼고 다 하나씩 짝을 맞출수 있음.
        int size = (arr.length/2);
        for (int i = 0; i < arr.length-1; i++) {
            //조건1. 내옆에꺼빼고 하나씩 2열배열 만든다.
            // 조건 2. 내옆에 앤드 건너뛰고 앤드 만든다.
            for(int j=0; j< arr.length-2; j++ ) {
                int value1 = arr[i] + arr[i + j + 2];
                if (value1 > max) {
                    max = value1;
                }
            }
            for (int h = 0; h < size; h+2) {

            }
                int value2 = arr[i] + arr[i+2]

        }

        for (int i : arr){
            list.add(i);
        }
        list.sort(null);

        return max;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = -7;
        arr[3] = 8;
        arr[4] = 10;

        int res = maxSubsetSum(arr);
    }

}
