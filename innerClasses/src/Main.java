import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        GearBox mcLaren = new GearBox(6);

        // this is how you would create an instance of an inner class -- if it is not private --
        // you reference it's outer class first , then the inner class with .notation
        // then to declare , you use the instance var name and .notation
//        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
//        System.out.println(first.driveSpeed(1000));

        // here is the outer class only but that ties to inner class
        mcLaren.addGear(1, 5.3);
        mcLaren.addGear(2, 10.6);
        mcLaren.addGear(3, 15.9);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.getWheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.getWheelSpeed(3000));

        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.getWheelSpeed(6000));

        System.out.println("==========================");

        // here is how you define a local class * NOTE WE ARE IN MAIN METHOD *
        class ClickListener implements Button.OnClickListener {

            ClickListener() {
                System.out.println("I've been attached.");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        }

        // now that we've created the local class, have to attach it to the button
        // declared above
        btnPrint.setOnClickListener(new ClickListener());
        listen();

        // here is how to declare an anonymous class
        // an anonymous class has no name and is instantiated when it is declared
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
