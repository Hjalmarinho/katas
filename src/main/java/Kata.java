import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static String highAndLow(String numbers) {
        List<Integer> integers = Arrays.asList(numbers.split(" ")).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return Collections.max(integers).toString() + " " + Collections.min(integers).toString() ;
    }
}
