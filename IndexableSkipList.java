public class IndexableSkipList extends AbstractSkipList {
    final protected double probability;
    public IndexableSkipList(double probability) {
        super();
        this.probability = probability;
    }

    @Override
    public SkipListNode find(int key) {
        SkipListNode curr = head;
        for (int i = head.height() ; i >= 0 ; i--) {
            while (curr.getNext(i) != null && curr.getNext(i).key() <= key){
                curr = curr.getNext(i);
            }
        }
        return curr;
    }

    @Override
    public int generateHeight() {
        int height = 0;
        while (Math.random() < probability){
            height++;
        }
        return height;
    }

    public int rank(int key) {
        SkipListNode current = head;
        int count = 0;

        for (int level = current.height(); level >= 0; level--) {
            while (current.getNext(level)!= null && current.getNext(level).key() < key) {
                count += current.getSize(level);
                current = current.getNext(level);
            }
        }
        return count;
    }

    public int select(int index) {
        SkipListNode current = head; // Start from the head of the skip list
        int count = -1; // Initialize count to -1 because head is not a valid element
        for (int level = current.height(); level >= 0; level--) {
            while (current.getNext(level) != null && count + current.getSize(level) < index+1) {
                count += current.getSize(level);
                current = current.getNext(level);
            }
        }
        return current.key();
    }

}
