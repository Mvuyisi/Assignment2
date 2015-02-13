package za.ac.cput.assignment2;

/**
 * Hello world!
 *
 */
public class App 
{
    public float floatSum()
    {
        float sum = 10 + 10;
        return sum;
    }

    public float intSum()
    {
        int sum = 5 + 5;
        return sum;
    }

    public int equalNum()
    {
        return 6;
    }

    public int identicalNum()
    {
        return 6;
    }

    public boolean getTruth(){
        return true;
    }

    public boolean getFalse(){
        return false;
    }

    public String getNull(){
        String name = null;
        return name;
    }

    public String getNotNull(){
        String name = "mvuyisi";
        return name;
    }

    public double getTimeOut(double a, double b, double c)
    {
        return (a/b)*c;
    }

    public int [] getValues()
    {
        int a [] = {5, 10, 15, 20, 25};
        return a;
    }
}
