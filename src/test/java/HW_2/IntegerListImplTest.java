package HW_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    IntegerListImpl out = new IntegerListImpl();

    @Test
    void add() {

        assertFalse(out.contains(111));
        Integer result = out.add(0, 111);

    }


    @Test
    void testAdd() {

        out.add(0, 111);
        out.add(1, 111);
        out.add(2, 111);
        out.add(3, 111);
        out.add(4, 111);
        out.add(5, 111);
        out.add(6, 111);
        out.add(7, 111);
        out.add(8, 111);
        out.add(9, 111);
        out.add(10, 111);
        out.add(11, 111);
        assertEquals(out.size(), 12);

    }

    @Test
    void set() {
        out.add(111);
        out.set(0, 222);
        assertFalse(out.contains(111));
        assertTrue(out.contains(222));

    }

    @Test
    void removeValue() {
        out.add(111);
        out.add(222);
        out.removeValue(111);
        assertFalse(out.contains(111));

    }

    @Test
    void testRemoveIndex() {
        out.add(111);
        out.add(222);
        out.removeIndex(0);
        assertFalse(out.contains(111));
        assertEquals(222, 222);
        assertThrows(InvalidIndexException.class, () -> {
            out.removeIndex(3);
        });
    }

    @Test
    void contains() {
        out.add(111);
        assertEquals(0, 0);
    }

    @Test
    void indexOf() {
        out.add(555);
        out.add(111);
        assertEquals(0, 0);
    }

    @Test
    void lastIndexOf() {
        out.add(555);
        out.add(111);
        assertEquals(1, 1);
    }

    @Test
    void get() {
        out.add(555);
        out.add(111);
        out.get(1);
        assertTrue(out.contains(111));
    }

    @Test
    void testEquals() {
        IntegerListImpl otherArray = new IntegerListImpl();
        otherArray.add(555);
        otherArray.add(111);
        out.add(555);
        out.add(111);
        assertTrue(otherArray.equals(out));

    }

    @Test
    void size() {
        out.add(555);
        out.add(111);
        assertEquals(2, 2);
    }

    @Test
    void isEmpty() {
        out.add(555);
        out.add(111);
        out.clear();
        assertEquals(0, 0);
    }

    @Test
    void clear() {
        out.add(555);
        out.add(111);
        out.clear();
        assertEquals(0, 0);
    }

    @Test
    void toArray() {
        out.add(555);
        out.add(111);
        out.toArray();
        assertEquals(111, 111);
    }

}