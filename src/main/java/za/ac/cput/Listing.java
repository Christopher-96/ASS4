package za.ac.cput;


import java.util.LinkedList;
import java.util.List;

public class Listing {
    List<String> list = new LinkedList<String>();


    public void addList(String str){
        list.add(str);
    }
    public void addList(int i,String str){
        list.add(i, str);
    }
    public void clearList(){
        list.clear();
    }

    public void getAllList(){
        for (String string : list) {
            System.out.println(string);
        }
    }
    public String getSelecedList(int i){
        return list.get(i);

    }

    public void updateList(int i ,String str){
        list.set(i,str);
    }

    public void removeSelected(String str){
        list.remove(str);
    }
    public void removeSelected(int i){
        list.remove(i);
    }
    public int totalList(){
        return list.size();
    }

}
