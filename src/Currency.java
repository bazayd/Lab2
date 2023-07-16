import static java.lang.Character.getName;
import java.lang.Math;

public abstract class Currency {
     private int whole;

     private int fraction;

     // Default Construction
     /*
      *  two integer attributes:
      *  whole number -> currency note value
      *  fraction -> currency coin value
      */
     public Currency() {
         this.whole = 0;
         this.fraction = 0;
     }

     // Construction based on double
     /*
      * value cannot be less than 0
      */
     public Currency(double value) {
         if (value < 0) {
             throw new IllegalArgumentException("Currency value can't be negative.");
         }

         this.whole = (int) value;
         this.fraction = (int) (Math.round(((value - whole)*100.0)));
         //System.out.println("this frac: " + this.fraction + " f" + Math.round(((value - whole)*100.0)));
     }

     // Copy constructor with input as type Currency
     public Currency(Currency other) {
         this.whole = other.whole;
         this.fraction = other.fraction;
     }

     public abstract String getCurencyName();

     // Getter for whole
     public int getWhole() {
         return whole;
     }

     // Getter for fraction
     public int getFraction() {
         return fraction;
     }

     // Setter for whole
    public void setWhole(int whole) {
         if (whole < 0) {
             throw new IllegalArgumentException("Whole part can't be a negative number.");
         }

        this.whole = whole;
    }

    // Setter for fraction
    public void setFraction(int fraction) {
        if (fraction < 0) {
            throw new IllegalArgumentException("Fraction part can't be a negative number.");
        }

        this.fraction = fraction;
    }


    /*
    Method that adds a currency to the array depending on type of currency
    Pre: currency type (Dollar or Pound)
    Post:
        the result of adding input object of same currency


    if (Currency does not equal input currency)
        Error thrown that states different currencies cannot be added together
       end if
    integer totalWhole = current whole amount of currency + currency inputted by user
    integer totalFraction = current fractional amount of currency + currency inputted by user



     */
    public void add(Currency currency) {
        if (!this.getClass().equals(currency.getClass())) {
            throw new IllegalArgumentException("Cannot add currencies of different types.");
        }
        int totalWhole = this.whole + currency.whole;
        int totalFraction = this.fraction + currency.fraction;
        //System.out.println("totFrac " + totalFraction + "curFrac " + currency.fraction);
        this.whole = totalWhole + (totalFraction / 100);
        this.fraction = totalFraction % 100;
        //System.out.println("After: " + this.fraction);
        
    }

    /*
     *  Method that subtracts a currency to the array depending on type of currency
    Pre:
    	currency type (Dollar or Pound)
    Post:
		the result of subtracting input object of same currency
     */
    public void subtract(Currency currency) {
        if (!this.getClass().equals(currency.getClass())) {
            throw new IllegalArgumentException("Cannot subtract currencies of different types.");
        }
        int totalWhole = this.whole * 100 + this.whole;
        int subtractWholePart = currency.whole * 100 + currency.fraction;
        if (totalWhole < subtractWholePart) {
            throw new IllegalArgumentException("Cannot subtract a larger currency value from a smaller one.");
        }
        int result = totalWhole - subtractWholePart;
        this.whole = result / 100;
        this.fraction = result % 100;
    }

    /*
     * Method that compares input object of same currency for equality
    Pre:
    Post:
        return true or false

    returns boolean that determines if whole currency number from Currency class is equal to user inputted currency and likewise for fraction numbers.
     */
    public boolean isEqual(Currency currency) {
        return this.whole == currency.whole && this.fraction == currency.fraction;
    }
    
    /*
     * Method that compares input object of same currency to find out which object is greater/smaller
     * 
     * pre:
     * currency type (Dollar or Pound)
     * 
     * post:
     * boolean result of whether the input object is greater or not
     * 
     */
    public boolean isGreater(Currency currency) {
        if (!this.getClass().equals(currency.getClass())) {
            throw new IllegalArgumentException("Cannot compare currencies of different types.");
        }
        int totalWhole = this.whole * 100 + this.fraction;
        int compareWhole = currency.whole * 100 + currency.fraction;
        return totalWhole > compareWhole;
    }

    /*
     * Method that stringifies a name and value of a currency object
     * 
     * pre:
     * currency type (Dollar or Pound)
     * 
     * post:
     * a string that displays the name and value
     */
    public String toString() {
        return String.format("%d.%02d %s", whole, fraction, getCurencyName());
    }
}
