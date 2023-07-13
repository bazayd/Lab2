// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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

    static class Dollar extends Currency {
        public String currencyName;

    }

    static class Pound extends Currency {
        public String currencyName;

    }



    public static void main(String[] args) {

    }
}