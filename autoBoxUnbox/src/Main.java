import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // since you cannot use primitive types in an arrayList, will have to use classes
//        ArrayList<int> ....  -> cannot do this
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        // auto boxing and unboxing happen at runtime, so don't have to write
        // redundant code.
        Integer myIntValue = new Integer(54); // manual boxing
        int primIntValue = myIntValue.intValue(); // manual unboxing

        Integer newIntValue = 54; // auto-boxing
        int newPrimIntValue = newIntValue; // auto-unboxing
    }
}
