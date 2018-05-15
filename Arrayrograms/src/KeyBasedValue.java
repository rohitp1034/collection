import java.util.HashMap;

public class KeyBasedValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String>hmap=new HashMap<String,String>();
		hmap.put("A", "ROHIT");
		hmap.put("B","SUSHIL");
		hmap.put("C","PRATHAMESH");
		hmap.put("A", "SUSHIL");
		hmap.put("E", "ROHIT");
		hmap.put("F", "SUSHIL");
		
		
		System.out.println("elements are in"+hmap);
		System.out.println(Keyfromvalue(hmap, "ROHIT"));
		
	}

	public static Object Keyfromvalue(HashMap hm,Object val)
	{
	
		for(Object o:hm.keySet())
		{
			if(hm.get(o).equals(val))
			{
				return o;
				
			}
		}
			
		return val;
	}
}