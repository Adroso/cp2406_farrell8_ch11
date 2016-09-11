package EX4;

/**
 * Created by Adroso360 on 11/09/2016.
 */
public class DomesticDivision extends Division
{
    protected String state;
    public DomesticDivision(String title, int acct, String st)
    {
        super(title, acct);
        state = st;
    }
    public void display()
    {
        System.out.println("Domestic Division: " +
                divisionTitle + "  Acct #" + acctNum +
                "\nLocated in " + state);
    }
}