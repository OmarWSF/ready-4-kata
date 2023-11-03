package kata.scaffolding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.function.Predicate.not;

public class StringCalculator {

  public static int add(String input) {
    String regex = "[\n,]";
    String newInput = input;

    if (input.startsWith("//")) {
      newInput = input.substring(4);
      regex = String.valueOf(input.charAt(2));
    }

    String[] numbers = newInput.split(regex);
    return Stream.of(numbers)
      .filter(not(String::isBlank))
      .mapToInt(Integer::parseInt).sum();
  }
}

