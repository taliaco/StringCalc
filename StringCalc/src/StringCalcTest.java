import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalcTest {

	@Test
	public void AddingEmptyStringReturn0() {
		StringCalc calc = new StringCalc();	
		assertEquals(calc.Add(""), 0);
	}
	@Test
	public void AddingOneNumberReturnNum() {
		StringCalc calc = new StringCalc();	
		assertEquals(calc.Add("1"), 1);
	}

}
