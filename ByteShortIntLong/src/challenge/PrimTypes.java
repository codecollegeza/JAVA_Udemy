package challenge;

public class PrimTypes {

    public static void main(String[] args) {
        byte myByte = 122;
        short myShort = 3000;
        int myInt = 504569;
        long myLong = 50000L + ((myByte + myShort + myInt) * 10);

        System.out.println(myLong);

    }
}
