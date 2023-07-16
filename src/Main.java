import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
        // Currency pound in first index and Dollar in second index.
        Currency[] currencies = new Currency[2];
        currencies[0] = new Pound();
        currencies[1] = new Dollar();
        
        System.out.println("Currencies in use: ");
        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        /*
         * while (input not q)
         * get 2nd letter
         * then get the number
         * if p or d add to dollar or pound
         */

        String op = ""; // operation (add a / subtract s)
        String cur; //currency type (pound p / dollar d)
        String type;
        double value; //value of currency (double)
        
        while(op != "q") {
        	
        	System.out.println("Enter pound or dollar object: ");
        	
        	op = scan.next();
            cur = scan.next();
            value = scan.nextDouble();
            type = scan.next();
            
            
            System.out.println(op + " " + cur + " " + value);
            
            if (op.equals("a")) {

        		if (cur.equals("p")) {
        			currencies[0].add(new Pound(value));
        			//System.out.println(currencies[0]);
//        			System.out.println(currencies[0].getWhole());
//        			System.out.println(currencies[0].getFraction());
//        			System.out.println(currencies[0].toString());
;        		}else {
        			currencies[1].add(new Dollar(value));
        		}
        	}else if (op.equals("s")) {
        		if (cur.equals("p")) {
        			currencies[0].subtract(new Pound(value));
        		}else {
        			currencies[1].subtract(new Dollar(value));
        		}
        	}
            System.out.println("Currencies in use: ");
            for (Currency currency : currencies) {
                System.out.println(currency);
            }
            
        }
    }
}