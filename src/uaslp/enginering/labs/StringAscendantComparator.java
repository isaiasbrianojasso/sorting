package uaslp.enginering.labs;

public class StringAscendantComparator implements Comparator {

    public int compare(Object left, Object right){
        String stringLeft = (String)left;
        String stringRight = (String)right;

        return stringRight.compareTo(stringLeft);
    }
}
