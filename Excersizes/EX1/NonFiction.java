package EX1;

/**
 * Created by Adroso360 on 11/09/2016.
 */
public class NonFiction  extends Book
{
    public NonFiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 37.99;
    }

}