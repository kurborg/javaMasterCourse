package Abstraction;

public class SearchTree implements NodeList{

    private ListItem root = null;

    public SearchTree(ListItem root){
        this.root = root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        
        if(this.root == null){
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;

        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);

            if(comparison < 0) {

                // newItem is greater than currentItem
                // move right if possible 
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if(comparison > 0){

                // newItem is less than currentItem
                // move left is possible
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else{
                //equal do not add to tree
                System.out.println("\nItem " + newItem.getValue() + " is already in List!");
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
            System.out.println("\nRemoving item " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while(currentItem != null){

            int comparison = currentItem.compareTo(item);
            if(comparison < 0){
                // new Item greater than current item
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if(comparison > 0){
                // new Item less than current item
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else{
                // equal so remove item 
                performRemoval(currentItem, parentItem);
                return true;
            }
        }

        return false;
    }

    private void performRemoval(ListItem item, ListItem parent){

        // remove item from the tree
        if(item.next() == null){
            // no right tree so make parent point to the left tree (may be null)
            if(parent.next() == item){
                // item is right child of its parent
                // set parent next to item's left tree since there is no right
                parent.setNext(item.previous());
            } else if (parent.previous() == item){
                // item is left child of its parent
                // set parent previous to item's left tree since there is no right
                parent.setPrevious(item.previous());
            } else{
                // parent must be item, which means we are at the root
                this.root = item.previous();
            }

        } else if (item.previous() == null){

            // no right tree so make parent point to the left tree (may be null)
            if(parent.next() == item){
                // item is right child of its parent
                // set parent next to item's left tree since there is no right
                parent.setNext(item.next());
            } else if (parent.previous() == item){
                // item is left child of its parent
                // set parent previous to item's left tree since there is no right
                parent.setPrevious(item.next());
            } else{
                // parent must be item, which means we are at the root
                this.root = item.previous();
            }

        } else {
            // neither left nor right are null
            // From right sub-tree, find the smallest value (i.e. the leftmost)
            ListItem currentItem = item.next();
            ListItem leftmostParent = item;

            while(currentItem.previous() != null){
                leftmostParent = currentItem;
                currentItem = currentItem.previous();
            }

            // Put smallest value in our node to be deleted
            item.setValue(currentItem.getValue());
            // and delete smallest
            if(leftmostParent == item){
                item.setNext(currentItem.next());
            } else {
                leftmostParent.setPrevious(currentItem.next());
            }

        }
    }

    @Override
    public void traverse(ListItem root) {
        
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
        
    }


}