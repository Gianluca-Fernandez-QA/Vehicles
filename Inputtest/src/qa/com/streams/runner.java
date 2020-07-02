package qa.com.streams;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class runner {
	public static void main(String[] args) {
	    List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
	            names.stream()
	            .filter(a -> !a.startsWith("M"))
	            .forEach(x -> System.out.println("Hello "+x))
	                ;
	    
	    		
	   

	    List<Integer> number = Arrays.asList(3, 4, 2, 8, 12);
	    int even = 
	        number.stream()
	            .reduce((a,b) -> a*b)
	            .get();
	    System.out.println(even);
	  int test = number.stream()
			   .sorted()
			   .reduce((a,b)->b)
			   .get()
			   ;
	  System.out.println(test);
	  int test2 = number.stream()
			   .sorted()
			   .reduce((a,b)->a)
			   .get()
			   ;
	  System.out.println(test2);
	  List<Integer> test3 = number.stream()
			   .filter(x -> x % 2 == 0)
			   .collect(Collectors.toList());
			   ;
	  System.out.println(test3);
	  List<Integer> test4 = number.stream()
			   .filter(x -> x % 2 == 1)
			   .collect(Collectors.toList());
			   ;
	System.out.println(test4);
	int Sum = 
	        number.stream()
	            .reduce((a,b) -> a+b)
	            .get();
	System.out.println(Sum);
//	List<Integer> test09 = number.stream()
//			   .reduce((a,b) -> a*b)
//			   .filter(x -> x % 2 == 0)
//			   .
//			   .collect(Collectors.toList());
//			   ;
	    }
	   
	    
	    }

