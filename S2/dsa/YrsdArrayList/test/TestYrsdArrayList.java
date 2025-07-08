import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestYrsdArrayList {

    @Test
    public void testThatYrsdArrayListIsEmpty() {
        YrsdArrayList books = new YrsdArrayList();
        assertTrue(books.isEmpty());
    }

    @Test
    public void testThatYrsdArrayListIsNotEmpty() {
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        assertFalse(books.isEmpty());
    }

    @Test
    public void testThatYrsdMultipleItemsCanBeAdded() {
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        assertEquals(1, books.size());
        books.add("Harry Porter");
        assertEquals(2, books.size());
        books.add("Harry Porter");
        assertEquals(3, books.size());
    }

    @Test
    public void CheckItemsInTheArrayListTest(){
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        assertEquals("Harry Porter", books.check(0));
        books.add("Semicolon");
        assertEquals("Semicolon", books.check(1));
        assertEquals("Harry Porter", books.check(0));
    }

    @Test
    public void TestThatRemoveFromTheListWorks(){
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        assertEquals(1, books.size());
        books.add("H");
        books.remove(1);
        assertEquals("Harry Porter", books.check(0));
        assertFalse(books.isEmpty());
        books.remove(0);
        assertTrue(books.isEmpty());
        assertEquals(0, books.size());
    }

    @Test
    public void testThatListRearrangesItSelfAfterAnItemOtherThanTheLastIndexHasBeenRemoved(){
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        books.add("Sandman");
        books.remove(0);
        assertEquals("Sandman", books.check(0));
    }

    @Test
    public void testClearList(){
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        books.add("Sandman");
        books.add("Home-Alone");
        books.clear();
        assertEquals(0,books.size());
        assertTrue(books.isEmpty());

    }

    @Test
    public void testSetSpecifiedIndex(){
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        books.add("Sandman");
        books.set("Hall");
        assertEquals("Hall", books.check(0));
        books.remove(0);
        assertEquals("Sandman", books.check(0));
        books.set("Sand");
        assertEquals("Sand", books.check(0));
    }

    @Test
    public void testRemoveLast(){
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        books.add("Sandman");
        books.removeLast();
        assertEquals(1,books.size());
        assertEquals("Harry Porter", books.check(0));
        books.add("Hi");
        books.add("Boor");
        books.removeLast();
        assertEquals(2,books.size());
        assertEquals("Hi", books.check(1));
    }

    @Test
    public void ContainsWorks(){
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        books.add("Harry");
        assertTrue(books.contains("Harry"));
        assertFalse(books.contains("Gbenga"));
    }

    @Test
    public void ReturnIndexOfElementTest(){
        YrsdArrayList books = new YrsdArrayList();
        books.add("Harry Porter");
        assertEquals(0, books.indexOf("Harry Porter"));
        books.add("Sandman");
        assertEquals(1, books.indexOf("Sandman"));
    }




}
