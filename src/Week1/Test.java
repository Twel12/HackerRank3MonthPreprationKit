package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result3{
    static void Evaluate(List<Integer> scores){
        //sort the scores in ascending order
        scores.sort(Integer::compareTo);
        double length = scores.size()/2;
        int kek = scores.get((int)length);
        System.out.println(kek);
    }
}
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Result3.Evaluate(arr);

        bufferedReader.close();
    }
}
