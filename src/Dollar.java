public class Dollar extends Currency{

    private String currencyName;

    //default constructor
    public Dollar() {
        super();
        this.currencyName = "Dollar";
    }

    //constructor that takes in a value
    public Dollar(double value) {
        super(value);
        this.currencyName = "Dollar";
    }
    
    //constructor that takes in a dollar object
    public Dollar(Dollar dollar) {
        super(dollar);
        this.currencyName = dollar.currencyName;
    }

    //returns the currency name
    @Override
    public String getCurencyName() {
        return currencyName;
    }
}


