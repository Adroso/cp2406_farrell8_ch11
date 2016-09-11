package EX3;

/**
 * Created by Adroso360 on 11/09/2016.
 */
public abstract class NewspaperSubscription {
    protected String name;
    protected String address;
    protected double rate;
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getAddress()
    {
        return address;
    }
    public double getRate()
    {
        return rate;
    }
    public abstract void setAddress(String s);
}
