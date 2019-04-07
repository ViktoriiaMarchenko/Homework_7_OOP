package DZ;
import java.util.Comparator;



public class CompareShapeByColorName implements Comparator {
    @Override
    public int compare (Object o1, Object o2){

        int res = String.CASE_INSENSITIVE_ORDER.compare(o1.toString(), o2.toString());
        if (res == 0) {
            res = o1.toString().compareTo(o2.toString());
        }
        return res;
    }
};



/*public class CompareShapeByColorName implements Comparator {
    @Override
    public int compare (Object o1, Object o2){
        return o1.getColor().compareTo(o2.getColor());



    }
    }
*/