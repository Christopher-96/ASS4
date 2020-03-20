package za.ac.cput;

import java.util.HashMap;
import java.util.Map;


public class Mapping {
    Map<String, Integer> map = new HashMap<>();

    public void addKV(String k,Integer v){
        map.put(k,v);
    }

    public void getAllKV(){
        for (String key : map.keySet())
            System.out.println(key + " - " + map.get(key));
    }

    public int searchK(String k){
        String searchKey = k;
        int result= 0;
        if (map.containsKey(searchKey)){
            result =map.get(searchKey);
        }
        return result;

    }



    public void clearAll(){
        map.clear();
    }
    public int totalMaps(){
        return map.size();
    }
}
