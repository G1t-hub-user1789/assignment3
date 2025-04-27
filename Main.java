public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = MyTestingClass.random();
            table.put(key, "Student" + i);
        }

        table.printBuckets();
        System.out.println("Total elements in HashTable: " + table.size());

        System.out.println();

        BST<Integer, String> bst = new BST<>();
        bst.put(5, "Five");
        bst.put(3, "Three");
        bst.put(7, "Seven");

        System.out.println("Total elements in BST: " + bst.size());

        for (BST<Integer, String>.Node node : bst) {
            System.out.println("Key: " + node.getKey() + ", Value: " + node.getValue());
        }
    }
}
