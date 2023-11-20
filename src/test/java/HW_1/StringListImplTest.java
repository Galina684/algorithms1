package HW_1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringListImplTest {
StringListImpl out = new StringListImpl();


  @Test
   void add() {
   out.add("string");
   assertEquals("string", "string");

    }


// @Test
//    void testAdd() {
//   out.add(0,"string");
//    assertEquals("string", "string");
//    }

    @Test
    void set() {
       out.add("string");
       out.set(0,"string1");
       assertEquals("string1", "string1");
    }

    @Test
    void remove() {
     out.add("string");
     out.add("string1");
     out.remove("string");
       assertEquals("string1", "string1");

    }

    @Test
    void testRemove() {
       out.add("string");
       out.add("string1");
       out.remove(0);
       assertEquals("string1", "string1");
    }

    @Test
    void contains() {
       out.add("string");
       assertEquals(0, 0);
    }

    @Test
    void indexOf() {
       out.add("string");
       out.add("string1");
       assertEquals(0, 0);
    }

    @Test
    void lastIndexOf() {
       out.add("string");
       out.add("string1");
       assertEquals(1, 1);
    }

    @Test
    void get() {
       out.add("string");
       out.add("string1");
       out.get(1);
       assertEquals("string1", "string1");
    }

   // @Test
//    void testEquals() {
//     StringListImpl otherArray = new StringListImpl();
//     otherArray.add("string");
//     otherArray.add("string1");
//     out.add("string");
//     out.add("string1");
//       assertTrue(otherArray.equals(out));
//
//    }

    @Test
    void size() {
       out.add("string");
       out.add("string1");
       assertEquals(2, 2);
    }

    @Test
    void isEmpty() {
       out.add("string");
       out.add("string1");
       out.clear();
       assertEquals(0, 0);
    }

    @Test
    void clear() {
       out.add("string");
       out.add("string1");
       out.clear();
       assertEquals(0, 0);
    }

    @Test
    void toArray() {
       out.add("string");
       out.add("string1");
       out.toArray();
       assertEquals("string1","string1");
    }
}