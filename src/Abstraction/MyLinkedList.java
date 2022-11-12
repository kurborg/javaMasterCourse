package Abstraction;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root){
        this.root = root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // List is empty so item becomes HEAD
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));

            if(comparison < 0){
                // newItem is greater so move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // no next so set newItem as next
                    // then set next item previous to current
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                // newItem is less than current
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                    return true;
                } else {
                    // no previous so set newItem becomes root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    this.root = newItem;
                    return true;
                }

            } else {
                // equal
                System.out.println(newItem.getValue() + " is already in the list.");
                return false;
            }
        }

        return false;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("\nDeleting item " + item.getValue());

            ListItem currentItem = this.root;
            
            while(currentItem != null){
                int comparison = currentItem.compareTo(item);

                if(comparison == 0){
                    // found item to delete
                    if(currentItem == this.root){
                        this.root = currentItem.next();
                    } else {
                        currentItem.previous().setNext(currentItem.next());
                        if(currentItem.next() != null){
                            currentItem.next().setPrevious(currentItem.previous());
                        }
                    }

                    return true;

                } else if (comparison < 0){
                    // current item is less than item to delete
                    // keep moving through list
                    currentItem = currentItem.next();
                } else { // comparson > 0
                    // item to delete is less than this item 
                    // which means item must not exist since we started at root
                    System.out.println("\nItem does not exist in List");
                    return false;
                }
            }

            // Reached end of list without reaching the item
            System.out.println("\nItem does not exist in List");
            return false;
        }

        
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if(root == null){
            System.out.println("\nList is empty!");
        } else{
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
        
        
        
    }
    
}
