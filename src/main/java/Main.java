import NumberUtilitiesPkg.NumberUtilities;
import TableUtilitiesPkg.TableUtilities;
import TriangleUtilitiesPkg.TriangleUtilities;

public class Main {
    public static void main(String[] args) {
        //Get Range 1
        String outcome = NumberUtilities.getRange(11);
        System.out.println(outcome);

        //Get Range 2
        String outcome2 = NumberUtilities.getRange(5,11);
        System.out.println(outcome2);

        // Get Range 3
        String outcome3 = NumberUtilities.getRange(5,20,5);
        System.out.println(outcome3);

        //Get Even numbers 4
        String outcome4 = NumberUtilities.getEvenNumbers(5,20);
        System.out.println(outcome4);

        //Get odds
      String outcome5 = NumberUtilities.getOddNumbers(5,20);
        System.out.println(outcome5);

        String outcome6 = NumberUtilities.getExponentiations(1,4,3);
        System.out.println(outcome6);



        String o = TriangleUtilities.getRow(10);
        System.out.println(o);

        System.out.println("david \n");
        String David = TriangleUtilities.getSmallTriangle();
        System.out.println(David);

        System.out.println("Najae \n");
        String Najae = TriangleUtilities.getLargeTriangle();
        System.out.println(Najae);


        System.out.println("Aubrey \n");
        String Aubrey = TriangleUtilities.getTriangle(15);
        System.out.println(Aubrey);


        System.out.println("Small multi");
        String Avg = TableUtilities.getSmallMultiplicationTable();
        System.out.println(Avg);


        System.out.println("Big chungus");
        String bigBoiii = TableUtilities.getLargeMultiplicationTable();
        System.out.println(bigBoiii);


        System.out.println("multi table pick a num");
        String tablefor2 = TableUtilities.getMultiplicationTable(15);
        System.out.println(tablefor2);


    }
}
