import java.util.Scanner;

public class Tester {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter one of these task numbers:");
	    System.out.println("For the warm up tasks: 2.1, 2.2, 2.3");
	    System.out.println("For the dynamic set tasks: 3.0 for all, 3.1 = search, 3.2 = insert, and so on...");
	    System.out.println("For the DataStructure tasks: 4.0 for all, 4.1 = Insert, 4.2 = delete, and so on... \n");
	    double taskNumber = scanner.nextDouble();
	    
	    if((int)taskNumber == 2) {
	    	task2_1();
	    	task2_2();
	    	task2_3();
	    }
	    else if(taskNumber == 2.1)
	    	task2_1();
	    else if(taskNumber == 2.2)
	    	task2_2();
	    else if(taskNumber == 2.3)
	    	task2_3();
	    else if((int)taskNumber == 3) {
			MyDynamicSet<Integer> set = new MyDynamicSet<Integer>();
			for(int i =0;i<18;i=i+2) {
				set.insert(new Element<Integer>(i,i));
			}
			for(int i =1;i<20;i=i+2) {
				set.insert(new Element<Integer>(i,i));
			}
	    	if(taskNumber==3.0) {
	    		task3Search(set);
	    		task3Minimum(set);
	    		task3Maximum(set);
	    		task3Successor(set);
	    		task3Predecessor(set);
	    		task3Delete(set);
	    	}
	    	if(taskNumber==3.1) {
	    		task3Search(set);
	    	}
	    	if(taskNumber==3.2) {
	    		task3Insert(set);
	    	}
	    	if(taskNumber==3.3) {
	    		task3Delete(set);
	    	}
	    	if(taskNumber==3.4) {
	    		task3Minimum(set);
	    	}
	    	if(taskNumber==3.5) {
	    		task3Maximum(set);
	    	}
	    	if(taskNumber==3.6) {
	    		task3Successor(set);
	    	}
	    	if(taskNumber==3.7) {
	    		task3Predecessor(set);
	    	}
	    }
	    else if((int)taskNumber == 4) {
			MyDataStructure data = new MyDataStructure();
			if(taskNumber ==4.0) {
				task4Insert(data);
				data = new MyDataStructure();
				task4Delete(data);
				data = new MyDataStructure();
				task4MedianQuality(data);
				data = new MyDataStructure();
				task4AvgQuality(data);
				data = new MyDataStructure();
				task4JunkWorst(data);
				data = new MyDataStructure();

			}
			if(taskNumber==4.1) {
				task4Insert(data);
			}
			if(taskNumber==4.2) {
				task4Delete(data);
			}
			if(taskNumber==4.3) {
				task4MedianQuality(data);
			}
			if(taskNumber==4.4) {
				task4AvgQuality(data);
			}
			if(taskNumber==4.5) {
				task4JunkWorst(data);
			}
	    }
	    else
		    System.out.println("There is no such task.");

	}
	
	public static void task2_1() {
		System.out.println("Test 2.1a: Empty");
		MyArray<Integer> arr1 = new MyArray<Integer>();
		System.out.println("Original Array:" + arr1.toString());
		arr1.reverse();
		System.out.println("New Array:" +arr1.toString()+"\n");
		
		System.out.println("Test 2.1b: 1 element");
		MyArray<Integer> arr4 = new MyArray<Integer>();
		arr4.insert(new ArrayElement<Integer>(0,0));
		System.out.println("Original Array:" + arr4.toString());
		arr4.reverse();
		System.out.println("New Array:" +arr4.toString()+"\n");
		
		System.out.println("Test 2.1c: 2 elements");
		MyArray<Integer> arr2 = new MyArray<Integer>();
		arr2.insert(new ArrayElement<Integer>(0,0));
		arr2.insert(new ArrayElement<Integer>(1,1));
		System.out.println("Original Array:" + arr2.toString());
		arr2.reverse();
		System.out.println("New Array:" +arr2.toString()+"\n");
		
		System.out.println("Test 2.1d: 10 elements");
		MyArray<Integer> arr3 = new MyArray<Integer>();
		for(int i =0;i<10;i++) {
			arr3.insert(new ArrayElement<Integer>(i,i));
		}
		System.out.println("Original Array:" + arr3.toString());
		arr3.reverse();
		System.out.println("New Array:" +arr3.toString()+"\n");
	}

	public static void task2_2() {
		System.out.println("Test 2.2a: empty");
		MyLinkedList<Integer> list4 = new MyLinkedList<Integer>();
		System.out.println("Original list:" + list4.toString());
		list4.reverse();
		System.out.println("New list:" +list4.toString()+"\n");
		
		System.out.println("Test 2.2b: 1 element");
		MyLinkedList<Integer> list3 = new MyLinkedList<Integer>();
		list3.insert(new Link<Integer>(0,0));
		System.out.println("Original list:" + list3.toString());
		list3.reverse();
		System.out.println("New list:" +list3.toString()+"\n");
		
		System.out.println("Test 2.2c: 2 elements");
		MyLinkedList<Integer> list2 = new MyLinkedList<Integer>();
		list2.insert(new Link<Integer>(0,0));
		list2.insert(new Link<Integer>(1,1));
		System.out.println("Original list:" + list2.toString());
		list2.reverse();
		System.out.println("New list:" +list2.toString()+"\n");
		
		System.out.println("Test 2.2d: 10 elements");
		MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
		for(int i =0;i<10;i++) {
			list1.insert(new Link<Integer>(i,i));
		}
		System.out.println("Original list:" + list1.toString());
		list1.reverse();
		System.out.println("New list:" +list1.toString()+"\n");
	}
	
	public static void task2_3() {
		MyAVLTree<Integer> tree = new MyAVLTree<Integer>();
		System.out.println("Test 2.3a: empty");
		System.out.println("Max Depth: " +tree.depthOfMax() + ", Should be: -1 \n");
		for(int i =0;i<9;i++) {
			tree.insert(new TreeNode<Integer>(i,i));
		}
		System.out.println("Test 2.3b: 10 elements");
		System.out.println("Max Depth: " +tree.depthOfMax() + ", Should be: 3 \n");
		
	}
	
	public static void task3Search(MyDynamicSet<Integer> set) {
		System.out.println("Test 3 search:");
		System.out.println("Search of -1: " + set.search(-1) + ", Should be: null (non existent below)");
		System.out.println("Search of 20: " + set.search(18) + ", Should be: null (non existent in the middle)");
		System.out.println("Search of 30: " + set.search(30) + ", Should be: null (non existent above)");
		System.out.println("Search of 0: " + set.search(0) + ", Should be: [0] (minimum search)");
		System.out.println("Search of 19: " + set.search(19) + ", Should be: [19]  (maximum search)\n");

	}
	public static void task3Insert(MyDynamicSet<Integer> set) {
		System.out.println("Test 3 Insert: It is tested by the other functions. If using array, make sure you are expand it to work dynamically.");
	}
	
	public static void task3Delete(MyDynamicSet<Integer> set) {
		System.out.println("Test 3 delete:");
		set.delete(set.search(0)); 		set.delete(set.search(19)); 		set.delete(set.search(10));
		System.out.println("Minimum: " +set.minimum() + ", Should be: [1]");
		System.out.println("Maximum: " +set.maximum() + ", Should be: [17]");
		System.out.println("Successor of 9: " +set.successor(set.search(9)) + ", Should be: [11] \n");
	}
	
	public static void task3Minimum(MyDynamicSet<Integer> set) {
		System.out.println("Test 3 Minimum:");
		System.out.println("Minimum: " +set.minimum() + ", Should be: [0] \n");
	}
	
	public static void task3Maximum(MyDynamicSet<Integer> set) {
		System.out.println("Test 3 Maximum:");
		System.out.println("Maximum: " +set.maximum() + ", Should be: [19] \n");
	}
	
	public static void task3Successor(MyDynamicSet<Integer> set) {
		System.out.println("Test 3 Successor:");
		System.out.println("Successor of 4: " +set.successor(set.search(4)) + ", Should be: [5]");
		System.out.println("Successor of 19: " +set.successor(set.search(19)) + ", Should be: null \n");
	}
	
	public static void task3Predecessor(MyDynamicSet<Integer> set) {
		System.out.println("Test 3 Predecessor:");
		System.out.println("Predecessor of 19: " +set.predecessor(set.search(19)) + ", Should be: [17]");
		System.out.println("Predecessor of 0: " +set.predecessor(set.search(0)) + ", Should be: null \n");

	}

	public static void task4Insert(MyDataStructure data) {
		System.out.println("Test 4 Insert:");
		for(int i=0;i<50;i++) {
			data.insert(i, i%6);
		}
		System.out.println("Didnt Fail \n");
	}
	
	public static void task4Delete(MyDataStructure data) {
		System.out.println("Test 4 Delete:");
		data.delete(1); 		
		data.delete(5); 
		System.out.println("Empty Delete: Didnt Fail");
		for(int i=0;i<50;i++) {
			data.insert(i, i%6);
		}
		data.delete(5); 		
		data.delete(0); 
		data.delete(55);
		data.delete(-5); 
		System.out.println("Delete: Didnt Fail \n");
	}
	
	public static void task4MedianQuality(MyDataStructure data) {
		System.out.println("Test 4 MedianQuality:");
		System.out.println("0 Elements: yours: " + data.medianQuality() +", should be: -1");
		for(int i=0;i<50;i++) {
			data.insert(i, i%6);
		}
		System.out.println("50 elements: yours: " + data.medianQuality() +", should be: 2");
		data.delete(2); 
		data.delete(8); 
		data.delete(14); 		
		data.delete(20); 
		data.delete(26); 
		data.delete(32);

		System.out.println("43 elements: yours: " + data.medianQuality() +", should be: 3 \n");
	}
	
	public static void task4AvgQuality(MyDataStructure data) {
		System.out.println("Test 4 AvgQuality:");
		System.out.println("0 Elements: yours: " + data.avgQuality() +", should be: -1");
		for(int i=0;i<50;i++) {
			data.insert(i, i%6);
		}
		System.out.println("50 elements: yours: " + data.avgQuality() +", should be: 2.42");
		data.delete(2); 
		data.delete(5); 
		data.delete(3);
		
		System.out.println("47 elements: yours: " + data.avgQuality() +", should be: 2.361702 \n");
	}
	
	public static void task4JunkWorst(MyDataStructure data) {
		System.out.println("Test 4 JunkWorst:");
		System.out.println("0 Elements: yours: " + data.junkWorst().toString() +", should be: -empty- ");
		for(int i=0;i<50;i++) {
			data.insert(i, i%6);
		}
		System.out.println("50 elements: yours: " + data.junkWorst().toString() +", should be: [48][42][36][30][24][18][12][6][0]");
		System.out.println("New Average: yours: " + data.avgQuality() +", should be: 2.951219");
		System.out.println("New Median: yours: " + data.medianQuality() +", should be: 3 \n");

	}
	

}
