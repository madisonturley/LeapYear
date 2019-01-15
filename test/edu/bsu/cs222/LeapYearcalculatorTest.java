package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearcalculatorTest {
    @Test
    public void
    test2004IsLeapYear(){
        LeapYearCalculator leapYear = new LeapYearCalculator();
        boolean result = leapYear.isLeapYear(2004);
        Assert.assertTrue(result);
    }
}
