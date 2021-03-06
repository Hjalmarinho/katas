import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        return (int) word.chars()
                .filter(c -> "aeiou".indexOf(c) >= 0)
                .count();
    }

    public static String sortWordsByContainedNumber(String words) {
        String[] wordsSeparated = words.split(" ");
        Arrays.sort(wordsSeparated, Comparator.comparing(s -> s.replaceAll("\\D","")));
        return Arrays.stream(wordsSeparated).collect(Collectors.joining(" "));
    }

    public static int rowSumOddNumbers(int row) {
        int indexOfLastOddNumber = (row * (row + 1)) / 2;
        int indexOfFirstOddNumber = indexOfLastOddNumber - row + 1;
        return IntStream.rangeClosed(indexOfFirstOddNumber, indexOfLastOddNumber)
                .map(i -> (2 * i - 1))
                .sum();
    }

    public static int lengthOfShortestWord(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }

    public static String whoLikesIt(String... names) {
        switch(names.length) {
            case 0: return "no one likes this";
            case 1: return names[0] + " likes this";
            case 2: return names[0] + " and " + names[1] + " like this";
            case 3: return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default: return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }

    public static String orderByWeight(String weights) {
        return Arrays.stream(weights.split(" "))
                .sorted(Comparator.comparing(Kata::digitSum).thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.joining(" "));
    }

    public static int digitSum(String number){
        return number.chars().map(i -> i - '0').sum();
    }
}