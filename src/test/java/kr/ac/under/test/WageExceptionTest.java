package kr.ac.under.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import kr.ac.under.java.InvalidInputException;
import kr.ac.under.java.Proficiency;
import kr.ac.under.java.Wage;

@RunWith(Parameterized.class)
public class WageExceptionTest {

	Proficiency type;
	int workingHours;
	
	@Parameters
	public static Collection getParameters(){
		return Arrays.asList(new Object[][] {
			{Proficiency.E, -10},
			{Proficiency.B, 50}
		});
	}
	
	public WageExceptionTest(Proficiency type, int workingHours) {
		this.type = type;
		this.workingHours = workingHours;
	}
	
	@Test(expected = InvalidInputException.class)
	public void test_calculatePay_with_invalid_input() {
		int wage = Wage.calculatePay(type, workingHours);
	}

}
