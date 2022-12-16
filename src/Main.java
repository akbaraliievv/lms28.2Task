import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println(" all summa : "+list.stream().reduce(Integer::sum).get());
        System.out.println(" arifetic :  "+list.stream().reduce((x, y) -> x + y / list.size()));
        List<Integer>distinct = list.stream().distinct().toList();
        System.out.println(distinct);
    }
}