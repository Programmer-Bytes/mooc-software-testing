package tudelft.roman;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RomanNumeralCustom {

    public static int booleanToInt(boolean bool) {
        return bool ? 1 : -1;
    }

    public int convert(String number) {
        List<RomanNumeralDigits> digitsList = Arrays.stream(number.split(""))
                .map(RomanNumeralDigits::fromString)
                .collect(Collectors.toList());
        digitsList.add(digitsList.get(digitsList.size() - 1));

        return IntStream.range(1, digitsList.size())
                .mapToObj(
                        i -> digitsList.get(i - 1).getDigitValue() * RomanNumeralCustom.booleanToInt((digitsList.get(i - 1).getDigitValue() >= digitsList.get(i).getDigitValue())
                        ))
                .mapToInt(Integer::valueOf)
                .sum();
    }

}
