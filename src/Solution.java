import javax.swing.*;
import java.io.*;
import java.math.*;
import java.net.Inet4Address;
import java.security.*;
import java.text.*;
import java.time.chrono.MinguoChronology;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.

    static int sockMerchant(int n, int[] ar) {
//            // Complete this function
//            Arrays.sort(ar);
        int count = 0;
//            for(int i=0;i<n-1;i++){
//                if(ar[i]==ar[i+1]){
//                    count=count+1;
//                    i=i+1;
//                }
//            }

//        }
        return 0;
    }


    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        for (String s : magazine) {
            if (!magazineMap.containsKey(String.valueOf(s))) {
                magazineMap.put(String.valueOf(s), 1);
            } else {
                int count = magazineMap.get(String.valueOf(s)) + 1;
                magazineMap.put(String.valueOf(s), count);
            }
        }
        for (String s : note) {
            if (magazineMap.containsKey(s)) {
                int count = magazineMap.get(s);
                if (count > 0) {
                    count = count - 1;
                    magazineMap.put(s, count);
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                    break;
                }
            } else {
                System.out.println("No");
                break;
            }
        }


    }


    static int sherlockAndAnagrams(String s) {

        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int stringLength = 1;

            for (int j = i; j < s.length() - 1; j++) {

                LinkedList<String> perCharacter = new LinkedList<>();

                // 비교할 기준이 될 문자 만듦
                for (int k = i; k < i + stringLength; k++) {
                    perCharacter.add(String.valueOf(s.charAt(k)));
                }
                //그걸로 이제 비교들어가자
                for (int k = i + 1; k < s.length(); k++) {
                    boolean matchFlag = true; //맞으면 matching 되면 flag 바꿔줄꺼야. 이게 있는 이유?
                    LinkedList<String> dummyCharacter = new LinkedList<>();

                    // 체크할 문자길이가 실제 문자길이보다 길어지면 break
                    if (k + stringLength > s.length()) {
                        break;
                    }

                    // 깊은 복사를 위해서 직접 for문 돌림
                    // 비교하려는 문자열을 원상태로 되돌려 비교하기 위해
                    for (int l = 0; l < perCharacter.size(); l++) {
                        dummyCharacter.add(perCharacter.get(l));
                    }

                    // 기준되는 문자열과 만들어지는 문자열들을 비교
                    for (int l = k; l < k + stringLength; l++) {
                        String comparingChar = String.valueOf(s.charAt(l));

                        // 알파벳 순서가 달라도 존재만 하면 되기 때문에
                        // 존재 유무를 체크해서 remove
                        if (dummyCharacter.contains(comparingChar)) {

                            dummyCharacter.remove(comparingChar);
                        }
                        // 존재하지 않는 틀린 문자가 나오면 더이상 비교가 필요없이 Anagram에서 탈락
                        else {
                            matchFlag = false;
                            break;
                        }
                    }

                    if (matchFlag) {
                        result++;
                    }

                }
                stringLength++;

            }

        }
        System.out.println(result);
        return result;
    }

    static long countTriplets(List<Long> arr, long r) {
        // 비교군 생성
        long count = 0;
        int stringLength = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            // 비교하는데, 비교하는 비교군 갯수 위에 비교군이랑 동일해야함.
//            int stringLength=0;
            System.out.println("---------------- " + stringLength + "---------------- ");
            List list = new ArrayList();
            boolean flag = false;
            // 세트 하나 만들기
            for (int j = 0 + stringLength; j < 3 + stringLength; j++) {
                list.add(Long.valueOf((long) Math.pow(r, j)));
                System.out.println("확인" + list.toString() + "이거뭐니" + Math.pow(r, j));
            }
            System.out.println("list " + list);
            // 세트에 들어간 성분이 list에 있는지 확인.
            for (int k = 0; k < list.size(); k++) {
                System.out.println(k + " arr.contains(list.get(k)) " + arr.contains(list.get(k)));
                System.out.println("list.get(k) " + list.get(k));
//                System.out.println("list.get(k)" + list.get(k));
                if (arr.contains(list.get(k))) {
//                    flag= true;
                    count++;

                } else {
//                    flag= false;
                }
            }
            stringLength++;
        }
        System.out.println("count " + count);
        return count;

    }

    static int activityNotifications(int[] expenditure, int d) {
        int count = 0;


//        for(int i =0; i<expenditure.length-d; i++){
//            List<Integer> list = new ArrayList<Integer>();
//            for(int j =i; j<i+d){
//
//            }
//
//        }

        return count;

    }

    static int alternatingCharacters(String s) {
        int count = 0;
        List<String> list = new ArrayList<String>();
        String[] arr = s.split("");
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println("확인" + list.toString());
        for (int j = 1; j < list.size(); j++) {
            System.out.println("1" + list.get(j - 1));
            System.out.println("1" + list.get(j));
            if (list.get(j - 1).equals(list.get(j))) {
                count++;
            }
        }
        return count;
    }

    static String isValid(String s) {
        Map<String, Integer> map = new HashMap<>();
        String[] arr = s.split("");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) == false) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }

        }
        int sum = arr.length;
        int keysize = map.size();
        int freq = 0;
        for (int k = 1; k < map.size() - 1; k++) {
            if (map.get(arr[k]).equals(map.get(arr[k + 1])) && map.get(arr[k + 1]).equals(map.get(arr[k + 2]))) {
                freq = map.get(arr[k]);
            }
        }
        if ((sum % keysize) == 0) {
            result = "YES";
        } else if ((sum % keysize) == 1 || ((sum + freq) % keysize) == 1) {
            System.out.println("확인이용" + map.toString());
            for (int k = 1; k < arr.length; k++) {
                System.out.println("확인" + arr[k] + "-" + arr[k - 1]);
                System.out.println("확인" + map.get(arr[k]) + "-" + map.get(arr[k - 1]));
                if (Math.abs(map.get(arr[k]) - map.get(arr[k - 1])) > 1) {
                    result = "NO";
                    break;
                }
//                }else {
//                    result = "YES";
//                }
            }
        } else {
            result = "NO";
        }
        System.out.println(result);
        return result;

    }

    static int minimumAbsoluteDifference(int[] arr) {
        // 순서 정렬
        // -3 1 17 68 71
        for(int i=0;i <arr.length; i++){
            System.out.println("arr" + arr[i]);
        }
        System.out.println("-----------------");
        Arrays.sort(arr);

        for(int i=0;i <arr.length; i++){
            System.out.println("arr" + arr[i]);
        }


        int min = Math.abs(arr[arr.length-1]-arr[0]);
        int a = 1;
        int b = -3;

        System.out.println("계산 " + Math.abs(b-a));
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i]-arr[i-1]);
            System.out.println("diff" + diff);
            if (diff < min) {
                min = diff;
            }
        }
        System.out.println("min"+min);

        return min;
    }

    static int luckBalance(int k, int[][] contests) {

        //중요한것중에 가장 작은것을 구해서 마지막에 빼고 나머지는 다 더한다.
        int result=0;
        //중요한것과 중요하지 않은것 분리

        List<Integer> important = new ArrayList<>();
        List<Integer> soso = new ArrayList<>();
        for (int i = 0; i < contests.length; i++) {
            if(contests[i][1] == 1){
                important.add(contests[i][0]);
            }else if(contests[i][1] ==0){
                soso.add(contests[i][0]);
            }
        }
        important.sort(null);
        int size = important.size()-k;
        for (int w = 0; w <size; w++) {
            important.set(w, important.get(w)*-1);
        }

        for (int j = 0; j < important.size(); j++) {
            result=result+important.get(j);
        }

        for (int p = 0; p < soso.size(); p++) {
            result = result+soso.get(p);
        }
        System.out.println("important" +  important.toString());
        System.out.println("soso" +  soso.toString());
        System.out.println("result :: " + result);
        return result;
    }
    static int getMinimumCost(int k, int[] c) {
        int cost=0;
        if(c.length==k){
            for (int i = 0; i < c.length; i++) {
                cost = cost + c[i];
            }
        }else{
            List<Integer> list = new ArrayList<>();
            System.out.println("list :: " + list.toString());
            for (int j = 0; j < c.length; j++) { list.add(c[j]); }
            list.sort(Comparator.reverseOrder());
            System.out.println("list :: " + list.toString());
            int purchasecount = 1;
            for (int w = 0; w < list.size(); w++) {
                System.out.println("------------"+w+"--------------");
                int price = purchasecount*list.get(w);
                cost= cost + price;
                System.out.println("cost :: "+cost);
                if( w>0 && (w+1)%k==0){
                    purchasecount++;
                }
                System.out.println("purchasecount :: "+purchasecount);
            }
        }
        System.out.println("cost*** " + cost);
        return cost;

    }

    static int makeAnagram(String a, String b) {
//        String[] arra = a.split("");
//        String[] arrb = b.split("");
//        int count = 0;
//        Map<String, Integer> mapa = new HashMap<>();
//        Map<String, Integer> mapb = new HashMap<>();
////mapa 만들기
//
//        for(int i=0; i<arra.length; i++){
//            if(mapa.containsKey(arra[i])){
//                mapa.put(arra[i],mapa.get(arra[i])+1);
//            }else {
//                mapa.put(arra[i],1);
//            }
//        }
////mapb 만들기
//        for(int j=0; j<arrb.length; j++){
//            if(mapb.containsKey(arrb[j])){
//                mapb.put(arrb[j],mapb.get(arrb[j])+1);
//            }else {
//                mapb.put(arrb[j],1);
//            }
//        }
//        if(arra.length > arrb.length){
//            Map<String, Integer> maptemp = new HashMap<>();
//            maptemp = mapa;
//            mapa =mapb;
//            mapb =maptemp;
//        }
//
//        System.out.println("확인 :: " + mapa.toString());
//        System.out.println("확인 :: " + mapb.toString());
////만들어서 홀수개 count 넣기
//
//            for(int k=0; k<arrb.length; k++){
//                System.out.println("--------------- " +k+"-----------------");
//                // mapa랑 mapb랑 같은 내용이 있고, 짝수홀수개면 count올림.
//                System.out.println("arrb[k] :: " + arrb[k]);
//                System.out.println("mapa.get(arrb[k]) :: " + mapa.get(arrb[k]));
//                System.out.println("mapb.get(arrb[k]) :: " + mapb.get(arrb[k]));
//                System.out.println("mapa.containsKey(arrb[k]) :: " + mapa.containsKey(arrb[k]));
//                System.out.println("mapa.containsKey(arrb[k]) :: " + mapb.containsKey(arrb[k]));
//
//                if(mapa.get(arrb[k]) == null || mapb.get(arrb[k]) ==null ){
//                    System.out.println("여기가 count 들어가야행");
//                    count++;
//
//                }else {
//                    int check=0;
//                    check = mapa.get(arrb[k]) + mapb.get(arrb[k]);
//                    if((check %2) ==1){
//                        System.out.println("여기는 홀수여서 count 올렷");
//                        count++;
//                    }
//                }
//                if(mapb.get(arrb[k]) !=null){
//                    mapb.remove(arrb[k]);
//                    System.out.println("여기는 삭제도 하자");
//                }
//                System.out.println("count" + count);
//            }
//        System.out.println("확인 :: " + mapa.toString());
//        System.out.println("확인 :: " + mapb.toString());
//            count = count + mapb.size();
//
//        System.out.println("count" + count);
        int count = 0;
        int[] alphabet = new int[26];
        for (char c : a.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            alphabet[c - 'a']--;
        }
        for (int i : alphabet) {
            count += Math.abs(i);
        }
        System.out.println("count" + count);
        return count;
    }

    static int maxMin(int k, int[] arr) {

        //k개씩 list 만들고
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        list.sort(null);

        int min = list.get(k-1)- list.get(0);
        System.out.println("list :: " + list.toString());
        for (int i = 0; i < list.size()-k; i++) {
            System.out.println("i :: " + i + " = " + list.get(i));
            for (int j = i+k; j < list.size(); j++) {
                System.out.println("j :: " + j + " = "+ list.get(j));
                int dif = list.get(j) - list.get(i);
                if(dif>0){
                    min = Math.min(dif, min);
                }
            }

        }
        System.out.println("min :: " + min);
        return min;
    }

    static void whatFlavors(int[] cost, int money) {
//        Arrays.sort(cost);
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int k = 0; k < cost.length; k++) {

            int findcost = money- cost[k];
            for (int i = k; i < cost.length; i++) {
                System.out.println("cost[k] :: "+ cost[k] );
                System.out.println("cost[i] :: "+ cost[i] );
                if(cost[i] == findcost){
                    System.out.println((k+1) + " " +(i+1));
                    return;
                }
            }

        }

//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//            entry.getValue();
//        }

//        for (int i = 0; i <cost.length-1 ; i++) {
//            for (int j = i+1; j < cost.length; j++) {
//                System.out.println("cost[i] :: "+ cost[i] );
//                System.out.println("cost[j] :: "+ cost[j] );
//                if(cost[j] < money && cost[i] < money){
//                    sum = cost[j] + cost[i];
//                    if(sum == money){
//                        System.out.println(":: " + Math.min(i+1, j+1) +" "+ Math.max(i+1,j+1));
//
//                        return;
//                    }
//                }
//            }
//        }

    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
//        int result = sockMerchant(n, ar);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//        String m = "ive got a lovely bunch of coconuts";
//        String n = "ive got some coconuts";
//        String[] magazine = m.split("");
//        String[] note = n.split("");
//        checkMagazine(magazine, note);
//        int result = sherlockAndAnagrams("abba");
        long r = 2;

//        List<Long> arr = new LinkedList<>();
//        arr.add(Long.valueOf(1));
//        arr.add(Long.valueOf(2));
//        arr.add(Long.valueOf(2));
//        arr.add(Long.valueOf(4));
//        System.out.println("arr"+ arr.toString());
//        long ans = countTriplets(arr, r);

        //fcrxzwscanmligyxyvym
        //jxwtrhvujlmrpdoqbisbwhmgpmeoke
        String a = "fcrxzwscanmligyxyvym";
        String b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";

        int[] arr = new int[10];
        arr[0] = -59;
        arr[1] = -36;
        arr[2] = 13;
        arr[3] = 1;
        arr[4] = -53;
        arr[5] = -92;
        arr[6] = -2;
        arr[7] = -96;
        arr[8] = -54;
        arr[9] = 75;

//        int result = minimumAbsoluteDifference(arr);

//        int k=5;
//        int[][] contests = new int[8][2];
//        contests[0][0] = 13; contests[0][1] = 1;
//        contests[1][0] = 10; contests[1][1] = 1;
//        contests[2][0] = 9; contests[2][1] = 1;
//        contests[3][0] = 8; contests[3][1] = 1;
//        contests[4][0] = 13; contests[4][1] = 1;
//        contests[5][0] = 12; contests[5][1] = 1;
//        contests[6][0] = 18; contests[6][1] = 1;
//        contests[7][0] = 13; contests[7][1] = 1;
//
//
//        int result = luckBalance(k, contests);
        int k = 4;
        int[] c = new int[3];
        c[0] = 2;
        c[1] = 5;
        c[2] = 6;
//        int minimumCost = getMinimumCost(k, c);
        int[] arr1 = new int[10];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 10;
        arr1[5] = 20;
        arr1[6] = 30;
        arr1[7] = 40;
        arr1[8] = 100;
        arr1[9] = 200;


//        int result = maxMin(k, arr1);
        int money= 4;
        int[] cost = new int[5];
        cost[0] = 1;
        cost[1] = 4;
        cost[2] = 5;
        cost[3] = 3;
        cost[4] = 2;
//        whatFlavors(cost, money);



//        int res = makeAnagram(a, b);
//        String result = isValid("aaaaabc");
//        scanner.close();
    }

}
