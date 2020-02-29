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
//        List<Integer> list = new ArrayList<Integer>(arr.length);
//        //하나씩 찾자 내옆에 빼고 다 하나씩 짝을 맞출수 있음.
//        int size = (arr.length/2);
//        for (int i = 0; i < arr.length-1; i++) {
//            //조건1. 내옆에꺼빼고 하나씩 2열배열 만든다.
//            // 조건 2. 내옆에 앤드 건너뛰고 앤드 만든다.
//            for(int j=0; j< arr.length-2; j++ ) {
//                int value1 = arr[i] + arr[i + j + 2];
//                if (value1 > max) {
//                    max = value1;
//                }
//            }
//            for (int h = 0; h < size; h+2) {
//
//            }
//                int value2 = arr[i] + arr[i+2]
//
//        }
        return max;
    }

    static String abbreviation(String a, String b) {
        String result ="YES";
        // 1. a를 uppercase로 바꾼다.
        // 2. ab,를 contains로 바꾸고 b이 있는문자가 a에 없으면 바로 no return.
        // 다 돌고 아무 이상 없으면 yes



        String uppera= a.toUpperCase();
        String upperb=b.toUpperCase();

        List<String> upperlista = new ArrayList<>(Arrays.asList(uppera.split("")));
        List<String> lista = new ArrayList<>(Arrays.asList(a.split("")));
        List<String> upperlistb = new ArrayList<>(Arrays.asList(upperb.split("")));
        System.out.println("확인0 : " + upperlista.toString());

        for (int i = 0; i < upperlistb.size(); i++) {
            System.out.println("확인1 : " + upperlistb.get(i));
            System.out.println("확인2 : " + upperlista.contains(upperlistb.get(i)));
            if(!upperlista.contains(upperlistb.get(i))){
                return result = "NO";
            }
            System.out.println("초코" + upperlistb.get(i));
            System.out.println("뭐냐" + upperlista.indexOf(upperlistb.get(i)));
            System.out.println("확인0 : " + lista.toString());
            lista.set(upperlista.indexOf(upperlistb.get(i)),"");
            System.out.println("확인0 : " + lista.toString());

        }
        //나머지 문자가 모두 소문자인지 검사.
        for (int k = 0; k < upperlista.size(); k++) {
            if(lista.get(k)!=""){
                String str = lista.get(k);
                char c = str.charAt(0);
                if (!Character.isLowerCase(c)) {
                    return result="NO";
                }
            }

        }
        return result;

    }

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        long totalcandies = 1;
        long beforecandycount= 1;

        // 무조건 처음은 1이다.
        // 앞사람이랑 비교해서 본인이 크다면 앞사람 숫자에 플러스 1 아니면 넘어감.
        for (int i = 1; i < arr.length-2; i++) {
            System.out.println("---------------------");
            System.out.println("-----" +arr[i-1]+"------"+arr[i]);

            if(arr[i-1] < arr[i]){
                beforecandycount++;
                totalcandies = totalcandies + beforecandycount;
            }else {

                if(arr[i] >arr[i+1]){
                    beforecandycount = 2;
                }else {
                    beforecandycount = 1;
                }
                totalcandies = totalcandies + beforecandycount;
            }

            System.out.println(i+" 확인 : " + beforecandycount);
            System.out.println(i+" 확인 : " + totalcandies);
        }
        System.out.println("무슨?  " + arr[arr.length-2] + "   " + arr[arr.length-1] );

        if(arr[arr.length-2] < arr[arr.length-1]){
            beforecandycount++;
            totalcandies = totalcandies + beforecandycount;
        }else{
            beforecandycount--;
            totalcandies = totalcandies + beforecandycount;
        }
        System.out.printf("확인 : " + totalcandies);

        return totalcandies;

    }


    public static void main(String[] args) {

//        int[] arr = new int[10];
//        arr[0] = 2;
//        arr[1] = 4;
//        arr[2] = 2;
//        arr[3] = 6;
//        arr[4] = 1;
//        arr[5] = 7;
//        arr[6] = 8;
//        arr[7] = 9;
//        arr[8] = 2;
//        arr[9] = 1;


//        int[] arr = new int[8];
//        arr[0] = 2;
//        arr[1] = 4;
//        arr[2] = 3;
//        arr[3] = 5;
//        arr[4] = 2;
//        arr[5] = 6;
//        arr[6] = 4;
//        arr[7] = 5;

                int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;

//        int res = maxSubsetSum(arr);

//        String result = abbreviation("daBcd", "ABC");
//        System.out.println("확인"+ result);


        long result = candies(3, arr);
    }

}
