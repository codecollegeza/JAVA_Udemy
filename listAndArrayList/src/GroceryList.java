import java.util.ArrayList;

public class GroceryList {
    // an array list is basically a normal array with much more functionality
    // it is a class that implements the List interface

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        // this is how to add an item to an arraylist
        // since you can't specify a starting index to add value.
        groceryList.add(item);
    }

    public void printList() {
        System.out.println("You have " + groceryList.size() + " items in your basket.");

        // if you want to access items in an arrayList, use its .get() method
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

//    public void modifyItem(int position, String newItem) {
//        // if you want to change something in an arrayList
//        groceryList.set(position, newItem);
//    }
//
//    public void removeItem(int position) {
//        String item = groceryList.get(position);
//        groceryList.remove(position);
//        System.out.println("removed " + item);
//    }
//
//    public String finditem(String searchItem) {
////        boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem); // looks for index of matching case
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;
//    }

    // here is simpler version of above code
    private void modifyItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void modifyItem(String currItem, String newItem) {
        int position = finditem(currItem);
        if (position >= 0) {
            modifyItem(position, newItem);
        }
    }

    private void removeItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("removed " + item);
    }
    public void removeItem(String item) {
        int position = finditem(item);
        if (position >= 0) {
            removeItem(position);
        }
    }

    private int finditem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = finditem(searchItem);
        return position >= 0;
    }
}
