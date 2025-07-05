import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    MyQueue queue;
    @BeforeEach
    public void setup() {
        queue = new MyQueue(4);
    }

    @Test
    public void test_ThatQueue_IsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void test_PushIntoQueue_QueueIsNotEmpty() {

        queue.push("Hell");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void PushOneIntoQueue_PopOne_EmptyTest() {
        queue.push("Bolaji");
        assertFalse(queue.isEmpty());
        queue.pop();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void PushTwoIntoQueue_PopOne_EmptyTest() {
        queue.push("Bolaji");
        queue.push("Hi");
        queue.pop();
        assertFalse(queue.isEmpty());
    }

    @Test
    public void PushX_andPop_returnX(){
        queue.push("Bolaji");
        assertEquals("Bolaji", queue.pop());
    }

    @Test
    public void PushXandY_andPop_returnX(){
        queue.push("Bolaji");
        queue.push("Hi");
        assertEquals("Bolaji", queue.pop());
    }


    @Test
    public void PushXandY_andPop_returnXandY(){
        queue.push("Bolaji");
        queue.push("Hi");
        assertEquals("Bolaji", queue.pop());
        assertEquals("Hi", queue.pop());
    }

    @Test
    public void testThatMyQueueThrowsAndExceptions_WhenUserTriesToPop_AnEmptyQueue(){
        assertThrows(QueueEmptyException.class, ()-> queue.pop());

    }

}

