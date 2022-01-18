package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Solv {
    static void Solution(List<Integer> arr) {
        arr.sort(Integer::compareTo);
        for(int i=0;i<arr.size();i++){
            int sum=0;
            for(int j=0;j<arr.size();j++){
                if(i!=j){
                    if(arr.get(i)==arr.get(j)){
                        sum+=1;
                    }
                }
            }
            if(sum==0){
                System.out.println(arr.get(i));
            }
        }
        }
    }

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt).collect(toList());
        Solv.Solution(arr);
    }
}
