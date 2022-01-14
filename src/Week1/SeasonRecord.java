package Week1;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result2 {
    static void Evaluate(List<Integer> scores){
        int small = scores.get(0);
        int big = scores.get(0);
        List<Integer> count=new ArrayList<Integer>();
        count.add(0,0);
        count.add(1,0);
        for (int i = 0; scores.size() > i; i++) {
            if (scores.get(i) < small) {
                count.set(0,count.get(0)+1);
                small = scores.get(i);
            }
            else if (scores.get(i) > big) {
                count.set(1,count.get(1)+1);
                big = scores.get(i);
            }
        }
        for(int i = 1;i>=0; i--) {
            System.out.print(count.get(i) + " ");
        }
    }

}

public class SeasonRecord {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        Result2.Evaluate(arr);

        bufferedReader.close();
    }
}
