import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

class LongStringChecker implements StringChecker {
    public boolean checkString(String s) {
        if(s.length()>4) {
            return true;
        }
        return false;
    }
}

public class ListTests {
    
    @Test
    public void testFilter_Empty() {
        List<String> input = new ArrayList<>();
        List<String> test = new ArrayList<>();
        assertEquals(test, ListExamples.filter(input, new LongStringChecker()));
    }

    @Test
    public void testFilter_OneVal() {
        List<String> input = new ArrayList<>();
        input.add("hello");
        List<String> test = new ArrayList<>();
        test.add("hello");
        assertEquals(test, ListExamples.filter(input, new LongStringChecker()));
    }

    @Test
    public void testFilter_MultVal() {
        List<String> input = new ArrayList<>();
        input.add("hello");
        input.add("hi");
        input.add("hey");
        input.add("bonjour");
        input.add("hola");
        List<String> test = new ArrayList<>();
        test.add("hello");
        test.add("bonjour");
        assertEquals(test, ListExamples.filter(input, new LongStringChecker()));
    }

    @Test
    public void testMerge_MultVal() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        input1.add("e");
        input1.add("f");
        List<String> input2 = new ArrayList<>();
        input2.add("c");
        input2.add("d");
        List<String> test = new ArrayList<>();
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");
        test.add("e");
        test.add("f");
        assertEquals(test, ListExamples.merge(input1, input2));
    }

    @Test
    public void testMerge_Empty() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        input1.add("e");
        input1.add("f");
        List<String> input2 = new ArrayList<>();
        List<String> test = new ArrayList<>();
        test.add("a");
        test.add("b");
        test.add("e");
        test.add("f");
        assertEquals(test, ListExamples.merge(input1, input2));
    }

    @Test
    public void testMerge_Oneval() {
        List<String> input1 = new ArrayList<>();
        input1.add("c");
        List<String> input2 = new ArrayList<>();
        input2.add("a");
        List<String> test = new ArrayList<>();
        test.add("a");
        test.add("c");
        assertEquals(test, ListExamples.merge(input1, input2));
    }

    @Test
    public void testMerge_Flipped() {
        List<String> input1 = new ArrayList<>();
        input1.add("e");
        input1.add("t");
        List<String> input2 = new ArrayList<>();
        input2.add("a");
        input2.add("g");
        List<String> test = new ArrayList<>();
        test.add("a");
        test.add("e");
        test.add("g");
        test.add("t");
        assertEquals(test, ListExamples.merge(input1, input2));
    }

    @Test
    public void testMerge_AllOneThenOther() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        List<String> input2 = new ArrayList<>();
        input2.add("c");
        input2.add("d");
        List<String> test = new ArrayList<>();
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");
        assertEquals(test, ListExamples.merge(input1, input2));
    }

}