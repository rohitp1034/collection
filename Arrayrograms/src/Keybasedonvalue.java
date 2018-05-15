import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Keybasedonvalue {
	public static void main(String[] args) {
		
	HashMap<Integer, String>hm=new HashMap<Integer, String>();
	hm.put(1, "rohit");
	hm.put(2, "sushil");
	hm.put(1, "raj");
	hm.put(4, "rohit");
	hm.put(5, "rohit");

	
	
	
	
	System.out.println("elements are \n"+hm);
	System.out.println(Keyfromvalue(hm, "rohit"));
	
	
		
	}

	public static Object Keyfromvalue(HashMap hm,Object val)
	{
	 List <Integer> keylist = new ArrayList<>();
	 
		for(Object o:hm.keySet())
		{
			if(hm.get(o).equals(val))
			{
				
				keylist.add((Integer) o);
				
			}
		}
			
		return keylist;
		
		
		
		
	}


}