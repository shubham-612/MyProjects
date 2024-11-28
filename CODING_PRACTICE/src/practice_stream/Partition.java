package practice_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Partition {

	public static void main(String[] args) {
		
		List <String>list=new ArrayList<>();
		list.add("soum");
		list.add("aditi");
		list.add("shubham");
		list.add("dog");
		Map<Boolean,List<String>>partition=list.stream()
				.collect(Collectors.partitioningBy(x->4>x.length()));
//		System.out.println(partition);
		Set<Map.Entry<Boolean,List<String>>>e=partition.entrySet();
		for(Map.Entry<Boolean, List<String>>e1:e)
		{
			System.out.print(e1.getKey()+" ");
			System.out.println(e1.getValue());
		}
	}
}
