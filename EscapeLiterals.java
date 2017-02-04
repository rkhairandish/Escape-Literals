package escape.literals;

public class EscapeLiterals {

    public static void main(String[] args) {
        //String containing a formatted table title and column headings
        String header = "\n\tNEW YORK 3 DAY FORECAST:\n" ;
        header += "\n\tDay\t\tHigh\tLow\tConditions\n" ;
        header += "\t---\t\t----\t---\t----------\n" ;
        
        //String containing formatted table cell data
        String forecast = "\tSunday\t\t68F\t48F\tSunny\n" ;
        header += "\tMonday\t\t69F\t57F\tSunny\n";
        header += "\tTuesday\t\t71F\t50F\tCloudy\n" ;
        
        //This line will Output both formatted String values 
        System.out.println(header + forecast);   
    }
}
