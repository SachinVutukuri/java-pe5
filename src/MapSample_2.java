import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapSample_2 {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split("[^a-zA-Z]");
        Map<String,Integer> mp=new HashMap<String, Integer>();
        for(String temp:s)
        {
            if(!mp.containsKey(temp))
                mp.put(temp,1);
            else
                mp.put(temp,mp.get(temp)+1);

        }
        mp.remove("");
        System.out.print(mp);
    }
}
