package hbcu.stay.ready.mastering_loops;

public class TableUtilities {


    private static String buildTableRow(Integer index){        
        String response = "  ";
        for (int j = 1; j < 6; j++){
            int currentValue = j * index;
            response = response.concat(Integer.toString(currentValue)).concat("  |");
            if (j < 5){
                response = response.concat(" ");
            }
        }
        return response;
    }

    public static String getSmallMultiplicationTable() {
        String emptyString = "";
        for(int x = 1; x < 6 ; x++){
            
            emptyString += buildTableRow(x) + "\n";
        }
        

        return emptyString;
    }

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
