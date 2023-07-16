public class Dollar extends Currency{

    private String currencyName;

    public Dollar() {
        super();
        this.currencyName = "Dollar";
    }

    public Dollar(double value) {
        super(value);
        this.currencyName = "Dollar";
    }

    public Dollar(Dollar dollar) {
        super(dollar);
        this.currencyName = dollar.currencyName;
    }

    @Override
    public String getCurencyName() {
        return currencyName;
    }
}
