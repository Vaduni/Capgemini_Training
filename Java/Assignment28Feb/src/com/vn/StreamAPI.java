package com.vn;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/* Questions :
 1. Return the list of names of the owners currently having no cars
 2. create a map of name of person and number of Cars he/she owns
 3. List cars not owned by any one */

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> noCar=CarRepository.getOwners().stream().filter(owner->owner.getCars()==null||owner.getCars().isEmpty()).map(Owner::getName).toList();
  noCar.forEach(System.out::println);

        Map<String, Integer> total = CarRepository.getOwners().stream().collect(Collectors.toMap(
                        Owner::getName,
                        o -> (o.getCars() == null) ? 0 : o.getCars().size()
                ));

        total.forEach((name, count) ->
                System.out.println(name + " -> " + count));

        List<Car> allCars = CarRepository.getCars();

        Set<Car>carOwn = CarRepository.getOwners()
                .stream()
                .filter(o -> o.getCars() != null)
                .flatMap(o -> o.getCars().stream())
                .collect(Collectors.toSet());

        List<Car> unownedCars = allCars.stream().filter(car -> !carOwn.contains(car)).toList();

        unownedCars.forEach(System.out::println);
    }
	
	}
