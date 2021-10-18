import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.sort.SortNumber;

public class SortNumberTest {

	@Test
	public void givenElementsToSortThenShouldReturnSortedElements()
	{
		List<Integer> initial = new ArrayList<Integer>(Arrays.asList(8,7,3,9,1,3));
		
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,3,7,8,9));
		
		assertEquals(expected, SortNumber.sorting(initial));
	}

}
