public class Pound extends Currency{

    private String currencyName;


    // Constructor
    public Pound() {
        super();
        this.currencyName = "Pound";
    }

    public Pound(Double value) {
        super(value);
        this.currencyName = "Pound";
    }

    public Pound(Pound pound) {
        super(pound);
        this.currencyName = pound.currencyName;
    }

    // Returns name of currency
    @Override
    public String getCurencyName() {
        return currencyName;
    }
}
