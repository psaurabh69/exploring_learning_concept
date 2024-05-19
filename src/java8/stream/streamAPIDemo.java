package java8.stream;

import com.sun.source.doctree.SummaryTree;

import java.util.*;
import java.util.stream.Collectors;

public class streamAPIDemo {
    public static void main(String[] args){

        System.out.println("Welcome in Java Stream world: ");
        User user1 = new User(1,"Saurabh",29);
        User user2 = new User(2,"Shiv",26);
        User user3 = new User(3,"Ajay",26);
        User user4 = new User(4,"Vikas",30);
        User user5 = new User(5,"Bhavesh",24);
        List<User> userList = Arrays.asList(user1,user2,user3,user4,user5);

/*      Intermediate Operations
        map: Transform each element using the provided function.
        filter: Select elements based on a given condition.
        flatMap: Flatten nested collections and transform elements concurrently.
        distinct: Remove duplicates from the stream.
        sorted: Sort elements based on natural order or a provided comparator.
        peek: Execute an action for each element without affecting the original stream.
*/

        //-------------------------------------- 1. Filter ----------------------------------------------
        //Filter UserList who age >27
        System.out.println("Filter UserList who age >27");
        userList.stream().filter(u -> u.age > 27).forEach(user -> System.out.println(user.name));

        //------------------------------------- 2. Sorted -----------------------------------------------
        //Sorted UserList by Username in Natural Order
        System.out.println("Default Sorting UserList :");
        userList.stream().sorted(Comparator.comparing(User::getName)).forEach(user -> System.out.println(user.name));

        //Sorted UserList by Username in Reverse Order.
        System.out.println("Reversed Sorting UserList :");
        userList.stream().sorted(Comparator.comparing(User::getName).reversed()).forEach(user -> System.out.println(user.name));

        //Multiple Sorting is allowed.
        System.out.println("Multiple Sorting is allow : ");
        userList.stream()
                .sorted(Comparator.comparing(User::getName))
                .sorted(Comparator.comparing(User::getAge))
                .forEach(u -> System.out.println(u.toString()));

        //Sorted simple arrayList in Natural Order without Comparator.
        System.out.println("Sorted simple arrayList in Natural Order without Comparator.");
        List<String> list = new ArrayList<>();
        list.add("Saurabh");
        list.add("Ajay");
        list.add("Suresh");
        list.add("Vijay");
        list.add("Chandresh");
        list.stream().sorted().forEach(System.out::println);

        //Sorted simple array in Natural Order with CompareTo() - Method Reference.
        System.out.println("Sorted simple array in Natural Order with CompareTo() - Method Reference.");
        List<Integer> intlist = Arrays.asList(4,3,2,5,1);
        intlist.stream().sorted(Integer::compareTo).forEach(System.out::println);

        //Sorted simple array in Natural Order with CompareTo() - Lambada Function.
        System.out.println("Sorted simple array in Natural Order with CompareTo() - Lambada Function.");
        List<Integer> intlist1 = Arrays.asList(4,3,2,5,1);
        intlist1.stream().sorted((a,b)->b.compareTo(a)).forEach(System.out::println);

        //------------------------------------- 3. Map -----------------------------------------------

        // simple Map function use to get Manipulate elements only.
        System.out.println("All Username should be in Upper letter only.");
        userList.stream()
                .map(s->s.getName().toUpperCase())
                .forEach(System.out::println);

         /*Added 5 Year in Age of those User which started name from letter 'S'
         Map use while doing any Operation on filtered Elements. - Filter useList by stated letter with 's'
         Now adding Age 5 year on Sorted Filter List.
         Please ensure return Type - always what map return. */

        System.out.println("Added 5 Year in Age of those User which started name from letter 's'.");
        List<Integer> mapList =  userList.stream()
                .filter(user -> user.getName().startsWith("S"))
                .map(s->s.getAge()+5)
                .collect(Collectors.toList());
        System.out.println(mapList);

        //------------------------------------- 4. FlatMap -----------------------------------------------

        /*FlatMap -> Flatting the Map
        * Flatting means... combine all Stream into on Stream.
        * */
        System.out.println("FlatMap -> Flatting all Stream into One Stream.");
        List<String> list1 = Arrays.asList("Xyz","Abc","Pqr");
        List<String> list2 = Arrays.asList("123","456","789");
        List<List<String>> nestedList = Arrays.asList(list2,list1);
        nestedList.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        // Find Maximum Elements from Nested List Object using FlatMap.
        List<Integer> l1 = Arrays.asList(3,4);
        List<Integer> l2 = Arrays.asList(6,1);
        List<List<Integer>> list12 = Arrays.asList(l1,l2);
        list12.stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .max().ifPresent(System.out::println);

        //------------------------------------- 5. Distinct  -----------------------------------------------
        System.out.println("Find Distinct value from List.");
        List<Integer> listDist = Arrays.asList(2,4,3,4,3,2,3,4);
        listDist.stream()
                .distinct()
                .forEach(System.out::println);

        //----------------------------------- 6. Mathematical Function ------------------------------------------
        // it is essential to call mapToInt() method before applying any mathematical function.

        System.out.println("Apply all Mathematical Function. - using summaryStatistics");
        List<Integer> listMath = Arrays.asList(1,2,3);
        IntSummaryStatistics summaryStatistics = listMath.stream().mapToInt(x->x).summaryStatistics();

        System.out.println("Min :"+summaryStatistics.getMin());
        System.out.println("Max :"+summaryStatistics.getMax());
        System.out.println("Avg :"+summaryStatistics.getAverage());
        System.out.println("Sum :"+summaryStatistics.getSum());
        System.out.println("Count :"+summaryStatistics.getCount());

        //Min and max using Comparator.
        System.out.println("Min age from UserList : ");
        userList.stream()
                .min(Comparator.comparing(User::getAge))
                .ifPresent(System.out::println);

        System.out.println("Max age from UserList : ");
        userList.stream()
                .max(Comparator.comparing(User::getAge))
                .ifPresent(System.out::println);
    }


}