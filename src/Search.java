import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Search {

    /*
     * Complete the swapNodes function below.
     */
    static int[][] swapNodes(int[][] indexes, int[] queries) {
        int[][] result = null;

        /*
         * Write your code here.
         */
        return result;
    }

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {

        int count =0;
        List<Integer> list =  new ArrayList<Integer>() {{ for (int i : arr) add(i); }};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > k){
                int num = arr[i] =k;
                if(list.contains(num)){
                    count++;
                }
            }
        }
        System.out.println("count " + count);
        return count;
    }

    static long triplets(int[] a, int[] b, int[] c) {
        long count =0;
        HashSet<Integer> aset = new HashSet<>();
        for(int i : a){aset.add(i); }
        HashSet<Integer> bset = new HashSet<>();
        for(int i : b){bset.add(i); }
        HashSet<Integer> cset = new HashSet<>();
        for(int i : c){cset.add(i); }

            long acount=0;
            long ccount=0;
            for (int bvalue : bset) {
                acount = aset.stream().filter(aa->aa<=bvalue).count();
                ccount = cset.stream().filter(cc -> cc <= bvalue).count();
                System.out.println("acount   " + acount);
                System.out.println("ccount   " + ccount);
                count = count + (acount*ccount);
                System.out.println("count   " + count);
            }
        System.out.println("total count   " + count);
        return count;

    }

     public static void main(String[] args) throws IOException {
        int k = 2;

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 2;

//        int result = pairs(k, arr);

         int[] arra = new int[3];
         int[] arrb = new int[3];
         int[] arrc = new int[3];

         arra[0] = 1;
         arra[1] = 4;
         arra[2] = 5;

         arrb[0] = 2;
         arrb[1] = 3;
         arrb[2] = 3;

         arrc[0] = 1;
         arrc[1] = 2;
         arrc[2] = 3;

         long ans = triplets(arra, arrb, arrc);

    }

}
