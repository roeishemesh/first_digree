import java.util.NoSuchElementException;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractSkipList {
    final protected SkipListNode head;
    final protected SkipListNode tail;

    public AbstractSkipList() {
        head = new SkipListNode(Integer.MIN_VALUE);
        tail = new SkipListNode(Integer.MAX_VALUE);
        increaseHeight();
    }

    public void increaseHeight() {
        head.addLevel(tail, null);
        tail.addLevel(null, head);

    }

    abstract SkipListNode find(int key);

    abstract public int generateHeight();

    public SkipListNode search(int key) {
        SkipListNode curr = find(key);

        return curr.key() == key ? curr : null;
    }

    public SkipListNode insert(int key) {
        int nodeHeight = generateHeight();


        while (nodeHeight > head.height()) {
            increaseHeight();
        }
        SkipListNode[] update = new SkipListNode[head.height +1];
        int[] rank = new int[head.height+2];
        SkipListNode prevNode = findAndRank(key,rank,update);
//        SkipListNode prevNode = find(key);
//        toString();
        if (prevNode.key() == key) {
            return null;
        }

        SkipListNode newNode = new SkipListNode(key);

        for (int level = 0; level <= nodeHeight && prevNode != null; ++level) {
            SkipListNode nextNode = prevNode.getNext(level);
            newNode.addLevel(nextNode, prevNode);

            prevNode.setNext(level, newNode);
            nextNode.setPrev(level, newNode);
            if(newNode.key() == 25 ){
                System.out.println(5);
            }
            newNode.size.set(level, prevNode.size.get(level) - (rank[0] - rank[level]));
            prevNode.size.set(level,(rank[0] - rank[level]) + 1);

            while (prevNode != null && prevNode.height() == level) {
                prevNode = prevNode.getPrev(level);
            }
        }
        for (int level = nodeHeight + 1; level <= head.height; level++) {
            update[level].increaseSize(level);
        }

        return newNode;
    }

    public boolean delete(SkipListNode skipListNode) {
        for (int level = 0; level <= skipListNode.height(); ++level) {
            SkipListNode prev = skipListNode.getPrev(level);
            SkipListNode next = skipListNode.getNext(level);
            prev.setNext(level, next);
            next.setPrev(level, prev);
        }

        return true;
    }

    public SkipListNode predecessor(SkipListNode skipListNode) {
        return skipListNode.getPrev(0);
    }

    public SkipListNode successor(SkipListNode skipListNode) {
        return skipListNode.getNext(0);
    }

    public SkipListNode minimum() {
        if (head.getNext(0) == tail) {
            throw new NoSuchElementException("Empty Linked-List");
        }

        return head.getNext(0);
    }

    public SkipListNode maximum() {
        if (tail.getPrev(0) == head) {
            throw new NoSuchElementException("Empty Linked-List");
        }

        return tail.getPrev(0);
    }

    private void levelToString(StringBuilder s, int level) {
        s.append("H    ");
        SkipListNode curr = head.getNext(0);

        while (curr != tail) {
            if (curr.height >= level) {
                s.append(curr.key());
                s.append("    ");
            }
            else {
            	s.append("    ");
            	for (int i = 0; i < curr.key().toString().length(); i = i + 1)
            		s.append(" ");
            }

            curr = curr.getNext(0);
        }

        s.append("T\n");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int level = head.height(); level >= 0; --level) {
            levelToString(str, level);
        }

        return str.toString();
    }
    public SkipListNode findAndRank(int key,int[] rank, SkipListNode[] update) {
        SkipListNode curr = head;
        for (int i = head.height() ; i >= 0 ; i--) {
            rank[i] = rank[i] + rank[i+1];
            while (curr.getNext(i) != null && curr.getNext(i).key() <= key){
                rank[i] += curr.size.get(i);
                curr = curr.getNext(i);
            }
            update[i] = curr;
        }
        return curr;
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static class SkipListNode extends Element<Integer, Object> {
        final private List<SkipListNode> next;
        final private List<SkipListNode> prev;
        private int height;
        private List<Integer> size;


        public SkipListNode(int key) {
        	super(key);
            next = new ArrayList<>();
            prev = new ArrayList<>();
            this.height = -1;
            this.size = new ArrayList<>();
            }

        public SkipListNode getPrev(int level) {
            if (level > height) {
                throw new IllegalStateException("Fetching height higher than current node height");
            }

            return prev.get(level);
        }

        public SkipListNode getNext(int level) {
            if (level > height) {
                throw new IllegalStateException("Fetching height higher than current node height");
            }

            return next.get(level);
        }

        public void setNext(int level, SkipListNode next) {
            if (level > height) {
                throw new IllegalStateException("Fetching height higher than current node height");
            }

            this.next.set(level, next);
        }

        public void setPrev(int level, SkipListNode prev) {
            if (level > height) {
                throw new IllegalStateException("Fetching height higher than current node height");
            }

            this.prev.set(level, prev);
        }

        public void addLevel(SkipListNode next, SkipListNode prev) {
            ++height;
            this.next.add(next);
            this.prev.add(prev);
            this.size.add(0);
        }

        public int height() { return height; }

        public int getSize(int height){
            return size.get(height);
        }
        public void increaseSize(int level){
            size.set(level,getSize(level)+1);
        }

    }

}
