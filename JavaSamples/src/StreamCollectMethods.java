import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author rishiraj
 * 20211117
 * to demonstrate various collection methods of Stream API.
 */

public class StreamCollectMethods {
	public static void main(String[] args) {
		
		List<Person> pList = List.of(new Person("Bone",22)
		,new Person("Anne",11)
		,new Person("Chad",33)
		,new Person("Elena",55)
		,new Person("Frank",66)
		,new Person("Dan",44)		); 
		
		//.collect(Collectors.toList())
		pList.stream().collect(Collectors.toList());
		
		//.collect(Collectors.toCollection(::new));
		pList.stream().collect(Collectors.toCollection(ArrayList::new));
		
		//.collect(Collectors.groupingBy(Person::age));
		pList.stream().collect(Collectors.groupingBy(Person::age));
		
		//.collect(Collectors.groupingBy(Person::age,Collectors.counting()));
		pList.stream().collect(Collectors.groupingBy(
				Person::age	,Collectors.counting()
				));
		
		/*.collect(Collectors.groupingBy(Person::age,
				Collectors.mapping(
					Person::name,
					Collectors.toList()
				)));*/
		pList.stream().collect(Collectors.groupingBy(
				Person::age	,Collectors.mapping(Person::name, Collectors.toList())
				));
		
		//.collect(Collectors.partitioningBy(p -> p.age()>43));
		pList.stream().collect(Collectors.partitioningBy(p -> p.age()>23));
		
		//.collect(Collectors.groupingBy(Person::age,Collectors.summingInt(Person::age)));
		pList.stream().collect(Collectors.groupingBy(
				Person::age	,Collectors.summingInt(Person::age)
				));
		
		//.collect(Collectors.groupingBy(Person::age,Collectors.averagingInt(Person::age)));
		pList.stream().collect(Collectors.groupingBy(
				Person::age	,Collectors.averagingInt(Person::age)
				));
		
		//.collect(Collectors.counting());
		pList.stream().collect(Collectors.counting());
		
		//.collect(Collectors.joining("'"));
		pList.stream().map(p -> p.name()).collect(Collectors.joining(" with "));
		
		//.collect(Collectors.maxBy( (a1,a2) -> a1.age() - a2.age() ));
		pList.stream().collect(
				Collectors.maxBy(
							(p1,p2) -> p1.age() - p2.age()
						)
				);
		
	}
}
record Person(String name, int age) {}
