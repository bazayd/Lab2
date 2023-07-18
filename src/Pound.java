/*
 * Authors: Nicholas Kang, Brandon Arriaga
 * Group 10 JAVA
 *
 * Lab 2
 *
 * Purpose: Creates object of Pound that is used in Currency and array of currencies
 *  that can be subtracted and added.
 *
 */
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

    /*
     * Method that gets the name of currency
     *
     * pre:
     * No argument taken
     *
     * post:
     *      return: String (name of currency)
     *
     *@Override object from extended class Currency
     * return name of currency, "Pound"
     */
    @Override
    public String getCurencyName() {
        return currencyName;
    }
}
