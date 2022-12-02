package geekbrains;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(90, 7, 320, 65, 2, 14));
        System.out.println(removeEvenNum(list));
    }

    public static List<Integer> removeEvenNum (List<Integer> list ) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 == 0){
                newList.add(i);
            }
        }
        list.removeAll(newList);
        return list;
    }
}
