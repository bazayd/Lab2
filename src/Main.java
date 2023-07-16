
public class Main {


    public static void main(String[] args) {


        // Currency pound in first index and Dollar in second index.
        Currency[] currencies = new Currency[2];
        currencies[0] = new Pound();
        currencies[1] = new Dollar();

        System.out.println("Currencies in use: ");
        for (Currency currency : currencies) {
            System.out.println(currency);
        }



    }
}