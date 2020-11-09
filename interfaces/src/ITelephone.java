// Basic interface
// Only specify method names here that has to be used.

public interface ITelephone {

    void powerOn();

    void dial(int number);

    void answer();

    boolean callPhone(int number);

    boolean isRinging();
}
