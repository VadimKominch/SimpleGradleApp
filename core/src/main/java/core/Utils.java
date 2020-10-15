package core;

import first.task.StringUtils;

import java.util.stream.Stream;


public class Utils {
    public static boolean isAllPositiveNumbers(String ...numbers) {
        return Stream.of(numbers).allMatch(StringUtils::isPositiveNumber);
    }
}
