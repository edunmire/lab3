import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceSize() {
    int[] input = {0,1,2};
    ArrayExamples.reverseInPlace(input);
    assertEquals(3, input.length);
  }

  @Test
  public void testReversedSize() {
    int[] input = {0,1,2};
    assertEquals(3, ArrayExamples.reversed(input).length);
  }

  @Test
  public void testReverseInPlace2(){
    int[] input = {0,1,2,3,4};
    ArrayExamples.reverseInPlace(input);
    for(int i : input) {
      System.out.print(i + " ");
    }
    assertArrayEquals(new int[]{4,3,2,1,0}, input);
  }

  @Test
  public void testReversed2() {
    int[] input = {0,1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1,0}, ArrayExamples.reversed(input));
  }
}
