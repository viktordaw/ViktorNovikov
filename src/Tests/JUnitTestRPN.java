package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import Calculadora.RPN;

public class JUnitTestRPN {

	private RPN rpn_1 = new RPN("5 + 5 ");
	private RPN rpn_2 = new RPN("5 - 5 ");
	private RPN rpn_3 = new RPN("5 * 5 ");
	private RPN rpn_4 = new RPN("5 / 5 ");
	private RPN rpn_5 = new RPN("5 ^ 3 ");
	private RPN rpn_6 = new RPN("15 % 6 ");
	
	@Test
	public void test() {
		assertEquals(10.000000, rpn_1.resultado(), 0);
		assertEquals(0.000000, rpn_2.resultado(), 0);
		assertEquals(25.000000, rpn_3.resultado(), 0);
		assertEquals(1.000000, rpn_4.resultado(), 0);
		assertEquals(125.000000, rpn_5.resultado(), 0);
		assertEquals(2.000000, rpn_6.resultado(), 0);
	}

}
