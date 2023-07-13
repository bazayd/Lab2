
public class Main {
    // Abstract base class
    abstract static class Currency {
        private int whole;
        private int fractional;

        public int add() {
            return 1;
        }

        public int substract() {
            return 1;
        }

        public boolean isEqual() {
            return false;
        }

        public boolean isGreat() {
            return false;
        }

        public String toString() {
            return " ";
        }

    }

    abstract static class Dollar extends Currency {
        public String currencyName;

    }

    abstract static class Pound extends Currency {
        public String currencyName;

    }



    public static void main(String[] args) {

    }
}