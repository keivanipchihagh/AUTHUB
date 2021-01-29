import java.util.ArrayList;
import java.util.HashMap;

public class JavaTypeInfer {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>(); // From JDK 7
		HashMap<String, ArrayList<String>> myMap = new HashMap<String, ArrayList<String>>();
		HashMap<String, ArrayList<String>> myMap2 = new HashMap<>(); // From JDK 7
		ArrayList list3 = new ArrayList();
	}

}
