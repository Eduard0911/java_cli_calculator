package com.plentymarkets.cli_calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SumTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SumTest(String testName)
    {
        super( testName );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDoSum()
    {
        double zahl1 = 1;
        double zahl2 = 1;


        Sum sum = new Sum(zahl1, zahl2);
        sum.doSum();
        double result = sum.getResult();

        assertTrue( result == 2 );
    }
}
