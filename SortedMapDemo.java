import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortedMapDemo{
    public static void main(String args[]){
        Map<String, Integer> map = new TreeMap<>();
        ArrayList<String>  words = new ArrayList<>();
        for(String word : words) {
            map.compute(word, (key, val) -> val == null ? 1 : ++val);
        }
        int k=1;
        
        map.keySet().stream()
                  .sorted((a, b) -> Integer.compare(map.get(b), map.get(a)))
                  .limit(k)
                  .collect(Collectors.toList());
    }
}
