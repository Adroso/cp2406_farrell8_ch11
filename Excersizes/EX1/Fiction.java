package EX1;

/**
 * Created by Adroso360 on 11/09/2016.
 */
public class Fiction  extends Book
{
    public Fiction(String title)
    {
        super(title);
        setPrice();
    }

    public void setPrice()
    {
        super.bookPrice = 24.99;
    }

}
