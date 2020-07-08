package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String emptyString = "";
        for (int i = start; i < stop; i = i + 2){
            String numberString = Integer.toString(i);
            emptyString = emptyString.concat(numberString);
        }
        return emptyString;
    }
    

    public static String getOddNumbers(int start, int stop) {
        String emptyString = "";
        for (int i = start+1; i < stop; i = i + 2){
            String numberString = Integer.toString(i);
            emptyString = emptyString.concat(numberString);
        }
        return emptyString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
                String emptyString = "";
                Integer container = 0;
            for (int i = start; i < stop; i += step){  
                container = container + i;
                container = i * i;
                String numberString = Integer.toString(container);
                emptyString = emptyString.concat(numberString);
            }
            return emptyString;
    }

    public static String getRange(int start, int stop) {
        String emptyString = "";
        for (int i = start; i < stop; i++){
            String numberString = Integer.toString(i);
            emptyString = emptyString.concat(numberString);
        }
        return emptyString;
    }

    //public static String getRange(int start, int stop) {
    //    return null;
    //}


    public static String getRange(int start, int stop, int step) {
        String emptyString = "";
        for (int i = start; i < stop; i += step){
            String numberString = Integer.toString(i);
            emptyString = emptyString.concat(numberString);
        }

        return emptyString;
        
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String emptyString = "";
                Integer container = 0;
            for (int i = start; i < stop; i += step){  
                container = container + i;
                container = i * i;
                String numberString = Integer.toString(container);
                emptyString = emptyString.concat(numberString);
            }
            return emptyString;
    }
}
