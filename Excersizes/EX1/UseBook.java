package EX1;

/**
 * Created by Adroso360 on 11/09/2016.
 */
public class UseBook {
    public static void main(String[] args) {
        Fiction aNovel = new Fiction("Sir Chadericks Revenge");
        NonFiction aManual = new
                NonFiction("The life of a macbooks second wifes brothers freinds baby's mother mothers sister daughter husband son son");
        System.out.println("Fiction " +
                aNovel.getbookName() + " costs $" +
                aNovel.getPrice());
        System.out.println("Non-Fiction " +
                aManual.getbookName() + " costs $" +
                aManual.getPrice());
    }
}
