package Abstraction;

public class Node extends ListItem{

    public Node(Object value) {
        super(value);
    }
    
    @Override
    ListItem next(){
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item){
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ListItem previous(){
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item){
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ListItem item){
        if(item != null){
            // returns -1 if compared item is greater than this item
            // returns 1 if compared item is less than this item
            // returns 0 if compared item is the same as this item
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
        
    }
}
