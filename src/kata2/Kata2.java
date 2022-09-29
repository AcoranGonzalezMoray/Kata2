package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        int[] data = {1,2,3,4,1,2,4,6,7,8,2, 8, 6, 6, 7};
        
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i])+1:1);
        }
        
        for(Map.Entry<Integer, Integer> entry: histogram.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        
        
        
    }
    
}
