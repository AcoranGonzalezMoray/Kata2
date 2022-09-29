package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author acora
 */
public class HistogramGenerator<T> {
    private final T[] data;

    public HistogramGenerator(T[] valor) {
        this.data= valor;
    }
    
    public Map getHistogram(){
        
        Map<T, Integer> histogram = new HashMap<T, Integer>();
        
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.containsKey(data[i])? histogram.get(data[i])+1:1);
        }
        
        return histogram;
    
    }
}
