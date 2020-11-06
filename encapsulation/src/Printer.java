public class Printer {

    private double tonerLevel;
    private int numberOfPrintedPages = 0;
    private boolean isDuplexPrinter;

    public Printer(double tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Can only fill up to 100% capacity.");
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void fillToner(double amount) {
        if (amount > 0 && amount <= 100) {
            if ((tonerLevel + amount) != 100) {
                this.tonerLevel += amount;
            }
        } else {
            System.out.println("Toner can only be filled up to 100% cap.");
        }
    }

    public void printPages(int number) {
        if (number > 10) {
            System.out.println("Can only print 10 pages at a time.");
        } else {
            System.out.println("Printing " + number + " pages.");
            numberOfPrintedPages += number;
        }
    }
}
