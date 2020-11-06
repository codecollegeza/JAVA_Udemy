public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(45, false);

        System.out.println("Printer toner level: " + printer.getTonerLevel() + "\n"
                + "DuplexPrinter: " + printer.isDuplexPrinter());

        printer.fillToner(40.25);
        printer.printPages(8);

        System.out.println("\nPrinter toner level: " + printer.getTonerLevel() + "\n"
                + "Number of pages printed: " + printer.getNumberOfPrintedPages());
    }
}
