import java.lang.reflect.Array;
import java.util.*;

public class Task5 {


    public static List<String> prio = new ArrayList<String>();
    public static List<String> compl = Arrays.asList("COMPLEX", "MIDDLE", "EASY");

    public static void Tasks(){
        Scanner scanner = new Scanner(System.in);
        //System.out::println(String.valueOf(ArrayList[]));

        do {
            System.out.printf("Please enter Priority: ");
            //String pr =
            //System.out.printf("Please enter Priority: ");
            prio.add(scanner.next());


            System.out.printf("Please enter Complexity: ");
            prio.add(scanner.next());




        } while (scanner.next() != "stop");
        prio.forEach(System.out::println);
    }


}
