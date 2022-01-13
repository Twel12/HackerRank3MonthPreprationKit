package Week1;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Solution {

    static long ArraySum(List<Integer> arr){
        long sum=0;
        for(int z=0;z<arr.size();z++){
            sum+= arr.get(z);
        }
        return sum;
    }

    static long Smallest(List<Integer> arr) {
        long k = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < k) {
                k = arr.get(i);
            }
        }
        return k;
    }

    static long Largest(List<Integer> arr) {
        long k = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > k) {
                k = arr.get(i);
            }
        }
        return k;
    }


    public static void miniMaxSum(List<Integer> arr) {
        long sum = ArraySum(arr);
        System.out.println((sum - Largest(arr)) + " " + (sum - Smallest(arr)));
    }

}

public class Mini_Max_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Solution.miniMaxSum(arr);
        bufferedReader.close();
    }
}
