
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStreamEx {

    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();

        list.addAll(Arrays.asList(
                new Car(1, "Toyoto", 550000),
                new Car(2, "Lamborgini", 900000),
                new Car(3, "Suzuki", 950000)
        ));

        // Using Predicate
        System.out.println("/////Using Predicate list/////");
        Predicate<Car> p = x -> x.getPrice() >= 900000;
        for(Car car : list) {
            if(p.test(car)) {
                System.out.println(car.getName());
            }
        }

        //Using Stream
        System.out.println("/////Stream list/////");
        List<Car> listFilteredCar = list.stream().
                filter(x -> x.getPrice() < 950000)  // filtering data
                .collect(Collectors.toList());  // collecting as list

        for(Car car : listFilteredCar) {
            System.out.println(car.getName());
        }

        List<Integer> productPriceList2 = list.stream()
                .filter(s -> s.price > 30000)  // filtering data
                .map(s->s.price)  // fetching price
                .collect(Collectors.toList());  // collecting as list

            System.out.println(productPriceList2);


    }
}

class Car  {
    int id;
    String name;
    int price;

    Car(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
