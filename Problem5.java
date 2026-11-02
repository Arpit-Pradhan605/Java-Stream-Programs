import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem5 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 10);

        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()
                ));

        System.out.println(frequencyMap);
    }
}
