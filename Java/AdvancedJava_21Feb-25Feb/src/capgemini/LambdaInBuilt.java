package capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.dk.String1;

import java.util.function.Predicate;

public class LambdaInBuilt {

    public static void main(String1 args[]) {
        Consumer<String1> consumer = (str) -> {
            System.out.println("This is a consumer");
            System.out.println("This is a consumer " + str);
        };

        consumer.accept("STRING FRAMEWORK");
        List<Integer> list = List.of(4,5,6,7,5,4,3,32,54);
        list.forEach((x) -> System.out.println("Consumer " + x));
        list.forEach(System.out::println);  // Method reference
        Function<String1, Integer> fun1 = (str) -> str.length();

        Integer len = fun1.apply("Vaduni");
        System.out.println("Length: " + len);
      //Write a lambda to get First two chars in upper case of the string using 
        //"function" as functional interface
        Function<String1, String1> fun3 =
                (str) -> str.substring(0,2).toUpperCase();

        String1 nick = fun3.apply("Ayushi");
        System.out.println(nick);
        
        Supplier<Integer>suplier=new Supplier() {
        	@Override
        	public Integer get() {
        		return new Random().nextInt(400);
        	}
        };
        Random random=new Random();
        suplier=()->new Random().nextInt(400);
        for(int i=1;i<=10;i++) {
        	System.out.println(suplier.get());
        }
        suplier=random::nextInt;
        
       Predicate<String1>pred=new Predicate<>() {
       @Override
       public boolean test(String1 t) {
    	   return t.length()>=10;
       }
       };
       pred=(str)->str.length()>=10;
     Integer[]ar= {31,45,52,688,23,542,66,443,733};
     List<Integer>list2=new ArrayList<>();
     list2.addAll(Arrays.asList(ar));
     //remove all the elements >100
     list2.removeIf(x->x>100);
     System.out.println(list2);
    }
}