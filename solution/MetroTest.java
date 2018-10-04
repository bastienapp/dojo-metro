import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class MetroTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
	
	@Test
	public void test1() throws Exception {
	    int[] metro = {42, 50, 47, 48};
	    int max = 50;
	    int waiting = 68;
		assertEquals(13, Metro.count(metro, max, waiting));
	}
	
	@Test
	public void test2() throws Exception {
	    int[] metro = {12, 5, 20, 14};
	    int max = 20;
	    int waiting = 7;
		assertEquals(7, Metro.count(metro, max, waiting));
	}
}
