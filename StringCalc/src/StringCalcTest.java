import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalcTest {

	@Test
	public void AddingEmptyStringReturn0() throws Exception {
		StringCalc calc = new StringCalc();	
		assertEquals(calc.Add(""), 0);
	}
	@Test
	public void AddingOneNumberReturnNum() throws Exception {
		StringCalc calc = new StringCalc();	
		assertEquals(calc.Add("1"), 1);
	}
	@Test
	public void AddingTowNumbersReturnSum() throws Exception {
		StringCalc calc = new StringCalc();	
		assertEquals(calc.Add("1,2"), 3);
	}
	@Test
	public void TowNumbersNewLineReturnSum() throws Exception {
		StringCalc calc = new StringCalc();	
		assertEquals(calc.Add("1\n2"), 3);
	}
	@Test
	public void ThreeNumbersReturnSum() throws Exception {
		StringCalc calc = new StringCalc();	
		assertEquals(calc.Add("1,2,3"), 6);
	}
	@Test(expected = Exception.class)
	public void NegativeNumbersThrowAnExeption() throws Exception {
		StringCalc calc = new StringCalc();	
		calc.Add("-1");
	}

}
