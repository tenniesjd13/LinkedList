
package linkedlist;

/**
 * Represents a single link object.
 * 
 * @author Joshua Tennies
 */
public class Link {
    public double data; //can replace with any kind of object
    public Link next;
    
    public Link(double data) {
        this.data = data;
        this.next = null;
    } 
    
    public String toString() {
        return data + "";
    }
    
    
}
