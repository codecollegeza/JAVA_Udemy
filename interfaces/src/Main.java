public class Main {
    public static void main(String[] args) {

        // cannot create an object (new) from an interface, only a reference
        // or just create an object -> DeskPhone phone = new Deskphone(...);
        ITelephone myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(54698);
        myPhone.answer();

        ITelephone mobilePhone = new MobilePhone(54897);
        mobilePhone.powerOn();
        mobilePhone.callPhone(5698635);
        mobilePhone.answer();
    }
}
