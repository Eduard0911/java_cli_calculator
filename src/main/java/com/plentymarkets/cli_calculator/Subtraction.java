package com.plentymarkets.cli_calculator;

/**
 * Created by praktikant on 03.11.15.
 */
public class Subtraction
{
    private final double zahl1;
    private final double zahl2;
    private double result;

    public Subtraction(double zahl1, double zahl2)
    {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }

    public void doSubtraction()
    {
        this.result = this.zahl1 - this.zahl2;
    }

    public double getResult()
    {
        return this.result;
    }

    public double getresult() {


        return 0;
    }
}
