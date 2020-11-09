package challenges;

import java.util.ArrayList;

public class ContactList {

    private final ArrayList<String> names = new ArrayList<>();
    private final ArrayList<String> numbers = new ArrayList<>();

    public void addNameAndNum(String name, String number) {
        names.add(name);
        numbers.add(number);
    }

    private void modifyContact(int namePos, String newName, String newNum) {
        names.set(namePos, newName);
        numbers.set(namePos, newNum);
    }

    public void modifyContact(String oldName, String newName, String newNum) {
        int namePos = names.indexOf(oldName);
        if (namePos >= 0) {
            modifyContact(namePos, newName, newNum);
        }
    }

    public void removeContact(int position) {
        names.remove(position);
        numbers.remove(position);
    }

    public void removeContact(String name) {
        int index = names.indexOf(name);
        if (index >= 0) {
            removeContact(index);
        }
    }

    public boolean inContacts(String name) {
        return names.contains(name);
    }

    public void printContacts() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ": " + numbers.get(i));
        }
    }
}
