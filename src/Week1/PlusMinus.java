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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double k=0,l=0,m=0;
        for (Integer integer : arr) {
            if (integer > 0) {
                k++;
            }
            else if(integer < 0) {
                l++;
            }
            else {
                m++;
            }
        }
        System.out.format("%.5g%n", k/arr.size());
        System.out.format("%.5g%n", l/arr.size());
        System.out.format("%.5g%n", m/arr.size());

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}