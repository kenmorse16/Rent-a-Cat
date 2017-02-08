import org.junit.Test;
import static org.junit.Assert.*;

public class CatTest
{
	@Test
	public void	TestInitial()
	{
		Cat testCat = new Cat("Cat", 100.00);
		String newName = "Big Cat";
		testCat.setName(newName);
		assertEquals(testCat.getName(), newName);
	}
}