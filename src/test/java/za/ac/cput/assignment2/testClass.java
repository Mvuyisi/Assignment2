package za.ac.cput.assignment2;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;


/**
 * Created by student on 2015/02/12.
 */
public class testClass extends TestCase{
    App myApp = new App();

    @Test
    public void testFloat() throws Exception
    {
        Assert.assertTrue((myApp.floatSum() == 20.0));
    }

    @Test
    public void testInt() throws Exception
    {
        Assert.assertTrue((myApp.intSum() == 10));
    }

    @Test
    public void testEquality() throws Exception
    {
        Assert.assertSame(myApp.equalNum(), 6);
    }

    @Test
    public void testIdentity() throws Exception
    {
        Assert.assertSame(myApp.identicalNum(), 6);
    }

    @Test
    public void testTruth() throws Exception
    {
        Assert.assertSame(myApp.getTruth(), true);
    }

    @Test
    public void testFalse() throws Exception
    {
        Assert.assertSame(myApp.getFalse(), false);
    }

    @Test
    public void testNull() throws Exception
    {
        Assert.assertNull(myApp.getNull(), null);
    }

    @Test
    public void testNotNull() throws Exception
    {
        Assert.assertNotNull(myApp.getNull(), "mvuyisi");
    }

    public void failTest() throws Exception
    {
        Assert.fail("Test failed");
    }

    @Test(timeout = 800)
    public void timeTest() throws Exception
    {
        double answer = myApp.getTimeOut(1158, 300, 12);
    }

    @Test
    public void arrayTest() throws Exception
    {
        int [] nums = {5, 10, 15, 20, 25};
        Assert.assertEquals(myApp.getValues(), nums);
    }
}
