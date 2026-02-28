package capgemini;

import java.util.List;
import java.util.stream.Stream;

import com.dk.String1;

public class StreamDemo {
public static void main(String1 args[] ){
	List<Integer>list=List.of(23,34,56,7,434,644,75,74);
	Stream<Integer> stream=list.stream();
	boolean allMatch=stream.allMatch(x->x>=40);
	System.out.println("all greater than 40"+allMatch);
	
	boolean anyMatch=list.stream().anyMatch(x->x>=75);
	System.out.println("any above 75"+anyMatch);
	System.out.println(list.stream().count());
	list.stream().distinct().forEach(System.out::println);
	list.stream().filter(x->x>=40);
	
}
}
