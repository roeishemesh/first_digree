//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <T> void main(String[] args) {
//        DynamicSetTest();
        myDataStructure();
        System.out.println("H");

        }
    public static void createtree(){
        MyAVLTree<Integer> tree = new MyAVLTree<>();
        tree.insert(new TreeNode<Integer>(5,1));
        tree.insert(new TreeNode<Integer>(4,1));
        tree.insert(new TreeNode<Integer>(6,1));
        tree.insert(new TreeNode<Integer>(3,1));
        tree.insert(new TreeNode<Integer>(7,1));
        tree.insert(new TreeNode<Integer>(8,1));
        tree.insert(new TreeNode<Integer>(9,1));
        tree.insert(new TreeNode<Integer>(11,1));

        System.out.println(tree.depthOfMax());


    }
    public static <T> void Linklist(){
        MyLinkedList<T> list = new MyLinkedList();
        for (int i = 1; i < 2; i++) {
            Link<T> add = new Link<>(i);
            list.insert(add);
        }
        System.out.println(list.toString());
        System.out.println(list.head());
        System.out.println(list.tail());
        list.reverse();
        System.out.println(list);
        System.out.println(list.head());
        System.out.println(list.tail());
    }
    public static void DynamicSetTest(){
        MyDynamicSet<Integer> set = new MyDynamicSet<Integer>();
        ArrayElement<Integer> a = new ArrayElement<>(7);
        set.insert(new ArrayElement<>(-152));
        set.insert(new ArrayElement<>(0));
        set.insert(a);
//        System.out.println(a.index());
        set.insert(new ArrayElement<>(-3));
        set.insert(new ArrayElement<>(65));
        set.insert(new ArrayElement<>(2515515));
//        System.out.println(set.maximum());
//        System.out.println(set.minimum());
        System.out.println(set.toString());
        System.out.println(a.index());
        set.delete(a);
        System.out.println(set.toString());


//        System.out.println(set.predecessor(a));

//        System.out.println(set.toString());
//        set.insert(new Element<>(56));
    }
    public static <T> void myDataStructure(){
        MyDataStructure data = new  MyDataStructure();
        data.insert(1,0);
        data.insert(2,2);
        data.insert(67,1);
        data.insert(4,3);
        data.insert(45,5);
        data.insert(6,4);
        data.insert(7,0);
        data.insert(65,4);
        data.delete(67);
        data.delete(1);
        System.out.println(data.avgQuality());
        System.out.println(data.junkWorst());
    }
    }



