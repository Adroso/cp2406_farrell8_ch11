package EX4;

/**
 * Created by Adroso360 on 11/09/2016.
 */
public abstract class Division {
    protected String divisionTitle;
    protected int acctNum;
    public Division(String title, int acct)
    {
        divisionTitle = title;
        acctNum = acct;
    }
    public abstract void display();
}
