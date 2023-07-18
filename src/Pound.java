public class Pound extends Currency{

    private String currencyName;


    // Constructor
    public Pound() {
        super();
        this.currencyName = "Pound";
    }

    //constructor that takes in vale
    public Pound(Double value) {
        super(value);
        this.currencyName = "Pound";
    }

    //constructor that takes in pound object
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
