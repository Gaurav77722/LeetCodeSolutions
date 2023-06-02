import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> anagram = new HashMap<>();



        for(String i: strs){
            char[] characters = new char[26];
            for(char c : i.toCharArray()){
                characters[c - 'a']++;
            }
            String key = String.valueOf(characters);

            if(!anagram.containsKey(key)){
                anagram.put(key, new ArrayList<>());
            }
            anagram.get(key).add(i);
        }

        List<List<String>> output = new ArrayList<>(anagram.values());

        return output;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

}
