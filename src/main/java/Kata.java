import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static String highAndLow(String numbers) {
        List<Integer> integers = Arrays.asList(numbers.split(" ")).stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return Collections.max(integers).toString() + " " + Collections.min(integers).toString() ;
    }

    public static boolean validatePin(String pin) {
        return pin.matches("\\d+") && List.of(4, 6).contains(pin.length());
    }

    public static String createPhoneNumber(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining())
                .replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    public static boolean isIsogram(String word) {
        return word.toLowerCase().chars()
                .distinct().count() == word.length();
    }

    public static int getVowelCount(String word) {
        return word != null ? (int) word.chars().filter(Kata::isVowel).count() : 0;
    }

    private static boolean isVowel(int character) {
        return "aeiou".indexOf(character) >= 0;
    }

    public static String order(String words) {
        String[] wordsSeparated = words.split(" ");
        Arrays.sort(wordsSeparated, Comparator.comparing(s -> s.replaceAll("\\D","")));
        return Arrays.stream(wordsSeparated).collect(Collectors.joining(" "));
    }
}