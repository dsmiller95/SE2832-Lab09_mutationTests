package edu.msoe.se2832.taxRateCalculator.wschilling;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import edu.msoe.se2832.taxRateCalculator.wschilling.TaxCalculator;
import edu.msoe.se2832.taxRateCalculator.wschilling.TaxCalculatorInterface;
import junit.framework.TestCase;

public class TaxCalculatorTest extends TestCase {
	// The following variables are instances used for testing tax calculations.
	TaxCalculatorInterface t;
	TaxCalculatorInterface t1;
	TaxCalculatorInterface t2;

	@Before
	/**
	 * This method will setup a new setup that can be used by other tests.
	 */
	public void setUp() throws Exception {
		t = new TaxCalculator("John Smith",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 40, 42);
	}

	@After
	/**
	 * This method will cleanup after testing is done.
	 */
	public void tearDown() {

	}

	@Test
	/**
	 * This test will verify a return of married filing separately when the spouse is under the age of 65. 
	 * @throws Exception Exceptions will occur if there is a calculation problem.
	 */
	public void testTaxCalculationMarriedFilingSeparatelyAge31()
			throws Exception {
		t1 = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_SEPARATELY, 31, 25);
		t1.setGrossIncome(5450);
		assertEquals(0, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13474);
		assertEquals(802.4, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13475);
		assertEquals(802.5, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13476);
		assertEquals(802.65, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(37999);
		assertEquals(4481.1, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(38000);
		assertEquals(4481.25, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(38001);
		assertEquals(4481.5, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(71174);
		assertEquals(12774.75, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(71175);
		assertEquals(12775, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(71176);
		assertEquals(12775.28, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(105599);
		assertEquals(22413.72, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(105600);
		assertEquals(22414, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(105601);
		assertEquals(22414.33, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(184299);
		assertEquals(48384.67, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(184300);
		assertEquals(48385, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(184301);
		assertEquals(48385.35, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(205449);
		assertEquals(55787.15, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(205450);
		assertEquals(55787.5, t1.getTaxDue(), 0.01);
	}

	@Test
	/**
	 * This test will verify a return of married filing separately when the spouse is under the age of 65. 
	 * @throws Exception Exceptions will occur if there is a calculation problem.
	 */
	public void testTaxCalculationMarriedFilingSeparatelyAge65()
			throws Exception {
		t2 = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_SEPARATELY, 65, 25);
		t2.setGrossIncome(6500);
		assertEquals(0, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(14524);
		assertEquals(802.4, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(14525);
		assertEquals(802.5, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(14526);
		assertEquals(802.65, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(39049);
		assertEquals(4481.1, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(39050);
		assertEquals(4481.25, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(39051);
		assertEquals(4481.5, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(72224);
		assertEquals(12774.75, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(72225);
		assertEquals(12775, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(72226);
		assertEquals(12775.28, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(106649);
		assertEquals(22413.72, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(106650);
		assertEquals(22414, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(106651);
		assertEquals(22414.33, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(185349);
		assertEquals(48384.67, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(185350);
		assertEquals(48385, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(185351);
		assertEquals(48385.35, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(206499);
		assertEquals(55787.15, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(206500);
		assertEquals(55787.5, t2.getTaxDue(), 0.01);
	}

	@Test
	/**
	 * This method will test the head of household if the head of household is age 65.
	 * @throws Exception
	 */
	public void testTaxCalculationHeadOfHouseholdAge65() throws Exception {
		t2 = new TaxCalculator("John Adams",
				TaxCalculatorInterface.HEAD_OF_HOUSEHOLD, 65);
		t2.setGrossIncome(9050);
		assertEquals(0, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(20499);
		assertEquals(1144.9, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(20500);
		assertEquals(1145, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(20501);
		assertEquals(1145.15, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(52699);
		assertEquals(5974.85, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(52700);
		assertEquals(5975, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(52701);
		assertEquals(5975.25, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(121699);
		assertEquals(23224.75, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(121700);
		assertEquals(23225, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(121701);
		assertEquals(23225.28, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(191449);
		assertEquals(42754.72, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(191450);
		assertEquals(42755, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(191451);
		assertEquals(42755.33, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(366749);
		assertEquals(100603.67, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(366750);
		assertEquals(100604, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(366751);
		assertEquals(100604.35, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(409049);
		assertEquals(115408.65, t2.getTaxDue(), 0.01);
		t2.setGrossIncome(409050);
		assertEquals(115409, t2.getTaxDue(), 0.01);
	}

	/**
	 * This method will test the head of household if the head of household is
	 * age 31.
	 * 
	 * @throws Exception
	 */
	public void testTaxCalculationHeadOfHouseholdAge31() throws Exception {
		t1 = new TaxCalculator("John Adams",
				TaxCalculatorInterface.HEAD_OF_HOUSEHOLD, 31);
		t1.setGrossIncome(8000);
		assertEquals(0, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(19449);
		assertEquals(1144.9, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(19450);
		assertEquals(1145, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(19451);
		assertEquals(1145.15, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(51649);
		assertEquals(5974.85, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(51650);
		assertEquals(5975, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(51651);
		assertEquals(5975.25, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(120649);
		assertEquals(23224.75, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(120650);
		assertEquals(23225, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(120651);
		assertEquals(23225.28, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(190399);
		assertEquals(42754.72, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(190400);
		assertEquals(42755, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(190401);
		assertEquals(42755.33, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(365699);
		assertEquals(100603.67, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(365700);
		assertEquals(100604, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(365701);
		assertEquals(100604.35, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(407999);
		assertEquals(115408.65, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(408000);
		assertEquals(115409, t1.getTaxDue(), 0.01);
	}

	@Test
	public void testTaxCalculationMarriedFilingJointly() throws Exception {
		TaxCalculatorInterface t1;
		TaxCalculatorInterface t2;

		t1 = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 31, 31);
		t2 = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 65, 65);
		t1.setGrossIncome(10900);
		t2.setGrossIncome(13000);
		assertEquals(0, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(26949);
		t2.setGrossIncome(29049);
		assertEquals(1604.9, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(26950);
		t2.setGrossIncome(29050);
		assertEquals(1605, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(26951);
		t2.setGrossIncome(29051);
		assertEquals(1605.15, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(75999);
		t2.setGrossIncome(78099);
		assertEquals(8962.35, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(76000);
		t2.setGrossIncome(78100);
		assertEquals(8962.5, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(76001);
		t2.setGrossIncome(78101);
		assertEquals(8962.75, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(142349);
		t2.setGrossIncome(144449);
		assertEquals(25549.75, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(142350);
		t2.setGrossIncome(144450);
		assertEquals(25550, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(142351);
		t2.setGrossIncome(144451);
		assertEquals(25550.28, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(211199);
		t2.setGrossIncome(213299);
		assertEquals(44827.72, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(211200);
		t2.setGrossIncome(213300);
		assertEquals(44828, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(211201);
		t2.setGrossIncome(213301);
		assertEquals(44828.33, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(368599);
		t2.setGrossIncome(370699);
		assertEquals(96769.67, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(368600);
		t2.setGrossIncome(370700);
		assertEquals(96770, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(368601);
		t2.setGrossIncome(370701);
		assertEquals(96770.35, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(410899);
		t2.setGrossIncome(412999);
		assertEquals(111574.65, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(410900);
		t2.setGrossIncome(413000);
		assertEquals(111575, t1.getTaxDue(), 0.01);
	}

	public void testTaxCalculationMarriedFilingJointlyAge31() throws Exception {
		TaxCalculatorInterface t1;

		t1 = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 31, 31);
		t1.setGrossIncome(10900);
		assertEquals(0, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(26949);
		assertEquals(1604.9, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(26950);
		assertEquals(1605, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(26951);
		assertEquals(1605.15, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(75999);
		assertEquals(8962.35, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(76000);
		assertEquals(8962.5, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(76001);
		assertEquals(8962.75, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(142349);
		assertEquals(25549.75, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(142350);
		assertEquals(25550, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(142351);
		assertEquals(25550.28, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(211199);
		assertEquals(44827.72, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(211200);
		assertEquals(44828, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(211201);
		assertEquals(44828.33, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(368599);
		assertEquals(96769.67, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(368600);
		assertEquals(96770, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(368601);
		assertEquals(96770.35, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(410899);
		assertEquals(111574.65, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(410900);
		assertEquals(111575, t1.getTaxDue(), 0.01);
	}

	@Test
	/**
	 * This method will test a single person age 31 filing their tax return.
	 * @throws Exception
	 */
	public void testTaxCalculationSingleAge31() throws Exception {
		TaxCalculatorInterface t1;
		t1 = new TaxCalculator("John Adams", TaxCalculatorInterface.SINGLE, 31);
		t1.setGrossIncome(5450);
		assertEquals(0, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13474);
		assertEquals(802.4, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13475);
		assertEquals(802.5, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13476);
		assertEquals(802.65, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(37999);
		assertEquals(4481.1, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(38000);
		assertEquals(4481.25, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(38001);
		assertEquals(4481.5, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(84299);
		assertEquals(16056, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(84300);
		assertEquals(16056.25, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(84301);
		assertEquals(16056.53, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(169999);
		assertEquals(40051.97, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(170000);
		assertEquals(40052.25, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(170001);
		assertEquals(40052.58, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(363149);
		assertEquals(103791.42, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(363150);
		assertEquals(103791.75, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(363151);
		assertEquals(103792.1, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(405449);
		assertEquals(118596.4, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(405450);
		assertEquals(118596.75, t1.getTaxDue(), 0.01);
	}

	@Test
	/**
	 * This method will test a single person at age 20 filing their tax return.
	 * @throws Exception
	 */
	public void testTaxCalculationSingleAge20() throws Exception {
		TaxCalculatorInterface t1;
		t1 = new TaxCalculator("John Adams", TaxCalculatorInterface.SINGLE, 20);
		t1.setGrossIncome(5450);
		assertEquals(0, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13474);
		assertEquals(802.4, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13475);
		assertEquals(802.5, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(13476);
		assertEquals(802.65, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(37999);
		assertEquals(4481.1, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(38000);
		assertEquals(4481.25, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(38001);
		assertEquals(4481.5, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(84299);
		assertEquals(16056, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(84300);
		assertEquals(16056.25, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(84301);
		assertEquals(16056.53, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(169999);
		assertEquals(40051.97, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(170000);
		assertEquals(40052.25, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(170001);
		assertEquals(40052.58, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(363149);
		assertEquals(103791.42, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(363150);
		assertEquals(103791.75, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(363151);
		assertEquals(103792.1, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(405449);
		assertEquals(118596.4, t1.getTaxDue(), 0.01);
		t1.setGrossIncome(405450);
		assertEquals(118596.75, t1.getTaxDue(), 0.01);
	}

	/**
	 * This test will verify that the short form of the constructor works
	 * properly. In each of these cases, an exception should be thrown by the
	 * constructor for an invalid combination.
	 * 
	 * @throws Exception
	 *             An exception will be thrown if the main program throws the
	 *             exception.
	 */
	@Test
	public void testShortConstructorFailures() throws Exception {
		/* Test the creation of a class of a single. */
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.QUALIFYING_WIDOWER, 31);
		assertEquals(31, t.getAge());
		assertEquals(0, t.getSpouseAge());
		assertEquals(0.0, t.getGrossIncome());

		try {
			t = new TaxCalculator("John Adams",
					TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 31);
			fail("You should not be able to create a class without providing spouse's age.");
		} catch (Exception e) {
			// Exception should be generated here.
		}

		try {
			t = new TaxCalculator("John Adams",
					TaxCalculatorInterface.MARRIED_FILING_SEPARATELY, 31);
			fail("You should not be able to create a class without providing spouse's age.");
		} catch (Exception e) {
			// Exception should be generated here.
		}
	}

	/**
	 * This test will verify that the short form of the constructor works
	 * properly. This includes all types of single filing where there is not a
	 * spouse or a spouse's age.
	 * 
	 * @throws Exception
	 *             An exception will be thrown if the main program throws the
	 *             exception.
	 */
	@Test
	public void testShortConstructorQualifyingWidower() throws Exception {
		/* Test the creation of a class of a single. */
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.QUALIFYING_WIDOWER, 31);
		assertEquals(31, t.getAge());
		assertEquals(0, t.getSpouseAge());
		assertEquals(0.0, t.getGrossIncome());
	}

	/**
	 * This test will verify that the short form of the constructor works
	 * properly. This includes all types of single filing where there is not a
	 * spouse or a spouse's age.
	 * 
	 * @throws Exception
	 *             An exception will be thrown if the main program throws the
	 *             exception.
	 */
	@Test
	public void testShortConstructorHeadOfHousehold() throws Exception {
		/* Test the creation of a class of a single. */

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.HEAD_OF_HOUSEHOLD, 31);
		assertEquals(31, t.getAge());
		assertEquals(0, t.getSpouseAge());
		assertEquals(0.0, t.getGrossIncome());

	}

	/**
	 * This test will verify that the short form of the constructor works
	 * properly. This includes all types of single filing where there is not a
	 * spouse or a spouse's age.
	 * 
	 * @throws Exception
	 *             An exception will be thrown if the main program throws the
	 *             exception.
	 */
	@Test
	public void testShortConstructorSingle() throws Exception {
		/* Test the creation of a class of a single. */
		t = new TaxCalculator("John Adams", TaxCalculatorInterface.SINGLE, 31);
		assertEquals(31, t.getAge());
		assertEquals(0, t.getSpouseAge());
		assertEquals(0.0, t.getGrossIncome());
		assertEquals(TaxCalculatorInterface.SINGLE, t.getFilingStatus());

	}

	/**
	 * This test will verify that the long form of the constructor works
	 * properly. This includes all types of single filing where there is not a
	 * spouse or a spouse's age.
	 * 
	 * @throws Exception
	 *             An exception will be thrown if the main program throws the
	 *             exception.
	 */
	@Test
	public void testLongConstructorWhichInvalidCombinations() throws Exception {
		/* Test the creation of a class of a single. */
		try {
			t = new TaxCalculator("John Adams", TaxCalculatorInterface.SINGLE,
					31, 23);
			fail();
		} catch (Exception e) {
			// This exception should occur because a single person should have
			// no spouse.
		}

		try {
			t = new TaxCalculator("John Adams",
					TaxCalculatorInterface.HEAD_OF_HOUSEHOLD, 31, 23);
			fail();
		} catch (Exception e) {
			// This exception should occur because a single person should have
			// no spouse.
		}

		try {
			t = new TaxCalculator("John Adams",
					TaxCalculatorInterface.QUALIFYING_WIDOWER, 31, 23);
			fail();
		} catch (Exception e) {
			// This exception should occur because a single person should have
			// no spouse.
		}

	}

	/**
	 * This test will verify that the long form of the constructor works
	 * properly. This includes all types of single filing where there is not a
	 * spouse or a spouse's age.
	 * 
	 * @throws Exception
	 *             An exception will be thrown if the main program throws the
	 *             exception.
	 */
	@Test
	public void testLongConstructorMarriedFilingJointly() throws Exception {

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 31, 21);
		assertEquals(31, t.getAge());
		assertEquals(21, t.getSpouseAge());
		assertEquals(0.0, t.getGrossIncome());

	}

	/**
	 * This test will verify that the long form of the constructor works
	 * properly. This includes all types of single filing where there is not a
	 * spouse or a spouse's age.
	 * 
	 * @throws Exception
	 *             An exception will be thrown if the main program throws the
	 *             exception.
	 */
	@Test
	public void testLongConstructorMarriedFilingSeparately() throws Exception {

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_SEPARATELY, 31, 21);
		assertEquals(31, t.getAge());
		assertEquals(21, t.getSpouseAge());
		assertEquals(0.0, t.getGrossIncome());

	}

	/**
	 * This test will verify that the long form of the constructor works
	 * properly. This includes all types of single filing where there is not a
	 * spouse or a spouse's age.
	 * 
	 * @throws Exception
	 *             An exception will be thrown if the main program throws the
	 *             exception.
	 */
	@Test
	public void testLongConstructorInvalidParameters() throws Exception {
		try {
			t = new TaxCalculator("John Adams",
					TaxCalculatorInterface.MARRIED_FILING_JOINTLY, -1, 21);
			fail();
		} catch (Exception ex) {
		}

		try {
			t = new TaxCalculator("John Adams",
					TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 0, 21);
			fail();
		} catch (Exception ex) {
		}
	}

	/**
	 * This method will test the set income method to make certain it is
	 * functioning properly.
	 */
	@Test
	public void testSetIncome() {
		t.setGrossIncome(1);
		assertEquals(1, t.getGrossIncome(), 0.01);
		t.setGrossIncome(-1);
		assertEquals(1, t.getGrossIncome(), 0.01);
	}

	/**
	 * This method will verify that the getNetTaxRate calculation works properly
	 * for the module.
	 * 
	 * @throws Exception
	 */
	public void testGetNetTaxRateSingleAge31() throws Exception {
		t1 = new TaxCalculator("John Adams", TaxCalculator.SINGLE, 31);
		t1.setGrossIncome(5450);
		assertEquals(0, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(13474);
		assertEquals(5.95517292563456, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(13475);
		assertEquals(5.95547309833024, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(13476);
		assertEquals(5.95614425645592, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(37999);
		assertEquals(11.7926787547041, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(38000);
		assertEquals(11.7927631578947, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(38001);
		assertEquals(11.793110707613, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(84299);
		assertEquals(19.0464892821979, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(84300);
		assertEquals(19.0465599051008, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(84301);
		assertEquals(19.0466661130947, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(169999);
		assertEquals(23.5601209418879, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(170000);
		assertEquals(23.5601470588235, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(170001);
		assertEquals(23.5602025870436, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(363149);
		assertEquals(28.580946113028, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(363150);
		assertEquals(28.5809582817018, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(363151);
		assertEquals(28.5809759576595, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(405449);
		assertEquals(29.2506332485713, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(405450);
		assertEquals(29.2506474287828, t1.getNetTaxRate(), 0.001);
	}

	/**
	 * This method will verify that the getNetTaxRate calculation works properly
	 * for the module.
	 * 
	 * @throws Exception
	 */
	public void testGetNetTaxRateSingleAge65() throws Exception {
		t2 = new TaxCalculator("John Adams", TaxCalculator.SINGLE, 65);
		t2.setGrossIncome(6500);
		assertEquals(0, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(14524);
		assertEquals(5.52464885706417, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(14525);
		assertEquals(5.5249569707401, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(14526);
		assertEquals(5.52560925237505, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(39049);
		assertEquals(11.4755819611258, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(39050);
		assertEquals(11.4756722151088, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(39051);
		assertEquals(11.4760185398581, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(85349);
		assertEquals(18.8121712029432, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(85350);
		assertEquals(18.8122437024019, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(85351);
		assertEquals(18.8123513491348, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(171049);
		assertEquals(23.4154949751241, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(171050);
		assertEquals(23.4155217772581, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(171051);
		assertEquals(23.4155778101268, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(364199);
		assertEquals(28.4985461245089, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(364200);
		assertEquals(28.4985584843493, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(364201);
		assertEquals(28.4985763355949, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(406499);
		assertEquals(29.1750779214709, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(406500);
		assertEquals(29.1750922509225, t2.getNetTaxRate(), 0.001);

	}

	/**
	 * This method will verify that the getNetTaxRate calculation works properly
	 * for the module.
	 * 
	 * @throws Exception
	 */
	public void testGetNetTaxRateMarriedFilingSeparately31() throws Exception {
		t1 = new TaxCalculator("John Adams",
				TaxCalculator.MARRIED_FILING_SEPARATELY, 31, 31);
		t1.setGrossIncome(5450);
		assertEquals(0, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(13474);
		assertEquals(5.95517292563456, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(13475);
		assertEquals(5.95547309833024, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(13476);
		assertEquals(5.95614425645592, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(37999);
		assertEquals(11.7926787547041, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(38000);
		assertEquals(11.7927631578947, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(38001);
		assertEquals(11.793110707613, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(71174);
		assertEquals(17.9486188776801, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(71175);
		assertEquals(17.9487179487179, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(71176);
		assertEquals(17.948859166011, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(105599);
		assertEquals(21.2253146336613, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(105600);
		assertEquals(21.2253787878788, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(105601);
		assertEquals(21.2254902889177, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(184299);
		assertEquals(26.2533546031178, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(184300);
		assertEquals(26.2533912099837, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(184301);
		assertEquals(26.2534386682655, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(205449);
		assertEquals(27.1537705221247, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(205450);
		assertEquals(27.1538087125821, t1.getNetTaxRate(), 0.001);

	}

	/**
	 * This method will verify that the getNetTaxRate calculation works properly
	 * for the module.
	 * 
	 * @throws Exception
	 */
	public void testGetNetTaxRateHeadOfHousehold31() throws Exception {
		t1 = new TaxCalculator("John Adams", TaxCalculator.HEAD_OF_HOUSEHOLD,
				31);
		t1.setGrossIncome(8000);
		assertEquals(0, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(19449);
		assertEquals(5.88667797830223, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(19450);
		assertEquals(5.88688946015424, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(19451);
		assertEquals(5.88735797645365, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(51649);
		assertEquals(11.5681813781487, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(51650);
		assertEquals(11.568247821878, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(51651);
		assertEquals(11.5685078701284, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(120649);
		assertEquals(19.2498487347595, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(120650);
		assertEquals(19.2498963945296, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(120651);
		assertEquals(19.2499689186165, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(190399);
		assertEquals(22.4553280216808, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(190400);
		assertEquals(22.4553571428571, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(190401);
		assertEquals(22.4554125240939, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(365699);
		assertEquals(27.5099658462287, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(365700);
		assertEquals(27.5099808586273, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(365701);
		assertEquals(27.5100013398924, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(407999);
		assertEquals(28.286503153194, t1.getNetTaxRate(), 0.001);
		t1.setGrossIncome(408000);
		assertEquals(28.2865196078431, t1.getNetTaxRate(), 0.001);
	}

	/**
	 * This method will verify that the getNetTaxRate calculation works properly
	 * for the module.
	 * 
	 * @throws Exception
	 */
	public void testGetNetTaxRateHeadOfHouseholdAge65() throws Exception {
		t2 = new TaxCalculator("John Adams", TaxCalculator.HEAD_OF_HOUSEHOLD,
				65);
		t2.setGrossIncome(9050);
		assertEquals(0, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(20499);
		assertEquals(5.58515049514611, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(20500);
		assertEquals(5.58536585365854, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(20501);
		assertEquals(5.58582508170333, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(52699);
		assertEquals(11.3376914172944, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(52700);
		assertEquals(11.3377609108159, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(52701);
		assertEquals(11.3380201514203, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(121699);
		assertEquals(19.0837640407892, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(121700);
		assertEquals(19.0838126540674, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(121701);
		assertEquals(19.0838859171248, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(191449);
		assertEquals(22.3321720144791, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(191450);
		assertEquals(22.3322016192217, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(191451);
		assertEquals(22.3322573399982, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(366749);
		assertEquals(27.4312049930607, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(366750);
		assertEquals(27.4312201772324, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(366751);
		assertEquals(27.4312408146126, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(409049);
		assertEquals(28.213893689998, t2.getNetTaxRate(), 0.001);
		t2.setGrossIncome(409050);
		assertEquals(28.2139102799169, t2.getNetTaxRate(), 0.001);
	}

	@Test
	/**
	 * This method will verify that the get taxable income method is working properly.
	 * @throws Exception
	 */
	public void testGetTaxableIncomeSingleAge31() throws Exception {
		t1 = new TaxCalculator("John Adams", TaxCalculator.SINGLE, 31);
		t1.setGrossIncome(5450);
		assertEquals(0, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(13474);
		assertEquals(8024, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(13475);
		assertEquals(8025, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(13476);
		assertEquals(8026, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(37999);
		assertEquals(32549, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(38000);
		assertEquals(32550, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(38001);
		assertEquals(32551, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(84299);
		assertEquals(78849, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(84300);
		assertEquals(78850, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(84301);
		assertEquals(78851, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(169999);
		assertEquals(164549, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(170000);
		assertEquals(164550, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(170001);
		assertEquals(164551, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(363149);
		assertEquals(357699, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(363150);
		assertEquals(357700, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(363151);
		assertEquals(357701, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(405449);
		assertEquals(399999, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(405450);
		assertEquals(400000, t1.getTaxableIncome(), 0.01);
	}

	@Test
	/**
	 * This method will verify that the get taxable income method is working properly.
	 * @throws Exception
	 */
	public void testGetTaxableIncomeHeadOfHouseholdAge31() throws Exception {
		t1 = new TaxCalculator("John Adams", TaxCalculator.HEAD_OF_HOUSEHOLD,
				31);
		t1.setGrossIncome(8000);
		assertEquals(0, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(19449);
		assertEquals(11449, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(19450);
		assertEquals(11450, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(19451);
		assertEquals(11451, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(51649);
		assertEquals(43649, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(51650);
		assertEquals(43650, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(51651);
		assertEquals(43651, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(120649);
		assertEquals(112649, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(120650);
		assertEquals(112650, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(120651);
		assertEquals(112651, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(190399);
		assertEquals(182399, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(190400);
		assertEquals(182400, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(190401);
		assertEquals(182401, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(365699);
		assertEquals(357699, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(365700);
		assertEquals(357700, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(365701);
		assertEquals(357701, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(407999);
		assertEquals(399999, t1.getTaxableIncome(), 0.01);
		t1.setGrossIncome(408000);
		assertEquals(400000, t1.getTaxableIncome(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionSingle31() throws Exception {
		// Set up to test single.
		t = new TaxCalculator("John Adams", TaxCalculatorInterface.SINGLE, 31);
		assertEquals(5450, t.getStandardDeduction(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionSingle65() throws Exception {

		t = new TaxCalculator("John Adams", TaxCalculatorInterface.SINGLE, 65);
		assertEquals(5450 + 1050, t.getStandardDeduction(), 0.01);

	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionMarriedFilingSeparately31()
			throws Exception {

		// Set up to test married filing separately.
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_SEPARATELY, 31, 31);
		assertEquals(5450, t.getStandardDeduction(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionMarriuedFilingSeparately65()
			throws Exception {

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_SEPARATELY, 65, 66);
		assertEquals(5450 + 1050, t.getStandardDeduction(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionHeadOfHousehold31() throws Exception {

		// Set up to test head of household.
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.HEAD_OF_HOUSEHOLD, 31);
		assertEquals(8000, t.getStandardDeduction(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionHeadOfHousehold65() throws Exception {

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.HEAD_OF_HOUSEHOLD, 65);
		assertEquals(8000 + 1050, t.getStandardDeduction(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionQualifyingWidower31() throws Exception {

		// Set up to test head of household.
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.QUALIFYING_WIDOWER, 31);
		assertEquals(10900, t.getStandardDeduction(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionQualifyingWidower65() throws Exception {

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.QUALIFYING_WIDOWER, 65);
		assertEquals(10900 + 1050, t.getStandardDeduction(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionMarriedFilingJointly31() throws Exception {

		// Set up to test Married filing jointly.
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 31, 31);
		assertEquals(10900, t.getStandardDeduction(), 0.01);
	}

	@Test
	/**
	 * This method will test that the standardDeductionMethod is working properly for the given criteria.
	 * @throws Exception
	 */
	public void testStandardDeductionMarriedFilingJointly65() throws Exception {

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 65, 65);
		assertEquals(1050 + 1050 + 10900, t.getStandardDeduction(), 0.01);

	}

	@Test
	/**
	 *This method will test if a return is required for the given criteria.  The criteria is defined in the name of the method.
	 * @throws Exception
	 */
	public void testReturnRequiredSingle31() throws Exception {
		// Set up to test single.
		t = new TaxCalculator("John Adams", TaxCalculatorInterface.SINGLE, 31);
		t.setGrossIncome(8949.00);
		assertEquals(false, t.isReturnRequired());

		t.setGrossIncome(8950.00);
		assertEquals(true, t.isReturnRequired());

		t.setGrossIncome(8951.00);
		assertEquals(true, t.isReturnRequired());
	}

	@Test
	/**
	 *This method will test if a return is required for the given criteria.  The criteria is defined in the name of the method.
	 * @throws Exception
	 */
	public void testReturnRequiredSingle65() throws Exception {

		t = new TaxCalculator("John Adams", TaxCalculatorInterface.SINGLE, 65);
		t.setGrossIncome(10299.00);
		assertEquals(false, t.isReturnRequired());

		t.setGrossIncome(10300.00);
		assertEquals(true, t.isReturnRequired());

		t.setGrossIncome(10301.00);
		assertEquals(true, t.isReturnRequired());

	}

	@Test
	/**
	 *This method will test if a return is required for the given criteria.  The criteria is defined in the name of the method.
	 * @throws Exception
	 */
	public void testReturnRequiredHeadOfHousehold31() throws Exception {

		// Set up to test head of household.
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.HEAD_OF_HOUSEHOLD, 31);
		t.setGrossIncome(11499);
		assertEquals(false, t.isReturnRequired());

		t.setGrossIncome(11500.00);
		assertEquals(true, t.isReturnRequired());

		t.setGrossIncome(11501.00);
		assertEquals(true, t.isReturnRequired());
	}

	@Test
	/**
	 *This method will test if a return is required for the given criteria.  The criteria is defined in the name of the method.
	 * @throws Exception
	 */
	public void testReturnRequiredQualifyingWidower31() throws Exception {

		// Set up to test head of household.
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.QUALIFYING_WIDOWER, 31);
		t.setGrossIncome(14399);
		assertEquals(false, t.isReturnRequired());

		t.setGrossIncome(14400);
		assertEquals(true, t.isReturnRequired());

		t.setGrossIncome(14401);
		assertEquals(true, t.isReturnRequired());
	}

	@Test
	/**
	 *This method will test if a return is required for the given criteria.  The criteria is defined in the name of the method.
	 * @throws Exception
	 */
	public void testReturnRequiredQualifyingWidower65() throws Exception {

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.QUALIFYING_WIDOWER, 65);
		t.setGrossIncome(15449);
		assertEquals(false, t.isReturnRequired());

		t.setGrossIncome(15450);
		assertEquals(true, t.isReturnRequired());

		t.setGrossIncome(15451);
		assertEquals(true, t.isReturnRequired());
	}

	@Test
	/**
	 *This method will test if a return is required for the given criteria.  The criteria is defined in the name of the method.
	 * @throws Exception
	 */
	public void testReturnRequiredMarriedFilingJointly31() throws Exception {

		// Set up to test Married filing jointly.
		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 31, 31);
		t.setGrossIncome(17899);
		assertEquals(false, t.isReturnRequired());

		t.setGrossIncome(17900);
		assertEquals(true, t.isReturnRequired());

		t.setGrossIncome(17901);
		assertEquals(true, t.isReturnRequired());

	}

	@Test
	/**
	 *This method will test if a return is required for the given criteria.  The criteria is defined in the name of the method.
	 * @throws Exception
	 */
	public void testReturnRequiredMarriedFilingJointly65() throws Exception {

		t = new TaxCalculator("John Adams",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 65, 65);
		t.setGrossIncome(19999);
		assertEquals(false, t.isReturnRequired());

		t.setGrossIncome(20000);
		assertEquals(true, t.isReturnRequired());

		t.setGrossIncome(20001);
		assertEquals(true, t.isReturnRequired());
	}
	
	@Test
	/**
	 * Method tests get and setName
	 */
	public void testGetAndSet() throws Exception {
		TaxCalculator tax = new TaxCalculator("John Smith",
				TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 40, 40);
		tax.setName("Bob Smith");
		assertEquals("Bob Smith", tax.getName());
	}
	
	@Test
	/**
	 * Method tests empty name
	 */
	public void testEmptyName() {
		try {
			TaxCalculator tax = new TaxCalculator("",
					TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 40, 40);
			fail("did not throw exception");
		} catch (Exception e) {}
	}

	@Test
	/**
	 * Method tests no last name
	 */
	public void testOnlyFirstName() {
		try {
			TaxCalculator tax = new TaxCalculator("Bob",
					TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 40, 40);
			fail("did not throw exception");
		} catch (Exception e) {}
	}

	@Test
	/**
	 * Method tests empty name
	 */
	public void testSingleEmptyName() {
		try {
			TaxCalculator tax = new TaxCalculator("",
					TaxCalculatorInterface.SINGLE, 40);
			fail("did not throw exception");
		} catch (Exception e) {}
	}

	@Test
	/**
	 * Method tests no last name
	 */
	public void testSingleOnlyFirstName() {
		try {
			TaxCalculator tax = new TaxCalculator("Bob",
					TaxCalculatorInterface.SINGLE, 40);
			fail("did not throw exception");
		} catch (Exception e) {}
	}

	@Test
	/**
	 * Method tests spouse age at zero
	 */
	public void testSpouseAgeZero() {
		try {
			TaxCalculator tax = new TaxCalculator("Bob Smith",
					TaxCalculatorInterface.MARRIED_FILING_JOINTLY, 40, 0);
			fail("did not throw exception");
		} catch (Exception e) {}
	}

	/**
	 * Method tests an age of zero
	 */
	@Test
	public void testSingleAgeZero() {
		try {
			TaxCalculator tax = new TaxCalculator("Bob Smith",
					TaxCalculatorInterface.SINGLE, 0);
			fail("did not throw exception");
		} catch (Exception e) {}
	}

	@Test
	/**
	 * Tests all boundary conditions and combinations around jointly filing
	 * couples' ages
	 * @throws Exception
	 */
	public void testMarriedJointAgeBounds() throws Exception{
		int ageBound = 65;
		String name = "Bob smith";
		TaxCalculator tmp;
		double stdDeduct;

		for(int i = -1; i <= 1; i++){
			for(int j = -1; j <= 1; j++){
				tmp = new TaxCalculator(name, TaxCalculatorInterface.MARRIED_FILING_JOINTLY, i+ageBound, j+ageBound);
				if(i < 0 && j < 0){
					stdDeduct = 10900.0;
					tmp.setGrossIncome(17900.0 - 1.0);
				}else if(i < 0 || j < 0){
					stdDeduct = 11950.0;
					tmp.setGrossIncome(18950.0 - 1.0);
				}else{
					stdDeduct = 13000.0;
					tmp.setGrossIncome(20000.0 - 1.0);
				}
				assertEquals(stdDeduct, tmp.getStandardDeduction());
				assertEquals(false, tmp.isReturnRequired());
			}
		}
	}
	
	@Test
	/**
	 * Tests to be sure that the absolute value logic in getTaxableIncome()
	 * operates properly
	 * @throws Exception
	 */
	public void testTaxableIncomeBounds() throws Exception{
		double stdDeduct = 5450;
		TaxCalculator tmp = new TaxCalculator("Bob Marley", TaxCalculatorInterface.SINGLE, 42);
		for(int i = -3; i <= 3; i++){
			tmp.setGrossIncome(stdDeduct + i);
			if(i <= 0){
				assertEquals(0.0, tmp.getTaxableIncome());
			}else{
				assertEquals((double)i, tmp.getTaxableIncome());
			}
		}
	}
	
	@Test
	/**
	 * Tests to make sure the gross income is reset to 0 only if 0 is passed,
	 * not if a negative number is passed
	 * @throws Exception
	 */
	public void testGrossIncomeReset() throws Exception{
		TaxCalculator tmp = new TaxCalculator("Bob Marley", TaxCalculatorInterface.SINGLE, 42);
		tmp.setGrossIncome(100.0);
		assertEquals(100.0, tmp.getGrossIncome());
		tmp.setGrossIncome(-1);
		assertEquals(100.0, tmp.getGrossIncome());
		tmp.setGrossIncome(0);
		assertEquals(0.0, tmp.getGrossIncome());
	}
}