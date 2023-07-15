public abstract class Currency {
     private int whole;

     private int fraction;

     // Default Construction
     public Currency() {
         this.whole = 0;
         this.fraction = 0;
     }

     // Construction based on double
     public Currency(double value) {
         if (value < 0) {
             throw new IllegalArgumentException("Currency value can't be negative.");
         }

         this.whole = (int) value;
         this.fraction = (int) (value - whole);
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

    public Currency add(Currency other) {
         if (!this.getClass().equals(other.getClass())) {
             throw new IllegalArgumentException("Cannot add two different currencies.");
         }

         int wholeAdd = this.whole + other.whole;
         int fractionAdd = this.fraction + other.fraction;

         if (fractionAdd >= 100) {
             ++wholeAdd;
             fractionAdd -= 100;
         }
         return other;


    }

    public int add() {
        return 1;
    }

    public int subtract() {
        return 1;
    }

    public boolean isEqual() {
        return false;
    }

    public boolean isGreater() {
        return false;
    }

    public String toString() {
        return " ";
    }
}
