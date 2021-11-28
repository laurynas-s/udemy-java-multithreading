import java.util.List;
import java.util.stream.Collectors;

public class Assigment1 {
    public static void main(String[] args) {
        System.out.println(string_toLowerCase(List.of("Bob", "Jamie", "Jill", "Rick")));
    }

    public static List<String> string_toLowerCase(List<String> list){
        return list
                .parallelStream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

    }
}
