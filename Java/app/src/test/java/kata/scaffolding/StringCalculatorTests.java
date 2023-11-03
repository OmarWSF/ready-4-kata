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

  @Test
  public void add_whenInputAnUnknownAmountOfNumbersSeparatedByComma_thenReturnTheirSum() {
    assertEquals(5, StringCalculator.add("3,1,1"));
  }

  @Test
  public void add_whenTheSeparatorIsANewLine_thenReturnTheirSum() {
    assertEquals(4, StringCalculator.add("3\n1"));
    assertEquals(6, StringCalculator.add("4\n2"));
  }

  @Test
  public void add_whenThereAreMixedSeparators_thenReturnTheirSum() {
    assertEquals(6, StringCalculator.add("3\n1,2"));
  }

  @Test
  public void add_whenThereIsACustomDelimiter_thenReturnTheSumOfTheNumbers(){
    assertEquals(3, StringCalculator.add("//;\n1;2"));
    assertEquals(4, StringCalculator.add("//;\n2;2"));
  }
}
