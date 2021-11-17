import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author rishiraj
 * 20211117
 * to demostrate various collection methods of Stream API.
 */

public class StreamCollectMethods {
	public static void main(String[] args) {
		
		List<Person> pList = List.of(new Person("Bone",22)
		,new Person("Anne",11)
		,new Person("Chad",33)
		,new Person("Elena",55)
		,new Person("Frank",66)
		,new Person("Dan",44)		); 
		Stream<Person> stream = pList.stream();
		
		//.collect(Collectors.toList())
		stream.collect(Collectors.toList());
		
		//.collect(Collectors.toCollection(::new));
		stream.collect(Collectors.toCollection(ArrayList::new));
		
		//.collect(Collectors.groupingBy(Person::getAge));
		stream.collect(Collectors.groupingBy(Person::getAge));
		
		//.collect(Collectors.groupingBy(Person::getAge,Collectors.counting()));
		stream.collect(Collectors.groupingBy(
				Person::getAge	,Collectors.counting()
				));
		
/*		.collect(Collectors.groupingBy(Person::getAge,
				Collectors.mapping(
					Person::getName,
					Collectors.toList()
				)));*/
		stream.collect(Collectors.groupingBy(
				Person::getAge	,Collectors.mapping(Person::getName, Collectors.toList())
				));
		
		//.collect(Collectors.partitioningBy(p -> p.getAge()>43));
		stream.collect(Collectors.partitioningBy(p -> p.getAge()>23));
		
		//.collect(Collectors.groupingBy(Person::getAge,Collectors.summingInt(Person::getAge)));
		stream.collect(Collectors.groupingBy(
				Person::getAge	,Collectors.summingInt(Person::getAge)
				));
		
		//.collect(Collectors.groupingBy(Person::getAge,Collectors.averagingInt(Person::getAge)));
		stream.collect(Collectors.groupingBy(
				Person::getAge	,Collectors.averagingInt(Person::getAge)
				));
		
		//.collect(Collectors.counting());
		stream.collect(Collectors.counting());
		
		//.collect(Collectors.joining("'"));
		stream.map(p -> p.getName()).collect(Collectors.joining(" with "));
		
		//.collect(Collectors.maxBy( (a1,a2) -> a1.getAge() - a2.getAge() ));
		stream.collect(
				Collectors.maxBy(
							(p1,p2) -> p1.getAge() - p2.getAge()
						)
				);
		
	}
}
class Person {
	private String name;
	private int age;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
