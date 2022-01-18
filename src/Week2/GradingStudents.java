package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class Solve {
    static void Solution(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 38) {
                if (arr.get(i) % 5 > 2) {
                    arr.set(i, arr.get(i) + 5-arr.get(i)%5);
                }
            }
        }
    }
}

class sout{
    static void print(List<Integer> arr){
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter the number of marks to be inserted");
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr =new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            //System.out.println("Enter the marks for student ");
            arr.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }
        Solve.Solution(arr);
        sout.print(arr);
    }
}
