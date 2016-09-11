package EX5;

/**
 * Created by Adroso360 on 11/09/2016.
 */
public abstract class Element
{
    String symbol;
    int atomicNumber;
    double atomicWeight;
    public Element(String s, int an, double aw)
    {
        symbol = s;
        atomicNumber =an;
        atomicWeight = aw;
    }
    public String getSymbol()
    {
        return symbol;
    }
    public int getAtomicNumber()
    {
        return atomicNumber;
    }
    public double getAtomicWeight()
    {
        return atomicWeight;
    }
    public abstract void describeElement();
}