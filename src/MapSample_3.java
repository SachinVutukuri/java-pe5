import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapSample_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        String str=sc.nextLine();
        String[] s=str.split(" ");
        for(String next:s)
        {
            if(!wordCounts.containsKey(next))
                wordCounts.put(next,1);
            else
                wordCounts.put(next,wordCounts.get(next)+1);
        }
        Map<String,Boolean> hmap = new HashMap<String, Boolean>();
        for(Map.Entry<String,Integer> entry:wordCounts.entrySet())
            if(entry.getValue()>1)
                hmap.put(entry.getKey(),true);
            else
                hmap.put(entry.getKey(),false);
        System.out.print(hmap);
    }
}
