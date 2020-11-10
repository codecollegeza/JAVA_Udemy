package challenges;

public interface NodeList {
    ListItem getRoot();

    void addItem(ListItem item);

    void removeItem(ListItem item);

    void traverse(ListItem root);
}
