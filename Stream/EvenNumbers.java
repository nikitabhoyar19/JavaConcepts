import java.util.*;
import java.util.stream.*;
import java.util.function.Function;


public class EvenNumbers {
    public static void main(String args[]) {
      List<Integer> list = Arrays.asList(10,15,8,49,9,10,25,98,32,8,9);

      // even numbers
      // list.stream()
      // .filter(n -> n%2 == 0)
      // .forEach(System.out::println);

      //  sort elements
      // list.stream().sorted()
      // .forEach(System.out::println);

      // all  numbers starting with 1
      // list.stream()
      // .map(s -> s + "")
      // .filter(s -> s.startsWith("1"))
      // .forEach(System.out::println);

      // duplicate Elements
      // Set<Integer> set = new HashSet<>();
      // list.stream()
      // .filter(n -> !set.add(n))
      // .forEach(System.out::println);

      // total element
      // long count = list.stream().count();
      // System.out.println(count);

    }
}