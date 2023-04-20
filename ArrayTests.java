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
  public void testReversed_OneVal() {
    int[] input1 = {0};
    assertArrayEquals(new int[]{0}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input = {0,1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1,0}, ArrayExamples.reversed(input));
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
    assertArrayEquals(new int[]{4,3,2,1,0}, input);
  }

  @Test
  public void testMean_LowestZero() {
    double[] input = {0,1.2,3};
    assertEquals((Double)2.1, (Double)ArrayExamples.averageWithoutLowest(input));
  }

  @Test
  public void testMean_Empty() {
    double[] input = {};
    assertEquals((Double)0.0, (Double)ArrayExamples.averageWithoutLowest(input));
  }

  @Test
  public void testMean_Zero() {
    double[] input = {0};
    assertEquals((Double)0.0, (Double)ArrayExamples.averageWithoutLowest(input)); 
  }

  @Test
  public void testMean_OneVal() {
    double[] input = {3};
    assertEquals((Double)0.0, (Double)ArrayExamples.averageWithoutLowest(input)); 
  }

  @Test
  public void testMean_LowestNeg() {
    double[] input = {-1,0,2};
    assertEquals((Double)1.0, (Double)ArrayExamples.averageWithoutLowest(input)); 
  }

  @Test
  public void testMean_LargeArr() {
    double[] input = {0,1,2,3,4,5,6};
    assertEquals((Double)3.5, (Double)ArrayExamples.averageWithoutLowest(input)); 
  }

  @Test
  public void testMean_ManyNeg() {
    double[] input = {-1.3,1.1,-3.1,5.6,-2,4.8};
    assertEquals((Double)1.64, (Double)ArrayExamples.averageWithoutLowest(input)); 
  }
}
