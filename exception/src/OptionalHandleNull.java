import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Optional;

class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public String getName() {
//        return name;
//    }
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public int getAge() {
        return age;
    }
}

public class OptionalHandleNull {
    public static void main(String[] args) {
        List<Cat> catList = List.of(
                new Cat("Whiskers", 3),
                new Cat("Chloe", 1),
                new Cat("Mittens", 5),
                new Cat(null, 2)
        );

        Optional<Cat> optionalCat = findCatByName(catList, "chloe");

        printCatDetails(optionalCat);

//        System.out.println(optionalCat.map(Cat::getAge).orElse(0));
//        System.out.println(optionalCat.map(Cat::getName).orElse(Optional.ofNullable("Not present")));

//        if(optionalCat.isPresent()) {
//            Cat cat = optionalCat.get();
//            System.out.println(cat.name + " " + cat.getAge());
//        }
//        else {
//            System.out.println("Cat is not present");
//        }

}


    private static Optional<Cat> findCatByName(List<Cat> cats, String name) {
        return cats.stream()
                .filter(cat -> cat.getName()
                        .map(catName -> catName.equals(name))
                        .orElse(false)).findFirst();
    }

    private static void printCatDetails(Optional<Cat> optionalCat) {
        optionalCat.ifPresentOrElse(
                cat -> System.out.println(cat.name + " " + cat.getAge()),
                () -> System.out.println("Cat is not present")
        );
    }
}
