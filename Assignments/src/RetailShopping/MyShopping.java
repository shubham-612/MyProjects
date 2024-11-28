package RetailShopping;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyShopping {

	HashMap<Integer, Integer> hm = new HashMap<>();
	
	public static void main(String[] args) {
		
		MyItem p1 = new MyItem(1, "Biscuits", 10, 001);
		MyItem p2 = new MyItem(2, "Shakes", 50, 002);
		MyItem p3 = new MyItem(3, "Beverages", 40, 003);
		MyItem p4 = new MyItem(1, "Biscuits", 10, 004);
		
		public int isInventEmpty() 
		{
			if(hm.isEmpty())
			{
				return 0;
			}
			else
			{
				return 1;
			}
		}
		
		public void AddUpdate(int id)
		{
			Set<Map.Entry<Integer, Integer >> m2= hm.entrySet();
		    for(Map.Entry<Integer, Integer> i:m2)
		    { 
		    	i.getKey();
		    	i.getValue();
		    }
		    if(getKey()==id)
		    {
		    	int qty =  hm.getValue()+1;
		    	hm.put(id,qty);
		    }
		}
	}
}
