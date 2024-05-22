package test.com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MyAssertTest {

  List<String> todos = Arrays.asList("AWS", "Azuer", "DevOps");

  @Test
  void test() {
    boolean test = todos.contains("AWS");
    boolean test2 = todos.contains("GCP");
    // assertEquals(true, test);
    assertTrue(test, "todos doesn't contains the content");
    assertTrue(test2, "todos doesn't contains the content");
    assertEquals(3, todos.size(), "Size doesn't match");
    // assertNull, assertNotNull
    assertArrayEquals(new int[] { 1, 2 }, new int[] { 1, 2 });
  }
}
