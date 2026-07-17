import java.util.*;
import java.util.regex.Pattern;

public final class StringCalculator {
    public int add(String input) {
        if (input == null || input.isBlank()) return 0;
        String delimiter = ",|\n", numbers = input;
        if (input.startsWith("//")) {
            int end = input.indexOf('\n');
            if (end < 0) throw new IllegalArgumentException("Custom delimiter must end with a newline");
            delimiter = delimiters(input.substring(2, end));
            numbers = input.substring(end + 1);
        }
        List<Integer> negatives = new ArrayList<>();
        int total = 0;
        for (String value : numbers.split(delimiter, -1)) {
            if (value.isBlank()) continue;
            int number;
            try { number = Integer.parseInt(value.trim()); }
            catch (NumberFormatException ex) { throw new IllegalArgumentException("Invalid number: " + value, ex); }
            if (number < 0) negatives.add(number);
            if (number <= 1000) total += number;
        }
        if (!negatives.isEmpty()) throw new IllegalArgumentException("Negatives not allowed: " + negatives);
        return total;
    }
    private String delimiters(String raw) {
        if (!raw.startsWith("[")) return Pattern.quote(raw);
        var matcher = Pattern.compile("\\[([^]]+)]").matcher(raw);
        List<String> values = new ArrayList<>();
        while (matcher.find()) values.add(Pattern.quote(matcher.group(1)));
        if (values.isEmpty()) throw new IllegalArgumentException("Delimiter cannot be empty");
        return String.join("|", values);
    }
}
