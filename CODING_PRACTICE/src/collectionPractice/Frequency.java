package collectionPractice;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
 
public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 3, 4, 4);
        
        List<Integer> uniqueElements = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
 
        for (int num : list) {
            int index = uniqueElements.indexOf(num);
            if (index != -1) {
                counts.set(index, counts.get(index) + 1);
            } else {
                uniqueElements.add(num);
                counts.add(1);
            }
        }
        for (int i = 0; i < uniqueElements.size(); i++) {
            System.out.println(uniqueElements.get(i) + ": " + counts.get(i));
        }
    }
}
