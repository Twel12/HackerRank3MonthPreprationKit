package Week1;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Evaluation {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static void divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count=0;
        for(int i=0;i<ar.size();i++){
            for(int j=i+1;ar.size()>j;j++){
                if ((ar.get(i)+ar.get(j))%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}

public class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());


        List<Integer> arr2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Evaluation.divisibleSumPairs(arr.get(0),arr.get(1),arr2);

    }
}
