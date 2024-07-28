import java.util.HashMap;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "character";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:str.toCharArray()){
            map.computeIfPresent(c,(key,val)->val+1);
            map.computeIfAbsent(c,x->1);
        }
        for(char c:str.toCharArray()){
            if(map.get(c)==1){
                System.out.println(" -> "+c);
            }
        }
    }
}
