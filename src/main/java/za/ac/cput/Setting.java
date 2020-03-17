package za.ac.cput;

import java.util.HashSet;
import java.util.Set;

public class Setting {
    Set<String> set = new HashSet<String>();

    public void addSet(String str){
        set.add(str);
    }

    public void getAll(){
        for (String string : set) {
            System.out.println(string);
        }
    }

    public void removeSelection(String str){
        set.remove(str);
    }
    public void removeAll(){
        set.clear();
    }


}
