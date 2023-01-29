import static org.junit.Assert.*;   // JUnit: unit testing open-source framework.  It is an instance of the xUnit architecture for unit testing frameworks.

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestForCycleCalculator
{
	private static final double ACCURACY = 0.05;

	private static CycleCalculatorTest converter;

	@BeforeAll
	public static void setup()
	{
		converter = new CycleCalculatorTest();		
	}

	@Test
	public void test_competency()
	{
		// Test competency - comparing doubles using assertEquals
		assertEquals("competency failed:", 1.5, converter.competency("Beginner", 10), ACCURACY);
		assertEquals("competency failed:", 2, converter.competency("Intermediate", 15), ACCURACY);
		assertEquals("competency failed:", 1.0, converter.competency("Advanced", 20), ACCURACY);

	}
	
	@Test
	public void test_iscyclingAlone()
	{
		// Test cyclingalone -- comparing Strings using assertEquals
		assertEquals("cyclingAlone failed:", 2.4, converter.iscyclingAlone(24, true), ACCURACY);
		assertEquals("cyclingAlone failed:", 2.0, converter.iscyclingAlone(24, false), ACCURACY);
	}
	
	@Test
	public void test_numYearsExperience()
	{
		// Test convert mph to kmh and comparision
		//assertTrue("96.5606 >= 38.6243", converter.mph2kph_compare(60, 24));
		//assertEquals("mph2kmh_compare failed:", false, converter.mph2kph_compare(24, 60));  //THIS WORKS TOO!!!!
		assertEquals("numYearsExperience failed:", 1.0, converter.numYearsExperience(24, 15), ACCURACY);
	}
	
	@Test
	public void test_convert_array()
	{
		// Test 
		/*double[] expectedOutput = {96.5606, 38.6243, 78};
        double[] input = {59.99, 24.00, 48.466};*/
		assertArrayEquals("mph2kmh_printing failed:", new double[] {96.5606, 38.6243, 78}, converter.convert_array("mph2kph", new double[]{59.99, 24.00, 48.466}), ACCURACY);
	}
	
	@Test
	public void test_convert_temp()
	{
		// Test convert celsius to fareinheit -- comparing doubles using assertEquals
		assertEquals("convert_temp failed:", 93.2, converter.convert_temp(34), ACCURACY);
	}
	
	@Test
	public void test_convert_pounds()
	{
		// Test convert pounds to dollars -- comparing doubles using assertEquals
		assertEquals("convert_temp failed:",13.44 , converter.convert_pounds(12), ACCURACY);	
	}
	
	@Test
	public void test_convert_sec()
	{

		// Test convert pounds to dollars -- comparing doubles using assertEquals
		assertEquals("convert_sec failed:",1.9444 , converter.convert_sec(7000), ACCURACY);
	}
	
}
	

