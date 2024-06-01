import java.util.LinkedList;

public class MyDataStructure {
    /*
     * You may add any fields that you wish to add.
     * Remember that the use of built-in Java classes is not allowed,
     * the only variables types you can use are:
     * 	-	the given classes in the assignment
     * 	-	basic arrays
     * 	-	primitive variables
     */
    private final MyAVLTree<Product>[] AVList;
    private MyLinkedList<Product> ZeroLinklist;
    private final int[] productlist;

    /***
     * This function is the Init function.
     */
    public MyDataStructure() {
        this.AVList = new MyAVLTree[6];
        for (int i = 0; i < 6; i++) {
            AVList[i] = new MyAVLTree<>();
        }
        this.productlist = new int[6];
        this.ZeroLinklist = new MyLinkedList<>();
    }

    public void insert(int id, int quality) {
        Product prod = new Product(id, quality);
        TreeNode<Product> node = new TreeNode<>(id, prod);
        if (quality == 0) {
            Link<Product> link = new Link<>(id, prod);
            node.setLink(link);
            ZeroLinklist.insert(link);
        }
        AVList[quality].insert(node);
        productlist[quality]++;
    }

    public void delete(int id) {
        TreeNode<Product> toremove = null;
        for (int i = 0; i < 6 & toremove == null; i++) {
            toremove = AVList[i].search(id);
        }
        if (toremove != null) {
            int quality = toremove.satelliteData().quality();
            if (quality == 0) {
                ZeroLinklist.delete(toremove.getlink());
            }
            AVList[quality].delete(toremove);
            productlist[quality]--;
        }
    }

    public int medianQuality() {
        int productnum = countProducts();
        if (productnum == 0){return -1;}
        int median;
        if (productnum % 2 == 0) {
            median = productnum / 2;
        } else {
            median = productnum / 2 + 1;
        }
        int counter = 0;
        boolean found = false;
        for (int i = 0; i < 6 & !found; i++) {
            counter += productlist[i];
            if (counter >= median) {
                median = i;
                found = true;
            }
        }
        return median;
    }

    public double avgQuality() {
        int sum = qualitySum();
        int productnum = countProducts();
        if (productnum == 0){
            return -1;
        }
        return (double) sum / productnum;
    }

    public MyLinkedList<Product> junkWorst() {
        MyLinkedList<Product> output = ZeroLinklist;
        ZeroLinklist = new MyLinkedList<>();
        AVList[0] = new MyAVLTree<>();
        productlist[0] = 0;
        return output;
    }
    private int countProducts(){
        int productnum = 0;
        for (int i = 0; i < 6; i++) {
            productnum = productnum + productlist[i];
        }
        return productnum;
    }
    public int qualitySum(){
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum = sum + (productlist[i] * i);
        }
        return sum;
    }
}
