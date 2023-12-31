import java.util.Scanner;


/*
 * Authors: Nicholas Kang, Brandon Arriaga
 * Group 10 JAVA
 *
 * Lab 2
 *
 * Purpose: Use classes, inheritance and polymorphism to prompt user for currencies and calculate currencies
 *
 */

/*
 * Authors: Nicholas Kang, Brandon Arriaga
 * Group 10 JAVA
 * 
 * Lab 3 
 * 
 * Purpose: Use classes, inheritance and polymorphism to prompt user for currencies and calculate currencies
 * 
 */


public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        // Currency pound in first index and Dollar in second index.
        Currency[] currencies = new Currency[2];
        currencies[0] = new Pound();
        currencies[1] = new Dollar();

        

        //display the currencies and their values
        System.out.println("Currencies in use: ");
        for (Currency currency : currencies) {
            System.out.println(currency);
        }



        String op = ""; // operation (add a / subtract s)
        String cur; //currency type (pound p / dollar d)
        String type;
        double value; //value of currency (double)


        String quit = " ";
        while (!quit.equals("q")) {
            System.out.println("Enter pound or dollar object: ");


            op = scan.next();
            cur = scan.next();
            value = scan.nextDouble();
            type = scan.next();


            if (op.equals("a")) {


                try {
                    if (cur.equals("p") && type.equals("pound")) {

                        currencies[0].add(new Pound(value));

                    } else if (cur.equals("d") && type.equals("dollar")) {

                        currencies[1].add(new Dollar(value));
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException exception) {
                    System.out.println("Invalid Addition");
                }


            } else if (op.equals("s")) {

                try {
                    if (cur.equals("p") && type.equals("pound")) {

                        currencies[0].subtract(new Pound(value));

                    } else if (cur.equals("d") && type.equals("dollar")) {

                        currencies[1].subtract(new Dollar(value));
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException exception) {
                    System.out.println("Invalid Subtraction");
                }



            }
            for (Currency currency : currencies) {
                System.out.println(currency.toString());
            }



            System.out.println("q to quit or any other key to continue: ");
            quit = scan.next();

        }
    }
}