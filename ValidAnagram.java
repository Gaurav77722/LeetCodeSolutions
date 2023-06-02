import java.util.HashMap;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<String,Integer> sHash = new HashMap<>();
        HashMap<String,Integer> tHash = new HashMap<>();
        for(String i:s.split("")){
            sHash.put(i,sHash.getOrDefault(i,0) + 1);
        }
        for(String i:t.split("")){
            tHash.put(i,tHash.getOrDefault(i,0) + 1);
        }
        
        if(sHash.equals(tHash)){
            return true;
        }
        return false;
    }
}
