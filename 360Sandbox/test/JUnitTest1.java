import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import static org.hamcrest.CoreMatchers.containsString;
import pkg360sandbox.Animal;
import pkg360sandbox.MathForJUnit;

/**
 * @author reyob
 */
public class JUnitTest1 extends TestCase {
    private static long[] array1 = new long[3];
    private static long[] array2 = new long[3];
    private static long value1;
    private static long value2;
    Animal cat = new Animal();
    Animal dog = new Animal();
    
    public void main(String[] args) {
        cat.setSpecies("cat");
        cat.setName("Smokey");
        cat.setAge(5); 
        array1[0] = 0;
        array1[1] = 1;
        array1[2] = 2;
        array2[0] = 3;
        array2[1] = 4;
        array2[2] = 5;
        value1 = 5;
        value2 = 7;      
   }
    
    public JUnitTest1() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
       
        
    }
    
    @Test
    public void testAddArray() { 
        array1[0] = 0;
        array1[1] = 1;
        array1[2] = 2;
        array2[0] = 3;
        array2[1] = 4;
        array2[2] = 5;
        long[] promise = {3,5,7};
        long[] given = MathForJUnit.addArray(array1,array2);
        assertArrayEquals(promise, given);
    }
    @Test
    public void testAdd() {
        value1 = 5;
        value2 = 7; 
        long total = 12;
        long sum = MathForJUnit.addLongs(value1, value2);
        assertEquals(total, sum);
    }
    @Test
    public void testFalse() {
        boolean falsey = MathForJUnit.wrongLong(value1);
        assertFalse(falsey);
    }
    @Test
    public void testTrue() {
        value2 = 7;
        boolean truey = MathForJUnit.wrightLong(value2);
        assertTrue(truey);
    }
    @Test
    public void testObject(){
        Animal spot = MathForJUnit.ageAnimal(cat);
        assertNotNull(spot);
    }
    @Test
    public void testEmptyObject(){
        //long[] null3 = new long[10];
        assertNull(null);
    }
    @Test
    public void testCompareObject(){
        assertNotSame(cat, dog);
    }
    //@Test
    public void testCompareSame(){
        assertSame(cat, cat);
    }
    @Test
    public void testName(){
        cat.setName("Smokey");
        String expected = "Smokey";
        String actual = cat.getName();
        assertThat(actual, containsString(expected));
        
    } 
    @AfterClass
    public static void tearDownClass() throws Exception {
        array1[0] = 0;
        array1[1] = 0;
        array1[2] = 0;
        array2[0] = 0;
        array2[1] = 0;
        array2[2] = 0;
        value1 = 0;
        value2 = 0;
    }
}
