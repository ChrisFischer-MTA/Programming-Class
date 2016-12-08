package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistfun {
    
    static ArrayList s = makeList();
    
    public static void main(String[] args){
        System.out.println(s.size());
        for(int i = 0; i < s.size(); i++)
            System.out.println(s.get(i));
    }

    public static ArrayList<String> makeList() {
        ArrayList newList = new ArrayList();
        newList.addAll(Arrays.asList(new String(" The Curse of the Black Pearl, Dead Man's Chest, At Worlds End, On Stranger Tides, Platoon, Transformers, Transformers 2, The Matrix, The Matrix 2, The Matrix 3").split(",")));
        return newList;
    }

    public static int whereIs(ArrayList<String> ray, String target) {
        for(int i = 0; i < ray.size(); i++){
            if(ray.get(i).equals(target))
                return i;
        }
        return -1;
    }

    public static ArrayList<String> insertionSort(ArrayList<String> ray) {
        return s;
    }

    public static void selectionSort(ArrayList<String> ray) {
    }
}
