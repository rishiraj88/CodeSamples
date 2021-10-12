import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayInteraction {
public static void main(String[] args) {
	String[] sArr1 = {"dsff","ere"};
	String[] sArr2 = {"dsff","eres"};
	System.out.println("String array one: "+Arrays.toString(sArr1));
	System.out.println("String array two: "+Arrays.toString(sArr2));
	
	Set<String> setA = new HashSet<String>(Arrays.asList(sArr1));
	Set<String> setB = new HashSet<String>(Arrays.asList(sArr2));

	setA.retainAll(setB);
	System.out.println("Common elements in arrays: "+setA);
	
}
}
