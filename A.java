package MockQuestions2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that uses the Stream API to filter out all even numbers from a list of integers.
		System.out.println("1. Write a Java program that uses the Stream API to filter out all even numbers from a list of integers.");
		List<Integer> filterEven = Arrays.asList(2,5,4,3,6,8,7,24,25,27);
		filterEven.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
		//Write a Java program that uses the Stream API to convert a list of strings to uppercase
		System.out.println("2. Write a Java program that uses the Stream API to convert a list of strings to uppercase");
		List<String> listToUpperList = Arrays.asList("Jordan", "Ravi", "Meti", "Andrew", "Chris", "Angie");
		listToUpperList.stream().map((s) -> s.toUpperCase()).forEach(System.out::println);
		//Write a Java program that uses the Stream API to find the sum of all elements in a list of integers.
		System.out.println("3. Write a Java program that uses the Stream API to find the sum of all elements in a list of integers.");
		List<Integer> sumList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long sum = sumList.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		//Write a Java program that uses the Stream API to collect all distinct elements from a list of integers into a set.
		System.out.println("4. Write a Java program that uses the Stream API to collect all distinct elements from a list of integers into a set.");
		List<Integer> distinctIntegers = Arrays.asList(2,2,5,3,4,3,7,8,24,7);
		distinctIntegers.stream().distinct().collect(Collectors.toSet()).forEach(System.out::println);
		//Stream API to filter a list of strings that start with the letter "A" and collect them into a list.
		System.out.println("5. Stream API to filter a list of strings that start with the letter \"A\" and collect them into a list.");
		List<String> stringStartsWithA = Arrays.asList("Jordan","Angie","Andrew","Ravi");
		stringStartsWithA.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
//		Write a Java program that uses the Stream API to find the maximum value in an array of integers.
		System.out.println("6. Write a Java program that uses the Stream API to find the maximum value in an array of integers.");
		List<Integer> maxInteger = Arrays.asList(2,4,125,78,31,151,31);
		long max = maxInteger.stream().max((n1,n2) -> n1 > n2?1:-1).get();
		System.out.println(max);
//		Write a Java program that uses the Stream API to sort a list of strings alphabetically.
		System.out.println("7. Write a Java program that uses the Stream API to sort a list of strings alphabetically.");
		List<String> alphabeticalList = Arrays.asList("Jordan","Ravi","Angie","Andrew","Chris","Meti","Daniel");
		alphabeticalList.stream().sorted().forEach(System.out::println);
//		Write a Java program that uses a parallel stream to process a large list of integers and find their average.
		System.out.println("8. Write a Java program that uses a parallel stream to process a large list of integers and find their average.");
		List<Integer> avgNums = Arrays.asList(100,200,300,100,400,500,300,100,200,50,300,230,410);
		double avg = avgNums.parallelStream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
//		Write a Java program that uses the Stream API to partition a list of integers into odd and even numbers.
		System.out.println("9. Write a Java program that uses the Stream API to partition a list of integers into odd and even numbers.");
		List<Integer> evenAndOddList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println("Label false = Odd and Label true = Even:\n" + evenAndOddList.stream().collect(Collectors.partitioningBy((n) -> n % 2 == 0)));
//		Write a Java program that uses the Stream API to join a list of strings with a comma separator.
		System.out.println("10. Write a Java program that uses the Stream API to join a list of strings with a comma separator.");
		List<String> stringSeparatedByComma = Arrays.asList("Ravi","Andrew","Angie","Milan","Paramvir");
		String concatString = stringSeparatedByComma.stream().collect(Collectors.joining(","));
		System.out.println(concatString);
//		Write a Java program that uses the Stream API to flatten a list of lists of integers into a single list of integers.
		System.out.println("11. Write a Java program that uses the Stream API to flatten a list of lists of integers into a single list of integers.");
		List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
		listOfLists.add(Arrays.asList(43,21,31));
		listOfLists.add(Arrays.asList(5,12,17));
		listOfLists.add(Arrays.asList(71,3,4));
		listOfLists.add(Arrays.asList(25,64,81));
		List<Integer> flattenList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		flattenList.stream().forEach(System.out::println);
//		Write a Java program that uses the Stream API to find the average, maximum, and minimum values of a list of integers.
		System.out.println("12. Write a Java program that uses the Stream API to find the average, maximum, and minimum values of a list of integers.");
		List<Integer> avgMaxMinList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		long sumOfList = sumList.stream().reduce(0, Integer::sum);
		System.out.println(sumOfList);
		long maxOfList = avgMaxMinList.stream().max((num1,num2) -> num1>num2?1:-1).get();
		System.out.println(maxOfList);
		long minOfList = avgMaxMinList.stream().min((num1,num2) -> num1>num2?1:-1).get();
		System.out.println(minOfList);
//		Write a Java program that uses the Stream API to generate a stream of 10 random integers.
		System.out.println("13. Write a Java program that uses the Stream API to generate a stream of 10 random integers.");
		Random rand = new Random();
		IntStream randIntStream = rand.ints(10,-500,501);
		randIntStream.forEach(System.out::println);
//		Write a Java program that uses the Stream API to generate an infinite stream of integers starting from 1 and find the first five prime numbers.
		System.out.println("14. Write a Java program that uses the Stream API to generate an infinite stream of integers starting from 1 and find the first five prime numbers.");
		Stream.iterate(1, (n) -> n + 1).filter(n -> {
			if(n <= 1) {
				return false;
			}
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}).limit(5).forEach(System.out::println);
//		Write a Java program that uses the Stream API to find all distinct strings in a list, ignoring case sensitivity.
		System.out.println("15. Write a Java program that uses the Stream API to find all distinct strings in a list, ignoring case sensitivity.");
		List<String> distinctStrings = Arrays.asList("The","the","ant","Person","helps","ant");
		distinctStrings.stream().map(String::toLowerCase).distinct().collect(Collectors.toList()).forEach(System.out::println);
//		Write a Java program that uses the Stream API to print each element of a list of strings before collecting them into a new list
		System.out.println("16. Write a Java program that uses the Stream API to print each element of a list of strings before collecting them into a new list");
		List<String> strList = Arrays.asList("Hello","world.","These","are","elements","of","string","list");
		System.out.println(strList.stream().collect(Collectors.toList()));
		
		Person person1 = new Person("Jordan", 23);
		Person person2 = new Person("Leha", 50);
		Person person3 = new Person("Son", 53);
		Person person4 = new Person("Bryan", 23);
		Person person5 = new Person("Bey", 22);
		Person person6 = new Person("Dawson", 22);
		
		List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5, person6);
		
//		Write a Java program that uses the Stream API to filter a list of Person objects (having fields name and age) to find all people older than 25.
		System.out.println("17. Write a Java program that uses the Stream API to filter a list of Person objects (having fields name and age) to find all people older than 25.");
		List<Person> peopleOlderThan25 = personList.stream().filter(person -> person.getAge() > 25).collect(Collectors.toList());
		peopleOlderThan25.forEach(System.out::println);
		
//		Write a Java program that uses the Stream API to group a list of Person objects by age.
		System.out.println("18. Write a Java program that uses the Stream API to group a list of Person objects by age.");
		Map<Integer, List<Person>> groupedByAgePersonList = personList.stream().collect(Collectors.groupingBy(Person::getAge));
		groupedByAgePersonList.forEach((age, person) -> {System.out.println("Age: " + age);
			System.out.println(person);
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
