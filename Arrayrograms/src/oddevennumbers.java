import java.util.ArrayList;
import java.util.Arrays;

public class oddevennumbers {
	  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		String[] stringArr = new String[arrayList.size()];
		arrayList.toArray(stringArr);
		for (String s : stringArr)
		System.out.println(s);


}}