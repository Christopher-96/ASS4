package za.ac.cput;

import java.util.ArrayList;
import java.util.List;

public class Collecting {
    List<String> arrayList = new ArrayList<String>();


    public void addList(String str){
        arrayList.add(str);
    }
    public void addList(int i,String str){
        arrayList.add(i, str);
    }
    public void clearList(){
        arrayList.clear();
    }

    public void getAllList(){
        for (String string : arrayList) {
            System.out.println(string);
        }
    }

    public void removeSelected(String str){
        arrayList.remove(str);
    }
    public void removeSelected(int i){
        arrayList.remove(i);
    }
}
