import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
  
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
    this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
   return new Object[][]{
      {15, false}, // Несовершеннолетний
      {18, true},  // Ровно 18 лет
      {20, true},  // Совершеннолетний (по умолчанию)
      {21, true}, // Возможно, в некоторых странах совершеннолетие наступает в 21 год
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals(Expected result for age  + age +  should be  + result, result, isAdult);
  }
}
