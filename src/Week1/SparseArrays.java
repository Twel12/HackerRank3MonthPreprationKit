package Week1;
import java.util.*;

class Calculate{
    public static int[] list = {0,0,0};
    static void matchingStrings(List<String> strings, List<String> queries) {
        int length=queries.size();
        int[] list = new int[length];
        for(int i=0;i<length;i++){
            list[i]=0;
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<strings.size();j++){
                if(queries.get(i).equals(strings.get(j))){
                    list[i]++;
                }
            }
        }
        for (int j : list) {
        
        }
    }
}

    public class SparseArrays {
    public static void main(String[] args) throws NullPointerException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        int k = scanner.nextInt();
        String[] queries = new String[k];
        for (int i = 0; i < k; i++) {
            queries[i] = scanner.next();
        }
        Calculate.matchingStrings(Arrays.asList(strings), Arrays.asList(queries));

    }
}

