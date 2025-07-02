import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StarkTest {
    MyStark stark;
    
    @BeforeEach
    public void setup() {
        stark = new MyStark(6);
    }
    
    @Test
    public void testStark_isEmpty() {
    
    assertTrue(stark.isEmpty());
    }

    @Test
    public void PushIntoStark_StarkNotEmptyTest() {
        assertTrue(stark.isEmpty());
        stark.push("Bolaji");
        assertFalse(stark.isEmpty());
    }

    @Test
    public void PushOneIntoStark_PopOne_EmptyTest() {
        stark.push("Bolaji");
        assertFalse(stark.isEmpty());
        stark.pop();
    }

    @Test
    public void PushTwoIntoStark_PopOne_StarkIsNotEmptyTest() {
        stark.push("Bolaji");
        assertFalse(stark.isEmpty());
        stark.push("Hello");
        assertFalse(stark.isEmpty());
        stark.pop();
        assertFalse(stark.isEmpty());
    }


    @Test
    public void PushTwoIntoStark_PopTwo_EmptyTest() {
        stark.push("Bolaji");
        assertFalse(stark.isEmpty());
        stark.push("Hello");
        assertFalse(stark.isEmpty());
        stark.pop();
        assertFalse(stark.isEmpty());
        stark.pop();
        assertTrue(stark.isEmpty());
    }

    @Test
    public void PushX_andPop_returnX(){
        stark.push("Bolaji");
        assertEquals("Bolaji", stark.pop());
    }

    @Test
    public void PushY_andX_andPop_returnXandY(){
        stark.push("Bolaji");
        stark.push("Hello");
        assertEquals("Hello", stark.pop());
        assertEquals("Bolaji", stark.pop());
    }

    @Test
    public void testThatMyStarkThrowsAndExceptions_WhenUserTriesToPop_AnEmptyStark(){
        assertThrows(StackUnderFlowException.class, ()-> stark.pop());

    }



}
