//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        skiplisttest();
    }
    public static void skiplisttest(){
//        IndexableSkipList skipList = new IndexableSkipList(0.5);
        for(int i= 0; i < 10;i++) {
            IndexableSkipList skipList = new IndexableSkipList(0.5);
            skipList.insert(5);
            skipList.insert(7);
            skipList.insert(11);
            skipList.insert(12);
            skipList.insert(25);
            System.out.println(skipList.select(4));
        }
//        System.out.println(skipList.toString());
//        for(int i= 0; i < 1;i++){
//            int a = skipList.rank(15);
//            System.out.println(a);}
//        System.out.println(skipList.toString());
    }
    public static void hashtest(){
//        System.out.println(Integer.MAX_VALUE + (long) ((Math.random() * (Long.MAX_VALUE - (long) Integer.MAX_VALUE))));
        System.out.println(1 + (int) (Math.random() * (Integer.MAX_VALUE - 1)));
    }
}