import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview {
  
  public static List<Object> getKeysFromValue(Map<Integer, String> hm, Object value){
    List <Object>list = new ArrayList<Object>();
    for(Object o:hm.keySet()){
        if(hm.get(o).equals(value)) 
        {
            list.add(o);
        }
    }
    return list;
  }
  

  public static void main(String[] argv) {
    Map<Integer, String> map = new HashMap<Integer, String>();
    map.put(1,"Home");
    map.put(2,"sweet");
    map.put(3,"Home");
    map.put(4,"ssssss");
    map.put(5,"Home");
    
    
    System.out.println(map);
    System.out.println(Interview.getKeysFromValue(map,"Home"));
  }
}
