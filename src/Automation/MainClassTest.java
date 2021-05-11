package Automation;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int a = getLocalNumber();

        if (a == 14) {
            System.out.println("Число равно 14");
        } else {
            System.out.println("Ошибка! Число не равно 14");
        }
    }

    @Test
    public void testGetClassNumber()
    {
        int actual = 45;
        int number = getClassNumber();

        Assert.assertTrue("the method getClassNumber return number < 45", number > actual);
    }

    @Test
    public void testGetClassString()
    {
        String actualString = getClassString();
        String expectedSubstring1 = "hello";
        String expectedSubstring2 = "Hello";

        Assert.assertTrue("the method getClassString did not contain \"hello\" or \"Hello\" ", actualString.contains(expectedSubstring1) || actualString.contains(expectedSubstring2));
    }
}