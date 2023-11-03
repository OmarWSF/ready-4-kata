package kata.scaffolding;

import java.util.Arrays;

public class StringCalculator {

  public static int add(String input) {
    if (input.isBlank()) {
      return 0;
    }

    String[] numbers = input.split(",");

    return Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
  }
}

