import java.util.*;
import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Integer> nums = Arrays.asList(25, 29, 17, 8, 19);

        //if we want to sort first, then do something
        nums.stream().sorted().map(n -> n * 2).forEach(n -> System.out.println(n));
        System.out.println("Hello, World!");

        //if want to sort the odd elements then do something
        nums.stream().filter(n -> n%2==1).sorted().map(n -> n*2).forEach(n -> System.out.println(n));
        System.out.println("Hello, World!");

        Predicate<Integer> pred = (Integer n) -> n%2==0; 
        nums.stream().filter(pred).sorted().map(n -> n*2).forEach(n -> System.out.println(n));
        // predicate has boolean test method which give result in true or false
        // it states 
        // Predicate<Integer> pred = new Predicate<Integer>() {
        //     public boolean test(Integer n) {
        //         if(n %2 == 0) return true;
        //         else return false;
        //     }
            
    }
}