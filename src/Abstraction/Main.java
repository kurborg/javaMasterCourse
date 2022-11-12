package Abstraction;

public class Main {

    public static void main(String[] args){
        MyLinkedList list = new MyLinkedList(null);

        System.out.println("\n\n______________ LINKED LIST ______________\n");

        list.traverse(list.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");

        for(String s : data){
            boolean added = list.addItem(new Node(s));

            if(added)
                System.out.println("Item " + s + " Added");
        }

        System.out.println("\nPrinting List...");
        list.traverse(list.getRoot());

        list.removeItem(new Node("Adelaide"));

        System.out.println("\nPrinting List...");
        list.traverse(list.getRoot());

        System.out.println("\n\n______________ SEARCH TREE ______________\n");

        SearchTree tree = new SearchTree(null);

        tree.traverse(tree.getRoot());

        String stringData2 = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data2 = stringData2.split(" ");

        for(String s : data2){
            boolean added = tree.addItem(new Node(s));

            if(added)
                System.out.println("Item " + s + " Added");
        }

        System.out.println("\nPrinting List...");
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("Adelaide"));
        System.out.println("\nPrinting List...");
        tree.traverse(tree.getRoot());
    }
}
