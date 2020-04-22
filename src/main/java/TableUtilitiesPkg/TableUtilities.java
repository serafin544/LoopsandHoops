package TableUtilitiesPkg;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String s = "";
        for (int i = 1; i <= 4 ; i++){
            for(int m = 1; m <= 4; m ++){
                //int x = i *2
                int y = m *2;
                int x =  (m  *i)  ;
                if( x > 9){
                    s += " " + x + " | ";

                }else{
                    s += "  " + x + " | ";
                }



            }
            s += "\n";
        }
        return s;
    }

    public static String getLargeMultiplicationTable() {
        String l = "";
        for (int i = 1; i <= 10 ; i++){
            for(int m = 1; m <= 10; m ++){
                //int x = i *2
                int y = m *2;
                int x =  (m  *i)  ;

                if( x > 9){
                    l += " " + x + " | ";

                }else if(x >99){

                    l += "" + x + "|";


                }else{
                    l += "  " + x + " | ";
                }


            }
            l += "\n";
        }
        return l;
    }

    public static String getMultiplicationTable(int tableSize) {
        String s = "";
        for (int i = 1; i <= tableSize ; i++){
            for(int m = 1; m <= tableSize; m ++){
                //int x = i *2
                int y = m *2;
                int x =  (m  *i)  ;


                if( x > 9){
                    s += " " + x + " |";

                }else if(x >99){

                    s += "" + x + "|";


                }else{
                    s += "  " + x + " | ";
                }


            }
            s += "\n";
        }
        return s;
    }
}
