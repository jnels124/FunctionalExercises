import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Sample tests for the functional programming exercises.
 * Full credit for the assignment requires providing a
 * more extensive set of tests.
 * @author Dr. Jody Paul test coverage extended by Jesse Nelson
 * @version Intermediate Programming 1.0: Windows 8(x64) December 7, 2012
 */
public class ExercisesTest {
    java.util.List positiveValues;
    java.util.List negativeValues;
    java.util.List mixedValues;
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        positiveValues = java.util.Arrays.asList(1, 1, 7, 13, 9, 11);
        negativeValues = java.util.Arrays.asList(-5, -4, -10, -11, -15, -6, -5);
        mixedValues = java.util.Arrays.asList(-5, -4, -10, -6, -5, 1, 1, 7, 13, 9, 11);
    }

    @Test
    public void testSum() {
        assertEquals(42, (int)Exercises.sum(this.positiveValues));
        assertEquals(-56,(int)Exercises.sum(this.negativeValues));
        assertEquals(12, (int)Exercises.sum(this.mixedValues));
        assertEquals(-2, (int)Exercises.sum(this.positiveValues) + 
                               Exercises.sum(this.negativeValues) + 
                               Exercises.sum(this.mixedValues));
    }

    @Test
    public void testProduct() {
        assertEquals(9009, (int)Exercises.product(this.positiveValues));
        assertEquals(-990000, (int)Exercises.product(this.negativeValues));
        assertEquals(-54054000, (int)Exercises.product(this.mixedValues));
    }

    @Test
    public void testStrCount() {
        assertEquals(2, (int)Exercises.strCount("catdogcat", "cat"));
        assertEquals(2, (int)Exercises.strCount("catd   o  g    cat", "cat"));
        assertEquals(0, (int)Exercises.strCount("x", "foo"));
        assertEquals(2, (int)Exercises.strCount("ccccc", "cc"));
    }

    @Test
    public void testGroupExists() {
        assertTrue(Exercises.groupExists(this.positiveValues, 0));
        assertTrue(Exercises.groupExists(this.positiveValues, 2));
        assertFalse(Exercises.groupExists(null, 5));
        assertTrue(Exercises.groupExists(this.positiveValues, 9));
        assertTrue(Exercises.groupExists(this.positiveValues, 31));
        assertTrue(Exercises.groupExists(this.positiveValues, 42));
        assertTrue(Exercises.groupExists(this.positiveValues, 1));
        assertFalse(Exercises.groupExists(this.positiveValues, 3));
        assertTrue(Exercises.groupExists(this.positiveValues, 12));
        assertFalse(Exercises.groupExists(this.positiveValues, 4));
        
        assertTrue(Exercises.groupExists(this.negativeValues, -9));
        assertTrue(Exercises.groupExists(this.negativeValues, -11));
        assertTrue(Exercises.groupExists(this.negativeValues, -19));
        assertTrue(Exercises.groupExists(this.negativeValues, -20));
        assertTrue(Exercises.groupExists(this.negativeValues, -21));
        assertTrue(Exercises.groupExists(this.negativeValues, -26));
        assertTrue(Exercises.groupExists(this.negativeValues, -30));
        assertTrue(Exercises.groupExists(this.negativeValues, -45));
        assertTrue(Exercises.groupExists(this.negativeValues, -51));
        assertTrue(Exercises.groupExists(this.negativeValues, -56));
        assertFalse(Exercises.groupExists(null, -56));
        assertFalse(Exercises.groupExists(this.negativeValues, -3));
        assertFalse(Exercises.groupExists(this.negativeValues, -8));
        assertFalse(Exercises.groupExists(this.negativeValues, -57));
        assertFalse(Exercises.groupExists(this.negativeValues, -8));
        assertFalse(Exercises.groupExists(this.negativeValues, -57));
        
        /* All positive requests should be false
         */
        for(int i = 10; i < 500; i += 10) {
            assertFalse(Exercises.groupExists(this.negativeValues, i));
        }
        
        mixedValues = java.util.Arrays.asList(-5, -4, -10, -6, -5, 1, 1, 7, 13, 9, 11);
        assertTrue(Exercises.groupExists(this.mixedValues, -3));
        assertTrue(Exercises.groupExists(this.mixedValues, -3));
        assertTrue(Exercises.groupExists(this.mixedValues, -5));
        assertTrue(Exercises.groupExists(this.mixedValues, -9));
        assertTrue(Exercises.groupExists(this.mixedValues, -15));
        assertTrue(Exercises.groupExists(this.mixedValues, -26));
        assertTrue(Exercises.groupExists(this.mixedValues, -29));
        assertTrue(Exercises.groupExists(this.mixedValues, -30));
        assertTrue(Exercises.groupExists(this.mixedValues, -18));
        assertTrue(Exercises.groupExists(this.mixedValues, 2));
        assertTrue(Exercises.groupExists(this.mixedValues, 3));
        assertTrue(Exercises.groupExists(this.mixedValues, 4));
        assertTrue(Exercises.groupExists(this.mixedValues, 5));
        assertTrue(Exercises.groupExists(this.mixedValues, 8));
        assertTrue(Exercises.groupExists(this.mixedValues, 9));
        assertTrue(Exercises.groupExists(this.mixedValues, 10));
        assertTrue(Exercises.groupExists(this.mixedValues, 12));
        assertTrue(Exercises.groupExists(this.mixedValues, 20));
        assertTrue(Exercises.groupExists(this.mixedValues, 21));
        assertTrue(Exercises.groupExists(this.mixedValues, 22));
        assertTrue(Exercises.groupExists(this.mixedValues, 24));
        assertTrue(Exercises.groupExists(this.mixedValues, 29));
        assertTrue(Exercises.groupExists(this.mixedValues, 33));
        assertTrue(Exercises.groupExists(this.mixedValues, 42));
        assertFalse(Exercises.groupExists(null, 42));
        assertFalse(Exercises.groupExists(this.mixedValues, -31));
        assertFalse(Exercises.groupExists(this.mixedValues, -45));
        assertFalse(Exercises.groupExists(this.mixedValues, 43));
        assertFalse(Exercises.groupExists(this.mixedValues, 45));
        assertFalse(Exercises.groupExists(this.mixedValues, -57));
     
       

        java.util.List allValues = new java.util.ArrayList();
        allValues.addAll(positiveValues);
        allValues.addAll(negativeValues);
        allValues.addAll(mixedValues);
        
        /* All true assertions for tests done on
         * individual lists should still return 
         * true when called with the appended list;
         */
        assertTrue(Exercises.groupExists(allValues, 0));
        assertTrue(Exercises.groupExists(allValues, 2));
        assertTrue(Exercises.groupExists(allValues, 9));
        assertTrue(Exercises.groupExists(allValues, 31));
        assertTrue(Exercises.groupExists(allValues, 42));
        assertTrue(Exercises.groupExists(allValues, 1));
        assertTrue(Exercises.groupExists(allValues, 12));
        assertTrue(Exercises.groupExists(allValues, -9));
        assertTrue(Exercises.groupExists(allValues, -11));
        assertTrue(Exercises.groupExists(allValues, -19));
        assertTrue(Exercises.groupExists(allValues, -20));
        assertTrue(Exercises.groupExists(allValues, -21));
        assertTrue(Exercises.groupExists(allValues, -26));
        assertTrue(Exercises.groupExists(allValues, -30));
        assertTrue(Exercises.groupExists(allValues, -45));
        assertTrue(Exercises.groupExists(allValues, -51));
        assertTrue(Exercises.groupExists(allValues, -56));
        assertTrue(Exercises.groupExists(allValues, -3));
        assertTrue(Exercises.groupExists(allValues, -3));
        assertTrue(Exercises.groupExists(allValues, -5));
        assertTrue(Exercises.groupExists(allValues, -9));
        assertTrue(Exercises.groupExists(allValues, -15));
        assertTrue(Exercises.groupExists(allValues, -26));
        assertTrue(Exercises.groupExists(allValues, -29));
        assertTrue(Exercises.groupExists(allValues, -30));
        assertTrue(Exercises.groupExists(allValues, -18));
        assertTrue(Exercises.groupExists(allValues, 2));
        assertTrue(Exercises.groupExists(allValues, 3));
        assertTrue(Exercises.groupExists(allValues, 4));
        assertTrue(Exercises.groupExists(allValues, 5));
        assertTrue(Exercises.groupExists(allValues, 8));
        assertTrue(Exercises.groupExists(allValues, 9));
        assertTrue(Exercises.groupExists(allValues, 10));
        assertTrue(Exercises.groupExists(allValues, 12));
        assertTrue(Exercises.groupExists(allValues, 20));
        assertTrue(Exercises.groupExists(allValues, 21));
        assertTrue(Exercises.groupExists(allValues, 22));
        assertTrue(Exercises.groupExists(allValues, 24));
        assertTrue(Exercises.groupExists(allValues, 29));
        assertTrue(Exercises.groupExists(allValues, 33));
        assertTrue(Exercises.groupExists(allValues, 42));
        
        assertFalse(Exercises.groupExists(allValues, 4995));
        assertFalse(Exercises.groupExists(allValues, 520));
        assertFalse(Exercises.groupExists(allValues, 111));
        assertFalse(Exercises.groupExists(allValues, 94));
        assertFalse(Exercises.groupExists(allValues, -1111));
        assertFalse(Exercises.groupExists(allValues, -94));
        assertFalse(Exercises.groupExists(allValues, -87));
        
    }
}

