package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {

        String [] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        HistogramGenerator histo = new HistogramGenerator(data);
        Map<String, Integer> histogr = histo.getHistogram();
        

        
        for(Map.Entry<String, Integer> entry: histogr.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
        
        
        
    }
    
}
