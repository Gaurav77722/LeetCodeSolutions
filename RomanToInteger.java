import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<String,Integer> romanMap = new HashMap<>();
        romanMap.put("I",1);
        romanMap.put("V",5);
        romanMap.put("X",10);
        romanMap.put("L",50);
        romanMap.put("C",100);
        romanMap.put("D",500);
        romanMap.put("M",1000);

        int []values = new int[s.split("").length];
        int idxCounter = 0;

        for(String r: s.split("")){
            values[idxCounter] = romanMap.get(r);
            idxCounter++;
        }

        int result = 0;

        for(int i=0;i< values.length; i++){
            if((i+1)< values.length && values[i]< values[i+1]){
                result -= values[i];
            }
            else{
                result+=values[i];
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
