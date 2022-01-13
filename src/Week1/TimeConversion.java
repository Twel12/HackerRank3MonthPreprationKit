package Week1;
import java.io.*;

class Result1 {
    static String getTime(String s){
        StringBuilder k = new StringBuilder();
        for(int i = 0; i <2; i++){
            k.append(s.charAt(i));
        }
        String Meridian = (s.charAt(s.length()-2) +""+ s.charAt(s.length()-1));
        int time = Integer.parseInt(k.toString());
        if(Meridian.equals("PM") && time != 12){
            time = time + 12;
        }
        else if(Meridian.equals("AM") && time == 12){
            time = 00;
        }

        String time1 = String.valueOf(time);
        for(int i = 2; i < s.length()-2; i++){
            time1 = time1 + s.charAt(i);
        }
        if(time < 10){
            time1 = "0" + time1;
        }
        return time1;
    }

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine().trim();

        System.out.println(Result1.getTime(s));
    }
}
