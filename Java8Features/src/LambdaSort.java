
import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.addAll(Arrays.asList(
                new Employee(1, "Nikita"),
                new Employee(2, "Sunita"),
                new Employee(2, "Moreshwar"),
                new Employee(2, "Ritika"),
                new Employee(2, "Sagar")
                ));

        System.out.println(list);

//        Collections.sort(list, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        //using lambda function
        Collections.sort(list, (Employee o1, Employee o2) ->
                o1.getName().compareTo(o2.getName()) );

//      here we have passed employee or uski method name jo ki comparing function compare krk dega
//        Collections.sort(list, Comparator.comparing(Employee :: getName));


        for(var l : list) {
            System.out.println(l.name);
        }
    }
}

class Employee  {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
