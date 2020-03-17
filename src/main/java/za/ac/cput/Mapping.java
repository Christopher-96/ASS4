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
        System.out.println();
    }

    public void searchK(String k){
        String searchKey = k;
        if (map.containsKey(searchKey))
            System.out.println("Found  " + map.get(searchKey) + " " + searchKey + "\n");
    }

    public void searchV(int v){
        int searchValue = v;
        if (map.containsKey(searchValue))
            System.out.println("Found  " + map.get(searchValue) + " " + searchValue + "\n");
    }

    public void clearAll(){
        map.clear();
    }
}
