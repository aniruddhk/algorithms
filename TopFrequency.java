import java.util.*;
import java.util.stream.Collectors;

public class TopFrequency{
     public static void main(String args[]){
        //declare String[] words, int k
        
        HashMap<String,Integer> map = new LinkedHashMap<>();
         ArrayList<String> words = new ArrayList<>();
        for(String i: words){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int k=5;
        
         LinkedHashMap<String,Integer> sortedMap = map.entrySet().stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                  (e1, e2) -> e1, LinkedHashMap::new));
        
         sortedMap.keySet().stream().limit(k).collect(Collectors.toList());
    }
}
