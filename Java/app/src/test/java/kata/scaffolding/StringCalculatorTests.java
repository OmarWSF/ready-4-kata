package kata.scaffolding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTests {
  @Test
  public void add_whenInputIsEmpty_thenItReturn0(){
    assertEquals(0, StringCalculator.add(""));
  }

  @Test
  public void add_whenInputIsASingleNumber_thenReturnTheNumberItself(){
    assertEquals(1, StringCalculator.add("1"));
  }

  @Test
  public void add_whenInputIsTwoNumbersSeparatedByComma_thenReturnTheirSum() {
    assertEquals(5, StringCalculator.add("4,1"));
    assertEquals(3, StringCalculator.add("2,1"));
  }
}
