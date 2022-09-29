package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {

        int[] data = {1,2,3,4,1,2,4,6,7,8,2, 8, 6, 6, 7};
        HistogramGenerator histo = new HistogramGenerator(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        

        
        for(Map.Entry<Integer, Integer> entry: histogr.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        
        
        
    }
    
}
