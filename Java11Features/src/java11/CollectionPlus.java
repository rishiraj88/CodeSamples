package java11;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 
 * @author rishiraj
 * to get arrays out of lists
 */
public class CollectionPlus {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		System.out.println("Integer list: "+integerList);

		ArrayList<String> sList = new ArrayList<>();
		sList.add("3");
		sList.add("4");
		System.out.println("String list: "+sList);

		// JDK 8
		Integer[] integerArr = integerList.stream().toArray(size -> new Integer[size]);
		//System.out.println("Integer array: "+Arrays.toString(integerArr));
		String[] sArr = sList.stream().toArray(size -> new String[size]);


		// JDK 11
		//Integer[] integerArr 
		integerArr = integerList.toArray(size -> new Integer[size]);
		System.out.println("\nInteger array with List.toArray(size -> new Integer[size]: "+Arrays.toString(integerArr));
		integerArr = integerList.toArray(Integer[] :: new);
		System.out.println("Integer array with List.toArray(Integer[] :: new): "+Arrays.toString(integerArr));
		//String[] sArr 
		sArr = sList.toArray(size -> new String[size]);
		System.out.println("\nString array with List.toArray(size -> new String[size]): "+Arrays.toString(sArr));
		sArr = sList.toArray(String[]:: new);
		System.out.println("String array with List.toArray(String[]:: new): "+Arrays.toString(sArr));
		
	}

}
