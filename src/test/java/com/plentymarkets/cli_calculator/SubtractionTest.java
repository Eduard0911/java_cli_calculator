package com.plentymarkets.cli_calculator;

import junit.framework.TestCase;

/**
 * Created by praktikant on 03.11.15.
 */
public class SubtractionTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    private class Subtraction
    {
        private final int zahl1;
        private final int zahl2;
        private int result;

        public Subtraction(int zahl1, int zahl2)
        {
            this.zahl1 = zahl1;
            this.zahl2 = zahl2;
        }

        public void doSubtract()
        {
            this.result = this.zahl1 - this.zahl2;
        }

        public int getResult()
        {
            return this.result;
        }
        {assertTrue( true );}
   }}

