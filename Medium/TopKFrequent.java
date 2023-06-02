package Medium;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        topKFrequent(new int[]{4,1,-1,2,-1,2,3}, 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        List<List<Integer>>bucket = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();

        for(int i=0; i<nums.length+1; i++){
            bucket.add(i,new ArrayList<>());
        }

        for(int i : nums){
            count.put(i,count.getOrDefault(i,0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            bucket.get(entry.getValue()).add(entry.getKey());
        }


        int i = bucket.size()-1;
        while(k>0 && i>=0){
            if(!bucket.get(i).isEmpty()){
                output.addAll(bucket.get(i));
                k = k - bucket.get(i).size();
            }
            i--;
        }

        int []arr = new int[output.size()];

        for(int j=0; j<output.size();j++){
            arr[j] = output.get(j);
        }

        return arr;




    }


}
