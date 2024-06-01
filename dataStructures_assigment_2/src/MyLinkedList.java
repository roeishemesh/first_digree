public class MyLinkedList<T> {
    private Link<T> head;
    private Link<T> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    /***
     * Implement the following method.
     */
    public void reverse() {
    	Link<T> curr = head;
        while (curr != null){
            Link<T> temp = curr.getNext();
            curr.setNext(curr.getPrev());
            curr.setPrev(temp);
            curr = temp;
        }
        curr = tail;
        tail = head;
        head = curr;
    }
    
    /***
     * Assumes valid input (not null).
     */
    public void insert(Link<T> element) {
    	element.setNext(head);
    	element.setPrev(null);    
    	if (head != null)
    		head.setPrev(element);
    	else
    		tail = element;   	
    	head = element; 	
    }
    
    /***
     * Assumes valid input (pointer to link which is currentrently in the linked-list).
     */
    public void delete(Link<T> element) {
    	if (element == head && element == tail) {
            head = null;
            tail = null;
        } else if (element == head) {
    		head = head.getNext();
            head.setPrev(null);
        } else if (element == tail) {
            tail = tail.getPrev();
            tail.setNext(null);
        } else {
            element.getPrev().setNext(element.getNext());
            element.getNext().setPrev(element.getPrev());
        }                
    }

    public Link<T> search(int k) {
        Link<T> currentrent = head;
        while (currentrent != null) {
            if (currentrent.key() == k) {
                return currentrent;
            }
            currentrent = currentrent.getNext();
        }
        return null;
    }
    
    public Link<T> head(){
    	return this.head;
    }
    
    public Link<T> tail(){
    	return this.tail;
    }
    
    public boolean equals(Object other){
		boolean ans = true;        
		if (other instanceof MyLinkedList<?>) {
			MyLinkedList<?> castedOther = (MyLinkedList<?>) other;
			Link<T> thisCurrent = this.head();
			Link<T> otherCurrent = (Link<T>)castedOther.head();
			while (thisCurrent != null & otherCurrent != null & ans) {
				ans = ans & thisCurrent.equals(otherCurrent);
				thisCurrent = thisCurrent.getNext();
				otherCurrent = otherCurrent.getNext();
			}
			if (ans & (thisCurrent != null | otherCurrent != null))		// if after the while loop ans is true, and one of the lists was not scanned to the end, the lists are not equal.
				ans = false;
        }		
		else
			ans = false;
		
        return ans;
	}
    
    public String toString() {
    	String s = "";
    	Link<T> current = this.head();
    	while (current != null) {
    		s = s + current.toString();
    		current = current.getNext();
    	}
    	return s;
    }
    
}
