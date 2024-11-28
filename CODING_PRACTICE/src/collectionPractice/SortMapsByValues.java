package collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMapsByValues {

	public static void main(String[] args) {
		Map<String,Integer>h=new HashMap<>();
		h.put("soum", 2);
		h.put("shubham", 1);
		h.put("aarti", 3);
		
		List<Map.Entry<String,Integer>>l=new ArrayList<>(h.entrySet());
		l.sort(Map.Entry.comparingByValue());
		
		for(Map.Entry<String,Integer>n:l)
		{
			System.out.println(n.getKey()+":"+n.getValue());
		}
		


	}

}
